package com.adaming.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adaming.controllers.models.Employe;
import com.adaming.services.DepartementService;
import com.adaming.services.EmployeService;

@Controller
@RequestMapping(value="/employes")
public class EmployeController {
	@Autowired
	private EmployeService employeService;
	
	@Autowired
	private DepartementService departementService;
	
	@RequestMapping(value="")
	public String emps(Model model) {
		model.addAttribute("employes", employeService.findAll());
		
		return "employes";
	}
	@RequestMapping(value="/creer")
	public String creer(Model model) {
		model.addAttribute("title", "Creer Employe");
		model.addAttribute("employe", new Employe());		
		model.addAttribute("departements", departementService.findAll());
		
		return "nouvelEmploye";
	}
	@RequestMapping(value="/creer", method=RequestMethod.POST)
	public String creer(@ModelAttribute("employe")Employe employe, Model model) {
		Long eid = Long.parseLong(employe.getDepartement().getNom());
		employe.setDepartement(departementService.findById(eid));
		
		System.out.println(employe);
		
		employeService.save(employe);
		return "redirect:/departements";
	}
	@RequestMapping(value="/{id}")
	public String edit(@PathVariable("id")Long id, Model model) {
		Employe emp = employeService.findById(id);
		model.addAttribute("employe", emp);
		model.addAttribute("departements", departementService.findAll());
		return "employe";
	}
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	public String edit(@ModelAttribute("employe")Employe emp) {
		employeService.save(emp);
		return "redirect:/employes";
	}
}
