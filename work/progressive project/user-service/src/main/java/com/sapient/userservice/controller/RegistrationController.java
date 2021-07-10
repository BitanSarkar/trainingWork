package com.sapient.userservice.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sapient.userservice.beancreater.LoginCreator;
import com.sapient.userservice.beancreater.RegistrationCreator;
import com.sapient.userservice.beans.Login;
import com.sapient.userservice.beans.Registration;
import com.sapient.userservice.entity.User;
import com.sapient.userservice.repo.UserRepository;
import com.sapient.userservice.validation.LoginValidation;
import com.sapient.userservice.validation.RegistrationValidation;

@Controller
public class RegistrationController {
	@Autowired
	UserRepository repository;
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(Model model, HttpServletRequest request) {
		User user = new User();
		if(model.containsAttribute("login-status") && (Boolean)model.getAttribute("login-status")) {
			if(model.containsAttribute("failure"))
				model.addAttribute("failure", false);
			return "redirect:/";
		}
		Registration reg = RegistrationCreator.createRegistrationBean(request);
		user.setEmail(reg.getEmailId());
		user.setPassword(reg.getPassword());
		if(RegistrationValidation.isNewUser(user)) {
			repository.save(user);
			model.addAttribute("login-status", true);
			if(model.containsAttribute("failure"))
				model.addAttribute("failure", false);
			return "redirect:/";
		}
		model.addAttribute("failure",true);
		return "regPage";
	}
}
