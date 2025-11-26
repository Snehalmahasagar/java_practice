**Student Course Management System – Java, JDBC, MySQL**

A simple and fully functional backend application built using Core Java, JDBC, and MySQL.
This project allows users to add students, add courses, and manage enrollments between them using a clean, menu-driven console interface.

It demonstrates real-world backend concepts such as CRUD operations, database connectivity, foreign key relationships, layered architecture, and exception handling — making it an ideal project for Java Fresher roles.

**🚀 Features
✔ Student Management

Add new students

View all students

✔ Course Management

Add new courses

View all available courses

✔ Enrollment Management

Enroll a student into a course

View all enrollments

Database ensures a student or course must exist before enrollment

✔ Database Integration

MySQL used for storing all data permanently

JDBC used for database communication

Foreign key constraints ensure data consistency**

**🛠️ Tech Stack**

**Java (Core + Advanced)

JDBC (Java Database Connectivity)

MySQL

OOP Concepts (Classes, Objects, Methods, Encapsulation)

Exception Handling

Collections**

📂 Project Structure
StudentManagement/
 ├── Database.java
 ├── Student.java
 ├── Course.java
 ├── Enrollment.java
 ├── StudentService.java
 ├── CourseService.java
 ├── EnrollmentService.java
 ├── Main.java

🗄️ **Database Setup**

Run the following SQL commands in MySQL:

CREATE DATABASE student_db;
USE student_db;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE courses (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    instructor VARCHAR(100)
);

CREATE TABLE enrollments (
    id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    course_id INT,
    FOREIGN KEY (student_id) REFERENCES students(id),
    FOREIGN KEY (course_id) REFERENCES courses(id)
);

**🔗 JDBC Driver Setup**

Download MySQL Connector/J (JAR file):
https://dev.mysql.com/downloads/connector/j/

Add the JAR to your project:

IntelliJ:
File → Project Structure → Modules → Dependencies → + → JARs or Directories

▶️ **How to Run**

Clone the repository

Import the project into IntelliJ / Eclipse

Add MySQL JDBC connector JAR

Update your database credentials inside Database.java

Run the Main.java file

You will see a menu-driven interface:

==== Student Course Management ====
1. Add Student
2. View Students
3. Add Course
4. View Courses
5. Enroll Student
6. View Enrollments
7. Exit

📌 Sample Console Output
Student added successfully!
--- Student List ---
1 | Snehal | snehal@gmail.com

Course added successfully!
--- Course List ---
1 | CSE | Vijay

Student enrolled successfully!
--- Enrollment List ---
1 | Snehal -> CSE

🎯 What This Project Demonstrates

Java–MySQL integration using JDBC

Clean service-layer architecture

Proper use of SQL (CRUD + joins)

Working with foreign keys

Input validation and exception handling

Real backend logic similar to industry projects
