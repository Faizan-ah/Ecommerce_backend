# E-commerce Backend Project

> [!NOTE]
> **The project is still a work in progress**
> 

This project is an E-commerce backend built with **Spring Boot** and **PostgreSQL** as the database. It provides RESTful APIs for managing users, products, orders, and shopping carts, as well as admin functionalities for user, orders and product management.

To run this project locally, ensure you have the following dependencies installed:

- **Java 17+**
- **Spring Boot**
- **Maven** (for building and running the project)
- **PostgreSQL** (for the database)
- **Postman/Insomnia** (for API testing)

## Getting Started
### 1. Clone the Repository

First, clone this repository to your local machine:

```bash
git clone https://github.com/faizan-ah/ecommerce-backend.git
cd ecommerce-backend
```
### 2. Configure the Database
 - Ensure PostgreSQL is running on your machine.
 - Create a database for the project. For example:
```
CREATE DATABASE ecom_app;
```

3. Open the project's application.properties file and verify/update the database connection details as needed. The following are the default configurations in application.properties:

update the following parameters:
 - POSTGRES_HOST: Your database host (default is localhost).
 - POSTGRES_DB: Your database name (default is ecom_app).
 - POSTGRES_USER: Your database username (default is postgres).
 - POSTGRES_PASSWORD: Your database password (default is password).

### 3. Install Dependencies
Make sure Maven is installed on your machine. Navigate to the project root and run the following command to install all necessary dependencies:
```
mvn clean install
```
### 4. Run the Application
After the dependencies are installed, you can run the application using:
```
mvn spring-boot:run
```
The application should now be running on http://localhost:8080.

### Future Enhancements
 - **Pagination:** Add pagination to the product listing for better user experience.
 - **Email Notifications:** Implement email notifications when users place an order or receive updates.
 - and more...

