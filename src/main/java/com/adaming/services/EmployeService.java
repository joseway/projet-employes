package com.adaming.services;

import java.util.List;

import com.adaming.controllers.models.Employe;

public interface EmployeService {
	public Employe save(Employe employe);
	
	public Employe findById(Long id);
	
	public List<Employe> findAll();
}
