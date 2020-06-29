# Java Bridge for Stocknote API

   Official Java Bridge for accessing Stocknote API
   
   This documentation covers details of the Java bridge / SDK provided by SAMCO, for accessing the 
   
   <a href="https://developers.stocknote.com/api/?python#stocknote-api-documentation">SAMCO Stocknote APIs.</a>

## Overview

   - Java SDK is created for clients to easily access our Stocknote API platform from Java based applications.
   
   - Java SDK will be exposed as a downloadable JAR file
   
   - Include the JAR file into their build path and access the trade APIs using the inbuilt classes in Java SDK
   
   - Different Java methods will be exposed in the SDK for handling the multiple Stocknote APIs
   
   - As an initial step, the client will use the Login method and in the Java response bean object, they will get user session identifier. Based on the user session identifier, they can able to access other API’s
   
   - Client can process the API response appropriately
   
   - With trade API being a REST based interface and interfaces using JSON request and response messages, Java SDK provides request and response objects as native Java beans (after will be appropriate de-serialisation)
   
   - Through SamcoHttpConnection constructor we can pass the environment name which they want to connect 
   
   - If doesn't provide any environment then Java SDK by default invokes production version of trade api 

### Prerequisites 

- Java 7 JDK or Java 8 JDK

### Steps

1. Get Java Bridge Jar

	- Goto https://github.com/Thasarathan/samco/tree/master/dist

2. Setup Jar File

	- Goto << JavaBuild Path --> Libraries --> Add External JARs... >>
	
	                           or
				   
	- Install jar file into your local .m2 repository using this cmd ...
	
	  mvn install:install-file -Dfile="where the jar is located" -DgroupId=in.samco -DartifactId=stockNoteJavaSDK -		  Dversion=0.0.1-SNAPSHOT -Dpackaging=jar
	

3. Setup Environment Variables

	- JAVA_HOME = << base directory of java installation >>
	
4. Add Dependency into pom.xml file

        	<dependency>
		           <groupId>in.samco</groupId>
		           <artifactId>stockNoteJavaSDK</artifactId>
		           <version>0.0.1-SNAPSHOT</version>
	           </dependency>
		   
      - to print preety json you can add this dependency into our pom.xml
		   
		     <dependency>
		 	  <groupId>com.fasterxml.jackson.core</groupId>
			  <artifactId>jackson-databind</artifactId>
			  <version>2.9.8</version>
		     </dependency>

5. Access the Java Bridge Api

	- Java Bridge Application main class is SamcoHttpConnection 
	
	- There are two ways to create the object 
	
	- Creating object with zero parameterized constructor then by defalut we are connecting with production environment

	    EX :  SamcoHttpConnection httpConnection = new SamcoHttpConnection();
	  
	- Creating object with single parameterized constructor , environment variable as the parameter which we need to               connect
	
	    Ex : SamcoHttpConnection httpConnection = new SamcoHttpConnection("uat");

