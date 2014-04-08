package com.grydl.project.test.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.grydl.project.test.Utilisateur;
import com.grydl.project.test.service.TransfertService;

@Named
public class TransfertServiceImpl implements TransfertService {
	
	@Inject
	String titre;
	
	@PostConstruct
	private void init(){
		System.out.println("Initialisation de la classe ..");		
	}
	
	@PreDestroy
	private void destruction(){
		System.out.println("Destruction de la classe ...");
	}

	@Override
	public Boolean crediter(Integer montant, Utilisateur debiteur,
			Utilisateur crediteur) {
		debiteur.setCompte(debiteur.getCompte()-montant);
		crediteur.setCompte(crediteur.getCompte()+montant);
		return true;
	}

	@Override
	public Boolean debiter(Integer montant, Utilisateur debiteur,
			Utilisateur crediteur) {
		debiteur.setCompte(debiteur.getCompte()+montant);
		crediteur.setCompte(crediteur.getCompte()-montant);
		return true;
	}

	@Override
	public void setTitre(String titre) {
		System.out.println(" Valeur "+titre);
		
	}

	

}
