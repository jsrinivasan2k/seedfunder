# SeedFunder REST API

## Overview
The SeedFunder REST API is a Spring Boot application that provides endpoints for managing investors. It allows users to add, delete, and update investor information.

## Project Structure
```
seedfunder-rest-api
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── seedfunder
│   │   │           ├── SeedFunderApplication.java
│   │   │           ├── controller
│   │   │           │   └── InvestorController.java
│   │   │           ├── model
│   │   │           │   └── Investor.java
│   │   │           └── service
│   │   │               └── InvestorService.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── static
│   └── test
│       └── java
│           └── com
│               └── seedfunder
│                   └── SeedFunderApplicationTests.java
├── pom.xml
└── README.md
```

## Setup Instructions
1. **Clone the repository**:
   ```
   git clone <repository-url>
   cd seedfunder-rest-api
   ```

2. **Build the project**:
   Ensure you have Maven installed, then run:
   ```
   mvn clean install
   ```

3. **Run the application**:
   You can run the application using:
   ```
   mvn spring-boot:run
   ```

4. **Access the API**:
   The API will be available at `http://localhost:8080`.

## API Endpoints
- **Add Investor**: `POST /investors`
- **Delete Investor**: `DELETE /investors/{id}`
- **Update Investor**: `PUT /investors/{id}`

## Dependencies
This project uses the following dependencies:
- Spring Boot Starter Web
- Spring Boot Starter Test

## Testing
To run the tests, use:
```
mvn test
```

## License
This project is licensed under the MIT License.