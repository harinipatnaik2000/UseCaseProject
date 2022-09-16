# UseCaseProject
 
Contact Management System is focused on maintaining a person's name and mobile number in the database. 

Architecture  

•	ContactController: the controller class to define REST endpoints for the POST and GET methods 

•	ContactService: the service class to save/retrieve contacts to/from the repository 

•	ContactRepository: repository class, expected to be used by the service class to save/retrieve contacts to/from the database 

•	Person: the model class to hold the contact information 

Two tasks to 

1.	Annotate these classes using appropriate Spring Boot stereotypes. 

2.	Define the following 2 REST endpoints in the controller class. 

 Here is an example of a person data JSON object: 

{ 

 "id": 1, 

 "name": "SomeName", 

 "mobile": "12345 1234" 

} 

 

The 2 REST endpoints  

 POST request to /contact/save: 

•	expects a valid person data object as its body payload, except that it does not have an id property; assume that the given object is always valid 

•	adds the given object to the database and assigns a unique integer id to it 

•	the response code is 201 and the response body is the created record, including its unique id 

 GET request to /contact/retrieve/{id}: 

•	the response code is 200 and the response body is the matching object 

•	expect that the requested id exists in the database  

 
