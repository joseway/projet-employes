package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.controllers.models.Employe;
import com.adaming.repositories.EmployeRepository;
import com.adaming.services.EmployeService;

@Service
public class EmployeServiceImpl implements EmployeService{

	@Autowired
	private EmployeRepository employeRepository;
	
	public Employe save(Employe employe) {
		
		return employeRepository.save(employe);
	}

	public Employe findById(Long id) {
		
		return employeRepository.findById(id);
	}

	public List<Employe> findAll() {
		
		return employeRepository.findAll();
	}

}
