package com.grydl.project.test.service;

import com.grydl.project.test.Utilisateur;


public interface TransfertService {
	
	public void setTitre(String titre);
	
	public Boolean crediter(Integer montant,Utilisateur debiteur,Utilisateur crediteur);
	
	public Boolean debiter(Integer montant,Utilisateur debiteur,Utilisateur crediteur);

}
