package org.htlanich.schach.test;

import org.htlanich.schach.Position;
import org.htlanich.schach.SpielFeld;
import org.htlanich.schach.Spielfeldio;
import org.htlanich.schach.Springer;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SpringerTest {
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
	void testStartpositionNichtOk1() 
	{
		Springer s1 = (Springer)f1.getFeld(0, 1);
		boolean nichtOk1 = s1.spielzugMoeglich(f1, new Position(0,1), new Position(0,2));
		Assert.assertFalse(nichtOk1);
	}
	
	@Test
	void testStartpositionNichtOk2() 
	{
		Springer s1 = (Springer)f2.getFeld(4, 5);
		boolean nichtOk2 = s1.spielzugMoeglich(f2, new Position(4,5), new Position(2,4));
		Assert.assertFalse(nichtOk2);
	}

	@Test
	void testStartpositionOk1() {
		Springer s1 = (Springer)f1.getFeld(0, 1);
		boolean ok1 = s1.spielzugMoeglich(f1, new Position(0,1), new Position(2,2));
		Assert.assertTrue(ok1);
	}
	
	@Test
	void testStartpositionOk2() {
		Springer s1 = (Springer)f2.getFeld(4, 5);
		boolean ok2 = s1.spielzugMoeglich(f2, new Position(4,5), new Position(2,6));
		Assert.assertTrue(ok2);
	}
}
