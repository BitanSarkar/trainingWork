package com.sapient.userservice.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sapient.userservice.beancreater.LoginCreator;
import com.sapient.userservice.beans.Login;
import com.sapient.userservice.entity.User;
import com.sapient.userservice.repo.UserRepository;
import com.sapient.userservice.validation.LoginValidation;

import net.bytebuddy.matcher.ModifierMatcher.Mode;

@Controller
public class LoginController {

	@Autowired
	UserRepository repository;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Model model, HttpServletRequest request) {
		User user = new User();
		if(model.containsAttribute("login-status") && (Boolean)model.getAttribute("login-status")) {
			if(model.containsAttribute("failure"))
				model.addAttribute("failure", 0);
			return "redirect:/";
		}
		Login login = LoginCreator.createLoginBean(request);
		user.setEmail(login.getEmailId());
		user.setPassword(login.getPassword());
		if(LoginValidation.isUserValid(user)) {
			model.addAttribute("login-status", true);
			if(model.containsAttribute("fail-ctr"))
				model.addAttribute("failure", 0);
			return "redirect:/";
		}
		if(model.containsAttribute("failure"))
			model.addAttribute("failure",1);
		else
			model.addAttribute("failure",0);
		return "loginPage";
	}
}
