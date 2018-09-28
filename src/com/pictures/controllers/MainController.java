package com.pictures.controllers;

import org.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pictures.models.Image;
import com.pictures.models.NewImage;
import com.pictures.models.NewProfile;
import com.pictures.models.ReadAllImages;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import java.util.ArrayList;
import java.util.List;


import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {
	@RequestMapping("/")
	public String homePage (Model model) {
		return "index";
	}
	@RequestMapping("/my-pictures")
	public String myPictures (Model model) {
		return "index";
	}
	@RequestMapping("/add-picture")
	public String addPicture (Model model) {
		return "index";
	}
	@RequestMapping("/login")
	public String loginPage (Model model) {
		return "index";
	}
	@RequestMapping("/register")
	public String registerPage (Model model) {
		return "index";
	}
	@RequestMapping("/loginUser")
	public String loginUser(HttpServletRequest request, Model model) {
		//TODO Encryption. 
		String user = request.getParameter("username");
		
		model.addAttribute("username", user);
		
		return "index";
	}
	@RequestMapping("/register-new-profile")
	public String registerNewProfile(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String profilePicture = request.getParameter("profilePicture");
		String email = request.getParameter("email");
		
		new NewProfile(name, username, password, profilePicture, email);
		
		model.addAttribute("username", username);
		model.addAttribute("profilePicture", profilePicture);
		
		return "index";
		
	}
	
	@RequestMapping("/create-new-image")
	public String createNewImage(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		String imageUrl = request.getParameter("image-url");
		String creator = request.getParameter("creator");
		
		new NewImage(name, description, imageUrl, creator);
		
		//TODO Send JSON
		
		return "index";
	}
	
	@RequestMapping(value="/get-all-images", method = RequestMethod.GET)
	@ResponseBody
	public JSONArray getAllImages() {
		ReadAllImages readAll = new ReadAllImages();
		JSONArray payload = new JSONArray(readAll.AllImages);
		return payload;
	}
	
} 