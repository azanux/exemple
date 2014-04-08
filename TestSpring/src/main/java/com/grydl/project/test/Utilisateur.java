package com.grydl.project.test;

public class Utilisateur {
	
	

	public Utilisateur(String nom, Integer compte) {
		this.nom = nom;
		this.compte = compte;
	}

	private String nom;
	
	private Integer compte;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getCompte() {
		return compte;
	}

	public void setCompte(Integer compte) {
		this.compte = compte;
	}

	
	
}
