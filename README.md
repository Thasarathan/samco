# Java Bridge for Trade Api Application

StockNote Application Project.

## Overview

    - Java SDK is created for clients to easily access our Stocknote API platform from Java based applications.
    
    - Java SDK will be exposed as a downloadable JAR file

    - Include the JAR file into their build path and access the trade APIs using the inbuilt classes in Java SDK
    
    - Different Java methods will be exposed in the SDK for handling the multiple Stocknote APIs
    
    - As an initial step, the client will use the Login method and in the Java response bean object, they will get user   	session identifier. Based on the user session identifier, they can able to access other API’s
    
    - Client can process the API response appropriately
    
    - With trade API being a REST based interface and interfaces using JSON request and response messages, Java SDK provides 	   request and response objects as native Java beans (after will be appropriate de-serialisation)
    
    - Through SamcoHttpConnection constructor we can pass the environment name which they want to connect 
    
    - If doesn't provide any environment then Java SDK by default invokes production version of trade api 
    

### Prerequisites 

- Java 8 JDK

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

4. Build/Run the Application

   Open Bash Shell/Git Bash, run the following command from project base directory
   
		./deploy.sh
	
	The above command builds and deploys the war into Tomcat and starts the Tomcat Server.
	
5. Access the Java Bridge Api

	- Java Bridge Application main class is SamcoHttpConnection 
	
	- There are two ways to create the object 
	
	- Creating object with zero parameterized constructor then by defalut we are connecting with production environment

	  EX :  SamcoHttpConnection httpConnection = new SamcoHttpConnection();
	  
	- Creating object with single parameterized constructor , environment variable as the parameter which we need to               connect
	
	  Ex : SamcoHttpConnection httpConnection = new SamcoHttpConnection("uat");


  
#### StockNote API's


## Diagnostic - Connection - GET

    /demo/diagnostic/rabbitmq/connection
    
Checks if TextBlue application can connect to it's embedded RabbitMQ server:
# Response:    
    {
        status: "UP",
        message: "Successfully connected to localhost : 5672"
    }

## Login Api

# method - POST

# Parameters:

    userId, password, yob
    
# Sample code:

    LoginRequest loginRequest = new LoginRequest("userId", "password", "yob");
    LoginResponse loginResponse = httpConnection.getLoginSession(loginRequest);
    
    ObjectMapper objectMapper = new ObjectMapper();
    String prettyJsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(loginResponse);
    System.out.println("login session ----->>> " + prettyJsonString);

# Example request:

    https://api.stocknote.com/login
    
## Response:  

# Example output of successful

    {
    "serverTime": "26/05/20 13:50:32",
    "msgId": "c662bbd1-0b24-4e86-a3d9-8c89d7529f2c",
    "sessionToken": "e0875f4aa3660b72ec636b0553acc7a9",
    "accountID": "client_id",
    "accountName": "client_name",
    "exchangeList": [
        "BSE",
        "MCX",
        "CDS",
        "NSE"
    ],
    "orderTypeList": [
        "L",
        "MKT",
        "SL"
    ],
    "productList": [
        "CNC",
        "CO",
        "MIS"
    ]
   }
   
# Example output of error condition

    {
      "serverTime": "26/05/20 13:53:05",
      "msgId": "ffb0be73-4620-491e-9f43-d50c692ea0ec",
      "status": "Failure",
      "statusMessage": "Invalid Password"
    }
  
# Using that session we can call any other api’s 

## Quote api 

# method - GET

    - to access quote api we have to pass these input's 1. session 2. exchange 3. symbol and it will return QuoteResponse
        
# Parameters:

    sessionToken, exchange, symbol
    
# Sample code:

    QuoteRequest quoteRequest = new QuoteRequest("a51a7bd8f0e46c304536f4719c872ea7", "NSE", "SBIN");
    QuoteResponse quoteDetails = httpConnection.getQuoteDetails(quoteRequest);
    
    ObjectMapper objectMapper = new ObjectMapper();
    String prettyJsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(quoteDetails);
    System.out.println("quote search res --->>>  " + prettyJsonString);
    
# Example request:
    
    https://api.stocknote.com/quote/getQuote?exchange=NSE&symbolName=SBIN
    
## Response:  

# Example output of successful

    {
      "serverTime": "26/05/20 14:09:56",
      "msgId": "70414ca5-230e-467b-81cb-62af0a5f2b95",
      "status": "Success",
      "statusMessage": "Quote details retrieved successfully",
      "symbolName": "SBIN",
      "tradingSymbol": "SBIN-EQ",
      "exchange": "NSE",
      "companyName": "STATE BANK OF INDIA",
      "lastTradedTime": "26/05/2020 14:09:55",
      "lastTradedPrice": "151.00",
      "previousClose": "150.85",
      "changeValue": "0.15",
      "changePercentage": "0.10",
      "lastTradedQuantity": "16",
      "lowerCircuitLimit": "135.80",
      "upperCircuitLimit": "165.90",
      "averagePrice": "151.96",
      "openValue": "152.40",
      "highValue": "153.20",
      "lowValue": "150.55",
      "closeValue": "150.85",
      "totalBuyQuantity": "3140492",
      "totalSellQuantity": "9899407",
      "totalTradedValue": "592.47019 (Crs)",
      "totalTradedVolume": "38988562",
      "yearlyHighPrice": "373.80",
      "yearlyLowPrice": "149.45",
      "bestBids": [
          {
              "number": "1",
              "quantity": "9105",
              "price": "150.95"
          },
          {
              "number": "2",
              "quantity": "16880",
              "price": "150.90"
          },
          {
              "number": "3",
              "quantity": "20776",
              "price": "150.85"
          },
          {
              "number": "4",
              "quantity": "38364",
              "price": "150.80"
          },
          {
              "number": "5",
              "quantity": "23566",
              "price": "150.75"
          }
      ],
      "bestAsks": [
          {
              "number": "1",
              "quantity": "3633",
              "price": "151.00"
          },
          {
              "number": "2",
              "quantity": "2837",
              "price": "151.05"
          },
          {
              "number": "3",
              "quantity": "8477",
              "price": "151.10"
          }, 
          {
              "number": "4",
              "quantity": "6745",
              "price": "151.15"
          },
          {
              "number": "5",
              "quantity": "11179",
              "price": "151.20"
          }
      ],
      "listingId": "3045_NSE"
      }
 
# Example output of error condition

    {
      "serverTime": "26/05/20 14:15:46",
      "validationErrors": [
          "Please enter a valid exchange - BSE/NSE/NFO/CDS/MCX"
       ]
    }
