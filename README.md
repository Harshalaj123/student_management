1. Setup Steps
Prerequisites: Java 17+, Maven, and MySQL Server.

Clone the project: git clone https://github.com/Harshalaj123/student-management-system.git

Build the project: Run mvn clean install in the terminal.

Run the Application: Open the project in VS Code and run StudentApplication.java or use the command ./mvnw spring-boot:run.

2. Database Configuration
The application connects to a MySQL database named student_management.

Database Name: student_management

Table Creation: The students table includes fields: id (Primary Key, Auto-Increment), name, email, and course.

SQL Command for Auto-Increment:

3. Sample API Request & Response
The following is an example of a successful POST request to add a student:

Request (Postman):

Method: POST

URL: http://localhost:8080/api/students

Body (JSON):

3. Sample API Request & Response
The following is an example of a successful POST request to add a student:

Request (Postman):

Method: POST

URL: http://localhost:8080/api/students

Body (JSON):

Response:

Status: 200 OK

Body:
