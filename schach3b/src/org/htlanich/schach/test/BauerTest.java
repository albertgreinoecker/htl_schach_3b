package org.htlanich.schach.test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.htlanich.schach.Position;
import org.htlanich.schach.SpielFeld;
import org.htlanich.schach.Spielfeldio;
import org.htlanich.schach.Bauer;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BauerTest {
	SpielFeld f1 = null;

	@BeforeEach
	void setUp() throws Exception {
		f1 = Spielfeldio.einlesen("testfelder/B1.txt");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void testStartpositionNichtOk1() {
		Bauer b1 = (Bauer) f1.getFeld(0, 2);
		boolean ok1 = b1.spielzugMoeglich(f1, new Position(0, 2), new Position(2, 1));
		Assert.assertFalse(ok1);
	}

	@Test
	void testStartpositionNichtOk2() {
		Bauer b1 = (Bauer) f1.getFeld(0, 2);
		boolean ok1 = b1.spielzugMoeglich(f1, new Position(0, 2), new Position(0, 5));
		Assert.assertFalse(ok1);
	}

	@Test
	void testStartpositionOk1() {
		Bauer b1 = (Bauer) f1.getFeld(0, 2);
		boolean ok2 = b1.spielzugMoeglich(f1, new Position(0, 2), new Position(0, 3));
		Assert.assertTrue(ok2);
	}

	@Test
	void testStartpositionOk2() {
		Bauer b1 = (Bauer) f1.getFeld(0, 2);
		boolean ok3 = b1.spielzugMoeglich(f1, new Position(0, 2), new Position(0, 4));
		Assert.assertTrue(ok3);
	}
	
	@Test
	void testStartpositionOk3() {
		Bauer b1 = (Bauer) f1.getFeld(0, 4);
		boolean ok3 = b1.spielzugMoeglich(f1, new Position(0, 4), new Position(1, 5));
		Assert.assertTrue(ok3);
	}

}
