package com.grydl.project.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.grydl.project.test.service.TransfertService;
/**
 * Ceci est le code java de la solution, pour faire les tests GIT
 * @author azanlekor
 *
 */
public class AppContext {

	private static ApplicationContext app;

	public static void main(String[] args) {
		
		app = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TransfertService transfertService = (TransfertService) app.getBean(TransfertService.class);
		
		Utilisateur uti1 = new Utilisateur("LAURENT", 1000);
		Utilisateur uti2 = new Utilisateur("PEROUSE", 1300);
		
		transfertService.crediter(200, uti1, uti2);
		
		System.out.println(" Utilisateur "+uti1.getNom()+" Solde "+uti1.getCompte());
		System.out.println(" Utilisateur "+uti2.getNom()+" Solde "+uti2.getCompte());
		
	
		

	}

}
