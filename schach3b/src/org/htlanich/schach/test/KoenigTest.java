package org.htlanich.schach.test;

import org.htlanich.schach.Koenig;
import org.htlanich.schach.Position;
import org.htlanich.schach.SpielFeld;
import org.htlanich.schach.Spielfeldio;
<<<<<<< HEAD
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KoenigTest {
	SpielFeld f1 = null;
	SpielFeld f2 = null;

	@BeforeEach
	void setUp() throws Exception {
		f1 = Spielfeldio.einlesen("testfelder/S1.txt");
		f2 = Spielfeldio.einlesen("testfelder/S2_waerhendSpiel");
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	void testOk1() {
		Koenig k1 = (Koenig)f1.getFeld(5, 0);
		boolean ok1 = k1.spielzugMoeglich(f1, new Position (5,0), new Position(5,1));
		Assert.assertTrue(ok1);
	}
	
	@Test
	void testOk2() {
		Koenig k1 = (Koenig)f1.getFeld(5, 0);
		boolean ok2 = k1.spielzugMoeglich(f1, new Position (5,0), new Position(4,0));
		Assert.assertTrue(ok2);
		
	}
	
	@Test
	void testOk3() {
		Koenig k1 = (Koenig)f1.getFeld(5, 0);
		boolean ok3 = k1.spielzugMoeglich(f1, new Position (5,0), new Position(4,1));
		Assert.assertTrue(ok3);
		
	}
	
	@Test
	void testOk4() {
		Koenig k1 = (Koenig)f1.getFeld(5, 0);
		boolean ok4 = k1.spielzugMoeglich(f1, new Position (5,0), new Position(6,1));
		Assert.assertTrue(ok4);
		
	}
	
	@Test
	void testOk5() {
		Koenig k1 = (Koenig)f1.getFeld(5, 0);
		boolean ok5 = k1.spielzugMoeglich(f1, new Position (5,0), new Position(6,0));
		Assert.assertTrue(ok5);
=======
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;


class KoenigTest {
	SpielFeld f1 = null;
	SpielFeld f2 = null;
	
	@BeforeEach
	void setUp() throws Exception {
		f1 = Spielfeldio.einlesen("testfelder/S1.txt");
		f2 = Spielfeldio.einlesen("testfelder/S2_waehrendSpiel.txt");
	}

	@AfterEach
	void tearDown() throws Exception 
	{
	}

	@Test
	void startPositionsTest() {
		Koenig k1 = (Koenig)f1.getFeld(0,3);
		boolean nichtOk1 = k1.spielzugMoeglich(f1, new Position(0,3), new Position(0,4));
		Assert.assertFalse(nichtOk1);
>>>>>>> branch 'master' of https://github.com/albertgreinoecker/htl_schach_3b.git
		
	}

}
