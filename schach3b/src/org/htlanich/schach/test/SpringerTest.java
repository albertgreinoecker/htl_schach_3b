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
	
	@BeforeEach
	void setUp() throws Exception {
		f1 = Spielfeldio.einlesen("testfelder/S1.txt");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testStartpositionNichtOk1() {
		Springer s1 = (Springer)f1.getFeld(0, 1);
		boolean ok1 = s1.spielzugMoeglich(f1, new Position(0,1), new Position(0,2));
		Assert.assertFalse(ok1);
	}

	@Test
	void testStartpositionOk2() {
		Springer s1 = (Springer)f1.getFeld(0, 1);
		boolean ok2 = s1.spielzugMoeglich(f1, new Position(0,1), new Position(2,2));
		Assert.assertTrue(ok2);
	}
}
