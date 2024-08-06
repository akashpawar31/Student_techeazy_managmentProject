# Student-Subject Spring Boot Project

This is a basic Spring Boot project with MVC, Security, and Spring Data support. The application uses JWT-based authentication and an in-memory H2 database.

## Features

- **Entities**: Student and Subject
- **Relationships**: Students can enroll in multiple subjects.
- **REST API**: Create and retrieve students and subjects.
- **Security**: JWT-based authentication with roles `student` and `admin`.
- **Database**: In-memory H2 database for development.

## Prerequisites

- **Java**: JDK 19 or higher
- **Maven**: For building and running the project

## Getting Started

1. **Clone the Repository**

    ```sh
    git clone https://github.com/your-username/student-subject.git
    cd student-subject
    ```

2. **Build the Project**

    ```sh
    mvn clean install
    ```

3. **Run the Application**

    You can run the application using Maven:

    ```sh
    mvn spring-boot:run
    ```

    The application will start on `http://localhost:8080`.

4. **Access the H2 Console**

    The H2 console is available at `http://localhost:8080/h2-console`. Use the following settings to connect:

    - **JDBC URL**: `jdbc:h2:mem:testdb`
    - **User Name**: `sa`
    - **Password**: `password`

## API Endpoints

### Authentication

**Login**: `/api/auth/login` (POST)

- **Request Body**: 

    ```json
    {
        "username": "testuser",
        "password": "testpassword"
    }
    ```

- **Response**: JWT Token

### Students

**Create Student**: `/api/students` (POST)

- **Request Body**:

    ```json
    {
        "name": "Akash Pawar",
        "address": "Nanded "
    }
    ```

- **Response**: Created Student

**Get All Students**: `/api/students` (GET)

- **Response**: List of Students

### Subjects

**Get All Subjects**: `/api/subjects` (GET)

- **Response**: List of Subjects

## Security

- **Roles**: `student` and `admin`
- **JWT Authentication**: The token needs to be included in the `Authorization` header with the `Bearer` prefix.

## Example Request with JWT

```sh
curl -X GET "http://localhost:8080/api/students" -H "Authorization: Bearer <your-jwt-token>"
