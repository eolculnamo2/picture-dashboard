package com.pictures.controllers;

//import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
@Controller
public class MainController {
	@RequestMapping("/")
	public String homePage (Model model) {
		
		model.addAttribute("test", "Successful!");
		return "index";
	}
	@RequestMapping("/my-pictures")
	public String myPictures (Model model) {
		
		model.addAttribute("test", "Successful!");
		return "index";
	}
	@RequestMapping("/add-picture")
	public String addPicture (Model model) {
		
		model.addAttribute("test", "Successful!");
		return "index";
	}
	@RequestMapping("/login")
	public String loginPage (Model model) {
		
		model.addAttribute("test", "Successful!");
		return "index";
	}
	@RequestMapping("/loginUser")
	public void loginUser(HttpServletRequest request, Model model) {
		//TODO make this work to handle fetch post request
		String user = request.getParameter("username");
		System.out.println(user);
	}
} 