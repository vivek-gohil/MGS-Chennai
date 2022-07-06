package com.mindgate.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("/")
	public String displayLogin() {
		return "login";
	}

	@RequestMapping("/loginaction")
	public String validateLogin(@RequestParam String loginId, @RequestParam String password, Model model) {
		System.out.println("in validateLogin()");

		if (loginId.equals("admin") && password.equals("Mindgate@123")) {
			model.addAttribute("message", "Welcome Admin");
			return "success";
		}
		model.addAttribute("message", "Incorrect Login Details");
		return "failure";
	}
}
