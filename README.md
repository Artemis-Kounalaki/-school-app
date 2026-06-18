# Teacher Management System 

## Overview

Teacher Management System is designed and developed as part of Java course at Coding Factory(educational program - AUEB GR) is a web-based SSR application developed using Spring Boot and Thymeleaf for managing teacher records within an educational organization.

The application provides secure authentication and role-based authorization, allowing employees to create and manage teacher profiles while maintaining controlled access to system resources.

## Features

### Authentication & Authorization

* User registration
* Secure login/logout
* Password encryption using Spring Security
* Role-based access control
* Conditional rendering

### User Roles

#### Admin

* Create users (admin / teacher)
* View teacher information 
* Insert teacher
* Edit teacher details
* Soft delete teacher records

#### Teacher (Employee)

* Register 
* View teacher information 

### Logging & Monitoring

* SLF4J integration
* Logback configuration
* Application event logging

## Technologies

### Backend

* Java 21
* Spring Boot
* Spring Security
* Spring Data JPA

### Database

* MySQL
* Flyway

### Frontend

* Thymeleaf
* HTML5
* CSS3

### Build Tool

* Gradle

## Project Architecture

The application follows a layered architecture:

* Controllers
* Services
* DTOs
* Repositories
* Models
* Security Configuration

## Getting Started

### Prerequired

* JDK 21+
* Gradle
* MySQL

### Installation

```bash
  git clone https://github.com/Artemis-Kounalaki/school-app.git
cd teacher-management-system
```

Configure the database properties and run:

```bash
 ./gradlew bootRun
```
