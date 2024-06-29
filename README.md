# Quiz Application Documentation
Welcome to the documentation for the Quiz Application built with Spring Boot. This document provides an overview of the application, its features, setup instructions, usage guidelines, and more.

## Table of Contents
1. Introduction
2. Features
3. Technologies Used
4. Setup and Installation
5. Usage

### Introduction
The Quiz Application is designed to offer an interactive learning experience through quizzes. It supports user registration, quiz creation, participation, and real-time result tracking. Administrators can manage quizzes and questions through an admin panel, while users can participate in quizzes and view their scores via a user dashboard.

### Features
User Registration and Authentication:

Secure registration and login functionality.
"Remember Me" option for convenience.

Admin Panel:
  Create, update, and delete quizzes and questions.
  Manage user roles and permissions.

User Dashboard:
  Participate in quizzes.
  View quiz results and scores.

Event Listeners:
  Track user actions like login, logout, and quiz activities.

Responsive Design:
  Optimized for various devices and screen sizes.

### Technologies Used
#### Backend:
Spring Boot: Framework for building Java applications.
Spring Security: Provides authentication and authorization.
MySQL: Database for storing users, quizzes, and results.

#### Frontend:
Thymeleaf: Template engine for server-side rendering.
Bootstrap: Frontend framework for responsive design.

### Setup and Installation
To run the Quiz Application locally, follow these steps:

1. Clone the repository:
   git clone https://github.com/yourusername/0nline_quiz-application.git
   cd online_quiz-application

2. Build and run the application using Maven: 
    mvn spring-boot:run
   
3. Access the application:
   Open your web browser and go to http://localhost:8080.

### Usage
#### Admin Panel
Access the admin panel via /admin URL.
Create, update, or delete quizzes and questions.
Manage user roles and permissions.

#### User Dashboard
Participate in quizzes listed on the homepage.
View scores and results after completing quizzes.
