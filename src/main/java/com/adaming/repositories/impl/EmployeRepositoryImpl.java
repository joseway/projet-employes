package com.adaming.repositories.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.adaming.controllers.models.Employe;
import com.adaming.repositories.EmployeRepository;

@Repository
@Transactional
public class EmployeRepositoryImpl implements EmployeRepository{

	@PersistenceContext
	private EntityManager em;
	
	public Employe save(Employe employe) {
		
		return em.merge(employe);
	}

	public Employe findById(Long id) {
		
		return em.find(Employe.class, id);
	}

	public List<Employe> findAll() {
		
		return em.createQuery("from Employe").getResultList();
	}

}
