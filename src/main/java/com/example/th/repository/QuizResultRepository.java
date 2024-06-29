package com.example.th.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.th.model.QuizResult;

public interface QuizResultRepository extends JpaRepository<QuizResult, Long> {
}
