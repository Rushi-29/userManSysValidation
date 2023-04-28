# User Management System

A simple User management system implemented in Spring with CRUD operations and validation.

## Framework And Language used in Project
- Spring Boot 
- Java 

## Dependencies
- SpringWeb
- Spring Boot Dev Tools
- LomBok

## Data Flow 
- In this project, We create four layers.
- **Controller** :- In controller layer we handle CRUD operatiom by http request.
- **Reposatory** :- In this layer data is stored. for storing data I have used Arraylist,
- **Service** :- The Service layer handles all business logics.
 - **Models** :- User class is defined here. Properties of user like username, userId, address , etc. defined here.
 
## Data structure used in my project.
 - In my Project ArrayList and  methods like add, remove are used.

## Validation

The following validations are performed on the user details:

- `username` - must be between 2 and 50 characters long, and cannot be blank
- `dateOfBirth` - must be a past date in the format `yyyy-MM-dd`, and cannot be null
- `email` - must be a valid email address, and cannot be blank
- `phoneNumber` - must be a 12-digit string with the first 2 digits as the country code, and cannot be blank
- `date` - will be automatically set to the current date, and cannot be null

If any of the above validations fail, an appropriate error message will be returned with a `400 Bad Request` status code.

## Project Summery
My project includes below properties
- UserName
- Name
- UserID
- Address
- PhoneNumber 
In this project we can create, read, edit and update the information of any user. 
