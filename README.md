# JDBC Student Management System

A complete Java console application built using **JDBC** and **PostgreSQL** following an enterprise-style layered architecture. This project demonstrates how Java applications interact with relational databases without using frameworks like Spring Boot.

---

# Project Overview

The objective of this project is to understand JDBC from the ground up by manually implementing every layer of a backend application.

Instead of relying on frameworks, this project builds everything using plain Java:

- Presentation Layer
- Service Layer
- DAO Layer
- Database Connection Layer

The project serves as a strong foundation before learning Spring Boot.

---

# Features

## Student Management

- ✅ Add Student
- ✅ View Student by Course ID
- ✅ View All Students
- ✅ Update Student
- ✅ Delete Student

---

## Application Features

- Menu Driven Console Application
- Layered Architecture
- Input Validation
- Service Layer
- DAO Pattern
- Exception Handling
- try-with-resources
- PostgreSQL Integration
- PreparedStatement
- Clean Separation of Concerns

---

# Technologies Used

- Java 21
- JDBC
- PostgreSQL
- Maven
- Git
- GitHub
- VS Code

---

# Project Structure

```
jdbc-demo
│
├── src
│
└── com.ajay
    │
    ├── App.java
    ├── Student.java
    ├── StudentDAO.java
    ├── StudentService.java
    └── DBConnection.java
```

---

# Application Architecture

```
                    User
                      │
                      ▼
                 App.java
          (Presentation Layer)
                      │
                      ▼
             StudentService
            (Business Layer)
                      │
                      ▼
              StudentDAO
         (Persistence Layer)
                      │
                      ▼
             DBConnection
                      │
                      ▼
               PostgreSQL
```

---

# Database Schema

Table Name

```
training
```

| Column | Data Type |
|----------|-----------|
| courseId | INTEGER (Primary Key) |
| name | VARCHAR |
| fee | BOOLEAN |
| course | VARCHAR |
| courseName | VARCHAR |

---

# CRUD Operations

## Create

Insert a new student into the database.

Uses

- PreparedStatement
- executeUpdate()

---

## Read

Retrieve

- Single Student
- All Students

Uses

- executeQuery()
- ResultSet

---

## Update

- Search student by Course ID
- Display existing details
- Update selected field(s)
- Save updated record

---

## Delete

- Search student
- Display details
- Confirmation before deletion
- Delete record

---

# Concepts Covered

## Core Java

- Classes
- Objects
- Encapsulation
- Composition
- Exception Handling
- Collections
- Enhanced For Loop
- Scanner

---

## JDBC

- DriverManager
- Connection
- PreparedStatement
- ResultSet
- executeQuery()
- executeUpdate()
- try-with-resources
- SQLException

---

## SQL

- INSERT
- SELECT
- UPDATE
- DELETE

---

## Software Engineering

- Layered Architecture
- DAO Pattern
- Service Layer
- Separation of Concerns
- DRY Principle
- Validation
- Defensive Programming
- Exception Propagation

---

# Console Menu

```
==============================
 STUDENT MANAGEMENT SYSTEM
==============================

1. Add Student
2. View Student
3. View All Students
4. Update Student
5. Delete Student
6. Exit
```

---

# Project Workflow

```
User

↓

App.java

↓

StudentService

↓

StudentDAO

↓

DBConnection

↓

PostgreSQL
```

Every user request follows this workflow.

---

# Current Project Status

| Module | Status |
|----------|--------|
| PostgreSQL Database | ✅ Completed |
| Student Model | ✅ Completed |
| DBConnection | ✅ Completed |
| DAO Layer | ✅ Completed |
| Service Layer | ✅ Completed |
| Presentation Layer | ✅ Completed |
| CRUD Operations | ✅ Completed |

---

# Upcoming Improvements

The project will continue with enterprise JDBC concepts.

## Enterprise Refactoring

- StudentDAO Interface
- StudentDAOImpl
- StudentService Interface
- StudentServiceImpl
- Constructor Dependency Injection

---

## Advanced JDBC

- Transactions
- Batch Processing
- Properties File
- Logging
- Custom Exceptions

---

## Future Migration

After completing advanced JDBC topics, this project will be rebuilt using

- Spring Boot
- Spring Data JPA
- Hibernate
- REST APIs

to understand how frameworks simplify the same architecture.

---

# Learning Outcomes

This project demonstrates practical understanding of

- JDBC Architecture
- Layered Application Design
- Database Communication
- CRUD Operations
- Object-Oriented Programming
- Enterprise Coding Practices

---

# Author

**Boya Ajay Varma**

GitHub

https://github.com/ajayvarmaboya

---

# License

This project is developed for educational purposes as part of a Java Backend learning roadmap.