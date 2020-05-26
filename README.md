# TextBlue Application

TextBlue Application Project.

## Development

### Prerequisites 

- Java 8 JDK
- Erlang OTP 22.1 - https://www.erlang.org/downloads/22.1
- MySQL Server 5.7
- MySQL Workbench(any latest version)
- Git Client
- Tomcat 8.5.38

### Steps

1. Get CodeBase

	- git clone https://github.com/cloud3tech/textblue-app.git

2. Setup App Server

	- Goto CATALINA_HOME\conf\catalina.properties and add the following at the end
		
		* shortHostname=localatl1
		* XMS_ADDRESS=http://69.89.12.146:81/default/   ##(Atlantla Lab XMS Server Url)
	
2. Setup DB Server

	- Import Data Dump from File from "scripts\agent511_2019-05-22.zip" after decompressing into MySQL Server using MySQL Workbench or mysql command line tool
	- Create DB User of the application
	
		CREATE USER 'agent511DbUser'@'%' IDENTIFIED BY 'GttYMc5xCbA=';
		GRANT ALL PRIVILEGES ON agent511.* TO 'agent511DbUser'@'%';
		FLUSH PRIVILEGES;

3. Setup Environment Variables

	- JAVA_HOME=<< base directory of java installation >>
	- ERLANG_HOME=<< base directory of Erlang installation >>
	- RABBITMQ_NODENAME=rabbit@localhost
	- CATALINA_HOME=<< base directory of tomcat zip >>
	- Add %ERLANG_HOME%\bin in PATH variable if missing.

4. Build/Run the Application

   Open Bash Shell/Git Bash, run the following command from project base directory
   
		./deploy.sh
	
	The above command builds and deploys the war into Tomcat and starts the Tomcat Server.
	
5. Access the Web Application

	- Access Chat Simulator UI -> http://localhost:8080/demo/new-ui/simulator.html
		
	- Access Admin UI -> http://localhost:8080/demo/new-ui/AdminDashboard.jsp?newUI=true&lang=en-US
	
			Login Credentials -> nypd_admin/test or super_user/test

### Additonal Info

	- The application uses `Agent511Props_localatl1.properties` under src\main\resources for the configuration.
	
	- In Order to debug the application, you can set catalina properties such as:

		CATALINA_OPTS="-Xdebug -Xrunjdwp:transport=dt_socket,address=5005,server=y,suspend=n"
	

#### Jenkins Builds

  * [Beta job](http://jenkins.a511.net/view/MSPREPO/job/textblue-gradle-beta/)
  * [Beta job java 1.6](http://jenkins.a511.net/view/MSPREPO/job/textblue-gradle-beta-java6/)
  * [Release Job](http://jenkins.a511.net/view/MSPREPO/job/textblue-gradle-release/)
  * [Patch job](http://jenkins.a511.net/view/MSPREPO/job/textblue-gradle-patch/)
  
  
#### TextBlue API's

### RabbitMQ 

## Diagnostic - Connection - GET

    /demo/diagnostic/rabbitmq/connection
    
Checks if TextBlue application can connect to it's embedded RabbitMQ server:
# Response:    
    {
        status: "UP",
        message: "Successfully connected to localhost : 5672"
    }

## Diagnostic - execute - GET

    /demo/diagnostic/rabbitmq/execute

# Parameters:

    command = a command to be executed under rabbitmqctl
    
# Example request:

    /demo/diagnostic/rabbitmq/execute?command=list_queues
    
# Response:     

    Listing queues ...
    CallDisconnectedEventQueue	0
    chat.event.queue	0
    TextCallsEventsQueue	0
    MonitorIncomingEventsQueue	0
    rapi.elligible.event.queue	0
    InterestingEventsQueue	0
    IncomingCallEventQueue	0
    TpiEventLoggingQueue	0
    
## Diagnostic service - Unassigned calls  - GET

The diagnostic controller to identify unassigned calls (calls in queue): 
    
    http://localhost/demo/diagnostic/ucd?t=<time in seconds> 
    
Example:
 
    http://localhost/demo/diagnostic/ucd?t=5
    
This will return a HTTP status of 200 (OK) if there are no calls which have been unassigned for longer than `t` seconds. This will return a non 200 HTTP status code (like 515) if there are one or more calls which have been unassigned for longer than `t` seconds. The body will provide details for calls which are unassigned.

Example output of successful (no calls in queue for longer than `t` seconds):

 **HTTP/1.1 200 OK**

    {
      "overall status" : "NORMAL",
      "message" : "No active unassigned conversations exist in the system."
    }
    
Example output of error condition (calls in queue for longer than `t` seconds):

** HTTP/1.1 515 515**
        
		{
          "overall status" : "ERROR",
          "message" : "Unassigned conversations exist in the system.",
          "PSAPs" : [ {
            "PSAP id" : "1",
            "conversations" : [ {
              "conversation id" : "280746",
              "queue id" : "1",
              "last update" : "2018-06-14 17:19:00 EDT"
            } ]
          } ]
        }
