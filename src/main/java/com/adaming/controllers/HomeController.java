package com.adaming.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adaming.services.DepartementService;

@Controller
public class HomeController {
	@Autowired
	private DepartementService departementService;
	
	@RequestMapping(value="/")
	public String honePage(Model model) {
		model.addAttribute("title", "Tous les departements");
		model.addAttribute("departements", departementService.findAll());
		
		return "index";
	}
}
