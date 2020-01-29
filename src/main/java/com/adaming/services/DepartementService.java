package com.adaming.services;

import java.util.List;

import com.adaming.controllers.models.Departement;

public interface DepartementService {
	public Departement save(Departement departement);
	
	public Departement findById(Long id);
	
	public List<Departement> findAll();
}
