package com.adaming.repositories;

import java.util.List;

import com.adaming.controllers.models.Employe;

public interface EmployeRepository {
	public Employe save(Employe employe);
	
	public Employe findById(Long employe);
	
	public List<Employe> findAll();
}
