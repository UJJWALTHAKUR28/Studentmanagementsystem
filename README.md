# Student Management System

A web-based application for managing students, subjects, marks, and user authentication, built with Spring Boot, Spring Security, Thymeleaf, and MySQL.

## Features

- User registration and login (Admin & Student roles)
- Role-based dashboards
- Manage subjects and marks (Admin)
- View marks (Student)
- Secure authentication with password hashing
- Responsive UI with Thymeleaf templates

## Technologies

- Java 17+
- Spring Boot
- Spring Security
- Thymeleaf
- MySQL
- Maven

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- MySQL

### Setup

1. **Clone the repository:**
    ```sh
    git clone https://github.com/UJJWALTHAKUR28/Studentmanagementsystem.git
    cd Studentmanagementsystem
    ```

2. **Configure the database:**
    - Create a MySQL database named `student_management_system`.
    - Update `src/main/resources/application.properties` with your MySQL username and password if needed.

3. **Build and run the application:**
    ```sh
    mvn spring-boot:run
    ```

4. **Access the application:**
    - Open [http://localhost:8080](http://localhost:8080) in your browser.

## Project Structure

- `src/main/java/student/mangamentsytem/` - Java source code
- `src/main/resources/templates/` - Thymeleaf HTML templates
- `src/main/resources/static/` - Static resources (CSS, JS)
- `src/main/resources/application.properties` - Application configuration

## License

This project is licensed under
