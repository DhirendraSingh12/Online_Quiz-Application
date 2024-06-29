package com.example.th.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.th.model.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
