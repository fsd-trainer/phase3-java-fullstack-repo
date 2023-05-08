2 ways to create Spring Web project

                 - File > new > Maven > archetype: web

                 - start.spring.io  and generate project zip file
                   unzip the file and import it in eclipse IDE

===============================================================================================

Controller Layer in Spring has 2 annotations

  1. @Controller - Register the bean in the container, accept  HTTP request, and identify the view to present UI to the client
  2. @RestContoller - Based on REST APi. Register the bean in the spring container, accept HTTP Request and it send the response in JSON / XML back to the client

  REST API Controller generate responses in multiple formats:
        - JSON 
        - XML 
        - Text
        - Multipart Format   


JSON format
{"id": 1, "name":"jill", "city": "UK"}


Product Class 
ProductService class

                  http://localhost:8090/api/v1/products + GET
WEb Browser (Client) ------------> Rest API [ProductController]
                     <-----------
                      HTTP Respones JSON [{}, {}, {}]



So far which annotation for rest api in spring boot
==================================================
1. @RestController - register the bean in the conatiner that can handle http request and http responses
2. @RequestMapping - to define te URL and HTTP method 
@RequestBody - to read data from HTTp packet body


Scenario : To add a new product object on the server.

(URL + HTTP method (POST) + Body: JSON Object) Postman----------------------------> spring boot app
                                                                    Web browser client - it cannot send object to the server
 Web browser only support GET method.                                                                 
            URL + HTTP Method: GET 
 Web browser ---------------------> Web application on server
              <------------------
               [ { ....}, {..} ]]


For whom we are creating REST API in Web application???
 REST APIs are not created for WEB BROWSER client

 REST APIS are acting as middle man between two applications to communicate in a common format (JSON or XML)

 Client App  <------------ REST API-----> Server app
 URL + HTTP Methods : GET/POST/PUT/PATCH/DELETE

opeartions on makemytrip 
Search for  flight : GET request to the backend app
Book a flight : POST request to the backend
Update the flight booking : PUT/ PATCH  request to the backened app
delete the flight booking: Makemytrip will raise) Delete to the backend app



REST API standards:
  1. Needs a URL : http://localhost:..../products
  2. HTTP Methods (actions) for the URL
      GET
      POST
      PUT
      DELETE


Postman - Ready application created by Google that can send Rest API calls to the server

How to get postman application???
 - As extension in chrome browser
 - Download exe for windows and install it

Postman is a ready to use Rest client

  - URL 
  - HTTP Method

  

































