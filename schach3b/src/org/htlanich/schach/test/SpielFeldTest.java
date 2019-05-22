package org.htlanich.schach.test;

import org.htlanich.schach.SpielFeld;
import org.htlanich.schach.Spielfeldio;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SpielFeldTest {
	SpielFeld start = null;
	
	@BeforeEach
	void setUp() throws Exception {
		start = Spielfeldio.einlesen("start.txt");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAusgabeStart() {
		start.ausgabe();
	}

}
