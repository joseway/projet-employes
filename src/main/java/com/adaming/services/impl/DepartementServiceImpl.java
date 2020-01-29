package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.controllers.models.Departement;
import com.adaming.repositories.DepartementRepository;
import com.adaming.services.DepartementService;

@Service
public class DepartementServiceImpl implements DepartementService{

	@Autowired
	private DepartementRepository departementRepository;
	public Departement save(Departement departement) {
		
		return departementRepository.save(departement);
	}

	public Departement findById(Long id) {

		return departementRepository.findById(id);
	}

	public List<Departement> findAll() {
		
		return departementRepository.findAll();
	}

}
