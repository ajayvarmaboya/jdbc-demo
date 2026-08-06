# Student Management System Architecture

## Overview

The application follows a four-layer architecture.

```
                 User
                   │
                   ▼
              App.java
       Presentation Layer
                   │
                   ▼
          StudentService
          Business Layer
                   │
                   ▼
            StudentDAO
        Persistence Layer
                   │
                   ▼
          DBConnection
                   │
                   ▼
            PostgreSQL
```

---

## Presentation Layer

Responsibilities

- Display menu
- Read user input
- Display output
- Call Service Layer

Contains

- App.java

---

## Business Layer

Responsibilities

- Business validation
- Exception propagation
- Coordinate DAO operations

Contains

- StudentService

---

## Persistence Layer

Responsibilities

- SQL
- PreparedStatement
- ResultSet
- CRUD

Contains

- StudentDAO

---

## Database Layer

Responsibilities

- Store student records
- Execute SQL queries

Database

PostgreSQL