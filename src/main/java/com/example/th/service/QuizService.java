package com.example.th.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.th.model.Question;
import com.example.th.model.Quiz;
import com.example.th.model.QuizResult;
import com.example.th.model.User;
import com.example.th.repository.QuestionRepository;
import com.example.th.repository.QuizRepository;
import com.example.th.repository.QuizResultRepository;

import jakarta.persistence.EntityNotFoundException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class QuizService {

	@Autowired
	private QuizRepository quizRepository;
	@Autowired
	private QuizResultRepository quizResultRepository;

	@Autowired
	private QuestionRepository questionRepository; // Add this

	public Quiz saveQuiz(Quiz quiz) {
		return quizRepository.save(quiz);
	}

	public List<Quiz> getAllQuizzes() {
		return quizRepository.findAll();
	}

	public Quiz getQuizById(Long id) {
		return quizRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Quiz not found"));
	}

	public void deleteQuiz(Long id) {
		quizRepository.deleteById(id);
	}

	// Add this method
	public Map<Long, Character> getCorrectAnswers(Long quizId) {
		List<Question> questions = questionRepository.findByQuizId(quizId);
		Map<Long, Character> correctAnswers = new HashMap<>();
		for (Question question : questions) {
			correctAnswers.put(question.getId(), question.getCorrectAnswer());
			// Debugging: Print each correct answer
			System.out.println("Question ID: " + question.getId() + ", Correct Answer: " + question.getCorrectAnswer());
		}
		return correctAnswers;
	}
	public void saveQuizResult(User user, Quiz quiz, int score) {
		QuizResult quizResult = new QuizResult();
		quizResult.setUser(user);
		quizResult.setQuiz(quiz);
		quizResult.setScore(score);
		quizResultRepository.save(quizResult);
	}
	// Additional methods as needed
}
