package org.htlanich.schach.test;

import static org.junit.jupiter.api.Assertions.*;

import org.htlanich.schach.Koenig;
import org.htlanich.schach.Position;
import org.htlanich.schach.SpielFeld;
import org.htlanich.schach.Spielfeldio;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KoenigTest {
	SpielFeld f1 = null;

	@BeforeEach
	void setUp() throws Exception {
		f1 = Spielfeldio.einlesen("testfelder/S1.txt");
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	void test() {
		Koenig k1 = (Koenig)f1.getFeld(x, y);
		boolean ok1 = k1.spielzugMoeglich(f1, new Position (5,0), new Position(5,2));
		Assert.assertTrue(ok1);
	}
	
	@Test
	void test() {
		
	}

}
