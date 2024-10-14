# Student Management System

## Overview

The Student Management System is a web application designed to manage student information, course registrations, fee payments, and exam scorecards. This project consists of two main components: a backend developed using **Spring Boot** and **MySQL** and a frontend built using **ReactJS**. The system provides a seamless experience for students, faculty, and administrators.

## Technologies Used

- **Frontend**: 
  - **ReactJS**: A JavaScript library for building user interfaces.
  - **HTML/CSS**: For structuring and styling the application.

- **Backend**: 
  - **Java**: Version 17
  - **Spring Boot**: Version 3.3.2 for building the RESTful APIs.
  - **MySQL**: Version 8.0.37 for database management.
  - **Maven**: Version 3.9.8 for project management and build automation.

## Project Structure

### Backend

The backend project is organized into the following packages:

- **config**: Contains configuration classes for the application.
- **controller**: Contains REST controllers for handling HTTP requests.
- **entity**: Contains entity classes representing the database structure (e.g., Student, CourseRegistration).
- **repository**: Contains Spring Data JPA repositories for database operations.
- **service**: Contains service layer classes for business logic.

### Frontend

The frontend project contains:

- **src**: The main source directory for React components.
- **public**: Contains static assets and the main HTML file.
- **package.json**: Contains project metadata and dependencies.

## Setup Instructions

### Backend Setup

1. **Clone the Repository**

   ```bash
   git clone https://github.com/08YESHWANTH08/Student_Management_System.git
