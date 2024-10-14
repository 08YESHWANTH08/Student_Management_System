-- Create the database
CREATE DATABASE IF NOT EXISTS student_management_system;

-- Use the database
USE student_management_system;

-- Create the Student table
CREATE TABLE IF NOT EXISTS Student (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    department VARCHAR(50),
    year INT,
    section VARCHAR(10),
    course_name VARCHAR(100)
);

-- Create the Course Registration table
CREATE TABLE IF NOT EXISTS CourseRegistration (
    id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT,
    course_name VARCHAR(100),
    FOREIGN KEY (student_id) REFERENCES Student(id)
);

-- Create the Payment table
CREATE TABLE IF NOT EXISTS Payment (
    id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT,
    amount DECIMAL(10, 2),
    payment_date DATE,
    FOREIGN KEY (student_id) REFERENCES Student(id)
);

-- Create the Marks table
CREATE TABLE IF NOT EXISTS Marks (
    id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT,
    subject_name VARCHAR(100),
    score INT,
    FOREIGN KEY (student_id) REFERENCES Student(id)
);
