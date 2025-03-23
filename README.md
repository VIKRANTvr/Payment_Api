**Payment API**

Overview :

The Payment API is a RESTful service built with Spring Boot and PostgreSQL, designed to handle payment transactions between users. It supports functionalities such as creating payments, retrieving payment details, and processing service requests with validation.

**Features**

Create a new payment transaction

Retrieve payment details by ID

List all payment transactions

Process payment service requests

Exception handling with global error responses

**Tech Stack**

Backend: Java (Spring Boot)

Database: PostgreSQL

Build Tool: Maven

Testing: Postman (for API testing)

Deployment: Localhost (for now)

Installation & Setup

Clone the repository:

git clone https://github.com/VIKRANTvr/payment-api.git
cd payment-api

Configure the database in application.properties:
spring.application.name=Payment_Api
server.port=8080

# PostgreSQL Configuration
spring.datasource.url=jdbc:postgresql://localhost:5432/payment_db
spring.datasource.username=postgres
spring.datasource.password=Vicky13
spring.datasource.driver-class-name=org.postgresql.Driver

# Hibernate (JPA) Configuration
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Connection Pool (Optional, Improves Performance)
spring.datasource.hikari.maximum-pool-size=10
spring.datasource.hikari.minimum-idle=2


1. Create a Payment

Endpoint: POST /paymentsRequest Body:

{
  "payerName": "Vicky",
  "receiverName": "Vikrant",
  "amount": 1000,
  "status": "Completed"
}

Response:

{
  "id": 1,
  "payerName": "Vicky",
  "receiverName": "Vikrant",
  "amount": 2000,
  "status": "Completed",
}

2. Get Payment by ID

Endpoint: GET /payments/{id}Response:

{
  "id": 1,
  "payerName": "Vicky",
  "receiverName": "Vikrant",
  "amount": 1000,
  "status": "Completed",
}

3. Get All Payments

Endpoint: GET /payments

4. Process Payment Service Request

Endpoint: POST /get_serviceRequest Example:

{
  "data": {
    "details": {
      "user": "0103",
      "in": "",
      "in_flag": false,
      "br_code": "",
      "br_arn": "",
      "partner_id": ""
    },
    "us": {
      "code": "UCC_CODE01"
    },
    "order_ids": [50000123,50000124],
    "request_method": "pg_page",
    "payment_mode": ["upi", "net_banking", "mandate"],
    "loopback_url": ""
  }
}

**Exception Handling**

**404 Not Found: If a payment ID is not found, returns:**

{
  "status": "error",
  "message": "Payment not found with ID: X",
  "errorType": "PaymentNotFoundException"
}

**400 Bad Request: If a request is invalid, returns:**

{
  "status": "error",
  "message": "Invalid request data",
  "errorType": "IllegalArgumentException"
}

**500 Internal Server Error: Generic error response.**

Future Improvements
Implement authentication using JWT
Introduce Redis caching for performance
Support additional payment methods

Thank you for reviewing this project! I look forward to the opportunity to contribute to PPY Technologies.
