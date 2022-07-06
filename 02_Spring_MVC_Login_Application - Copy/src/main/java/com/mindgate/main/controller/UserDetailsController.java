package com.mindgate.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindgate.main.pojo.UserDetails;

@Controller
public class UserDetailsController {

	@RequestMapping("/userdetails")
	public String displayUserDetails() {
		return "userdetails";
	}

	@RequestMapping("/userdetailsaction")
	public String submitUserDetails(@RequestParam String firstName, @RequestParam String lastName,
			@RequestParam String gender, @RequestParam String qualification, Model model) {
//		model.addAttribute("fullName", firstName + " " + lastName);
//		model.addAttribute("gender", gender);
//		model.addAttribute("qualification", qualification);
		
		UserDetails userDetails = new UserDetails(firstName, lastName, gender, qualification);
		model.addAttribute("userDetails", userDetails);
		return "displaydetails";
	}
}
