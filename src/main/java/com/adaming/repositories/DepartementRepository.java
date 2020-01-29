package com.adaming.repositories;

import java.util.List;

import com.adaming.controllers.models.Departement;

public interface DepartementRepository {
	public Departement save(Departement departement);
	
	public Departement findById(Long id);
	
	public List<Departement> findAll();
}
