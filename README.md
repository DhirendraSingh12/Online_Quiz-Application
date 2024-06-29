Quiz Application
This is a comprehensive quiz application built with Spring Boot, designed to provide an interactive learning experience through quizzes.

Features
User Registration and Authentication: Allows users to sign up and log into the application securely.
Quiz Management: Admin panel for creating, updating, and deleting quizzes and questions.
User Dashboard: Users can participate in quizzes and view their scores.
Event Tracking: Tracks user actions such as login, logout, and quiz activities.
Responsive Design: Ensures a seamless experience across different devices.
Technologies Used
Spring Boot: Backend framework for building the application.
Thymeleaf: Template engine for rendering views.
Spring Security: Provides authentication and authorization functionalities.
MySQL: Database for storing users, quizzes, and results.
Bootstrap: Frontend framework for responsive design.
Installation
To run this application locally, ensure you have Java 11 or newer and Maven installed. Follow these steps:

Clone the repository:

bash
Copy code
git clone https://github.com/yourusername/quiz-app.git
cd quiz-app
Build and run the application using Maven:

bash
Copy code
mvn spring-boot:run
Open your web browser and go to http://localhost:8080 to access the application.

Usage
Admin Panel: Accessible via /admin URL for managing quizzes.
User Dashboard: Users can participate in quizzes and view their scores on the homepage.
