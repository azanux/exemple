package com.grydl.project.test.unit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.grydl.project.test.Utilisateur;
import com.grydl.project.test.service.TransfertService;

@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TransfertServiceTest {
	
	Utilisateur uti1;
	Utilisateur uti2;
	
	@Autowired
	private TransfertService transfertservice;
	
	@Before
	public void initialisation(){
		uti1 = new Utilisateur("LAURENT", 1000);
		uti2 = new Utilisateur("PEROUSE", 1300);
		
		
	}
	


	@Test
	public void testCrediter() {

		transfertservice.crediter(200, uti1, uti2);
		System.out.println(uti1.getCompte());
		Assert.assertTrue("crediter", uti1.getCompte().equals(800));
		Assert.assertTrue("crediter", uti2.getCompte().equals(1500));
	}

	@Test
	public void testDebiter() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTitre() {
		fail("Not yet implemented");
	}

}
