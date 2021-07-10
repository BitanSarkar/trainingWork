package com.sapient.userservice.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sapient.userservice.entity.User;
import com.sapient.userservice.repo.UserRepository;

@Controller
public class UserController {
	@Autowired
	UserRepository repository;

	@RequestMapping("/")
	public String create(Model model, HttpServletRequest request) {
		return "loginpage";
	}
}
