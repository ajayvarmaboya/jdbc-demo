# JDBC Student Management System

A layered Java console application built using **JDBC** and **PostgreSQL** to demonstrate enterprise-style backend architecture without using frameworks like Spring Boot.

---

## 📖 Project Overview

This project was developed as a learning journey to understand how Java applications communicate with relational databases using JDBC.

The application follows a clean layered architecture consisting of:

- Presentation Layer
- Service Layer
- Data Access Layer (DAO)
- Database Layer

The objective is to master JDBC fundamentals before moving to Spring Boot.

---

## 🚀 Features

### ✅ Implemented

- Add Student
- View Student by Course ID
- Service Layer Validation
- DAO Layer
- PostgreSQL Integration
- PreparedStatement
- Exception Handling
- Layered Architecture
- Try-With-Resources
- CRUD Structure

### 🚧 In Progress

- View All Students
- Update Student
- Delete Student

### 📌 Planned

- Transactions
- Batch Processing
- Interfaces
- Custom Exceptions
- Logging
- Properties File Configuration
- JDBC Interview Preparation

---

## 🏗️ Project Structure

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

## 🏛️ Application Architecture

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

## 🛠️ Technologies Used

- Java 21
- JDBC
- PostgreSQL
- Maven
- VS Code
- Git & GitHub

---

## 📚 Concepts Covered

### Java

- Classes & Objects
- Encapsulation
- Composition
- Exception Handling
- Collections
- OOP Principles

### JDBC

- DriverManager
- Connection
- PreparedStatement
- ResultSet
- executeQuery()
- executeUpdate()
- try-with-resources
- SQLException

### SQL

- INSERT
- SELECT
- UPDATE
- DELETE

### Software Engineering

- DAO Pattern
- Service Layer
- Layered Architecture
- Separation of Concerns
- DRY Principle
- Exception Propagation

---

## 📂 Database

Table: **training**

| Column | Type |
|---------|------|
| courseId | INTEGER |
| name | VARCHAR |
| fee | BOOLEAN |
| course | VARCHAR |
| courseName | VARCHAR |

---

## ▶️ How to Run

### Clone Repository

```bash
git clone https://github.com/ajayvarmaboya/jdbc-demo.git
```

### Open Project

```
Import as Maven Project
```

### Configure PostgreSQL

Update database credentials inside:

```
DBConnection.java
```

### Run

```
App.java
```

---

## 📸 Current Console Menu

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

## 🎯 Learning Objectives

This project is designed to understand:

- How JDBC works internally
- Database communication using Java
- Layered application architecture
- Clean code practices
- Enterprise backend fundamentals
- Transition path to Spring Boot

---

## 📈 Current Progress

| Module | Status |
|---------|--------|
| Database Setup | ✅ |
| JDBC Configuration | ✅ |
| Student Model | ✅ |
| DAO Layer | ✅ |
| Service Layer | ✅ |
| Menu Driven Console | ✅ |
| Add Student | ✅ |
| View Student | ✅ |
| View All Students | 🚧 |
| Update Student | 🚧 |
| Delete Student | 🚧 |
| Transactions | ⏳ |
| Batch Processing | ⏳ |

---

## 👨‍💻 Author

**Boya Ajay Varma**

GitHub: https://github.com/ajayvarmaboya

---

## ⭐ Future Enhancements

- Complete CRUD Operations
- Transaction Management
- Batch Processing
- Properties File
- Logging
- Custom Exceptions
- DAO Interfaces
- Service Interfaces
- Connection Pooling
- Unit Testing (JUnit)
- Migration to Spring Boot

---

## 📜 License

This project is developed for educational purposes to strengthen Java Backend and JDBC fundamentals.