# Client Management API - CRUD with Spring Boot

This project is a Spring Boot application that implements a complete CRUD for managing clients using REST web services. 

It covers the five basic operations:

- Paginated search for clients
- Search for a client by ID
- Insert a new client
- Update an existing client
- Delete a client by ID

## Features

- **Spring Boot** application with REST API for client management.
- **CRUD** operations to handle clients' data.
- **H2 Database**: Embedded database for testing and development.
- **Validation**: Custom validation rules for handling invalid data.
- **Error Handling**: Custom error responses for different scenarios.
- **Maven**: Dependency management.
- **Java**: Developed with Java.

## Client Entity

A client has the following attributes:

- **name**: Client's name (cannot be empty).
- **cpf**: Client's CPF.
- **income**: Client's income.
- **birthDate**: Client's birthdate (must be in the past or present).
- **children**: Number of children the client has.

## Requirements

- **Java 11** or higher
- **Maven**
  
## Validations and Exceptions

The project handles the following exceptions and validations:

- **ID not found**: For `GET`, `PUT`, and `DELETE` operations when the client ID does not exist. Returns a `404 Not Found` error.
- **Validation errors**: Returns a `422 Unprocessable Entity` error with custom messages for invalid fields. Validation rules:
  - Name: Cannot be empty.
  - Birthdate: Cannot be a future date (`@PastOrPresent` annotation used).

## Database

The project uses the **H2 database** for development and testing purposes. A seed of 20 meaningful clients is provided on startup, so the data is preloaded for testing. 

### Example Seed Data:
- Maria Silva, CPF: 12345678901, Income: 5000.00, Birthdate: 1985-05-15, 2 children
