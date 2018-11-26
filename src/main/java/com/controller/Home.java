package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.form.HomeForm;

@Controller
public class Home {

	@Autowired
	private HomeForm homeForm;
	
	public Home() {
		super();
	}

	@GetMapping(path="/")
	public String index(Model model) {
		model.addAttribute("demoForm", this.homeForm);
		return "index";
	}
	
}