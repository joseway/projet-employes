package com.adaming.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adaming.controllers.models.Departement;
import com.adaming.services.DepartementService;

@Controller
@RequestMapping(value="/departements")
public class DepartementController {

	@Autowired
	private DepartementService departementService;
	
	@RequestMapping(value="")
	public String depts(Model model) {
		model.addAttribute("title", "Nos Departement");
		model.addAttribute("departements", departementService.findAll());
		return "departements";
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public String save(@ModelAttribute("departement")Departement dept) {
		departementService.save(dept);
		
		return "redirect:/";
	}
	@RequestMapping(value="/nouveau-dept")
	public String nouveauDept(Model model) {
		model.addAttribute("title", "Creer un departement");
		model.addAttribute("departement", new Departement());
		return "nouveauDepartement";
	}
	@RequestMapping(value="/{id}")
	public String findById(@PathVariable("id")Long id, Model model) {
		model.addAttribute("departement", departementService.findById(id));
		
		return "departement";
	}
}
