package org.htlanich.schach.test;

import org.htlanich.schach.Koenig;
import org.htlanich.schach.Position;
import org.htlanich.schach.SpielFeld;
import org.htlanich.schach.Spielfeldio;
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
		
	}

}
