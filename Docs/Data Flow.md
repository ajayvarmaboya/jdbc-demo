# Application Flow

## Add Student

User

↓

App.java

↓

StudentService

↓

validateStudent()

↓

StudentDAO

↓

PreparedStatement

↓

Database

---

## View Student

User

↓

App.java

↓

StudentService

↓

StudentDAO

↓

Database

↓

Student Object

↓

Console

---

## View All Students

User

↓

App.java

↓

StudentService

↓

StudentDAO

↓

Database

↓

List<Student>

↓

Console

---

## Update Student

User

↓

Enter Course ID

↓

Retrieve Student

↓

Display Student

↓

Update Selected Field

↓

StudentService

↓

StudentDAO

↓

Database

↓

Success

---

## Delete Student

User

↓

Enter Course ID

↓

Retrieve Student

↓

Display Student

↓

Confirmation

↓

Delete

↓

Database

↓

Success