package com.example.th.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.th.model.Quiz;
import com.example.th.model.User;
import com.example.th.service.QuizService;

import jakarta.servlet.http.HttpSession;


@Controller
public class MainController {
	

	@Autowired
    QuizService qService;
	@Autowired
	private QuizService quizService;
	Boolean submitted = false;
	

	
	@GetMapping("/")
	public String home() {
		return "index.html";
	}



	@GetMapping("/user/home")
	public ModelAndView userHome(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		User currentUser = (User) session.getAttribute("currentUser");
		if (currentUser != null && "ROLE_USER".equals(currentUser.getRole())) {
			List<Quiz> quizzes = quizService.getAllQuizzes(); // Assuming you have this method in your QuizService
			modelAndView.addObject("quizzes", quizzes);
			modelAndView.setViewName("userHome");
		} else {
			modelAndView.setViewName("redirect:/login"); // Redirect to login if not user
		}
		return modelAndView;
	}


	@GetMapping("/admin/home")
	public ModelAndView adminHome(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		User currentUser = (User) session.getAttribute("currentUser");
		if (currentUser != null && "ROLE_ADMIN".equals(currentUser.getRole())) {
			modelAndView.setViewName("adminHome");
		} else {
			modelAndView.setViewName("redirect:/login"); // Redirect to login if not admin
		}
		return modelAndView;
	}
	@GetMapping("/quizTimeout")
	public String quizTimeout() {
		return "quizTimeout";
	}

}

