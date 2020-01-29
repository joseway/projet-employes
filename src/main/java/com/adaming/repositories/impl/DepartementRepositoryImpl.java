package com.adaming.repositories.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.adaming.controllers.models.Departement;
import com.adaming.repositories.DepartementRepository;

@Repository
@Transactional
public class DepartementRepositoryImpl implements DepartementRepository{

	@PersistenceContext
	private EntityManager em;
	
	public Departement save(Departement departement) {
		
		return em.merge(departement);
	}

	public Departement findById(Long id) {
	
		return em.find(Departement.class, id);
	}

	public List<Departement> findAll() {
		
		return em.createQuery("from Departement").getResultList();
	}

}
