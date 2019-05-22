package org.htlanich.schach;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Spielfeldio {
	
	/**
	 * @param f z.B. BW oder __
	 * @return ein Objekt vom Typ Feld, wenn es ein leeres Feld ist,
	 * eine konkrete Figur, wenn es eine Spielfigur ist
	 * Factory
	 */	
	private static Feld leseFeld(String f)
	{
		char typ = f.charAt(0); //z.B Bauer
		char farbe = f.charAt(1); //z.B. W für Weiss
		boolean farbeW = (farbe == 'W');
		
		switch(typ)
		{
			case 'T' : return new Turm(farbeW);
			case 'S' : return new Springer(farbeW);
			case 'L' : return new Laeufer(farbeW);
			case 'K' : return new Koenig(farbeW);
			case 'D' : return new Dame(farbeW);
			case 'B' : return new Bauer(farbeW);
			default: return new Feld();
		}
	}
	
	static public SpielFeld einlesen(String fName) throws FileNotFoundException
	{
		
		Scanner s = new Scanner (new File(fName));
		int zeile = 0;
		Feld[][] feld = new Feld[8][8];
		while (s.hasNextLine())
		{
			String line = s.nextLine(); //z.B. TW|SW|LW|DW|KW|LW|SW|TW
			String[] figs = line.split("\\|");	//z.B. figs = {"TW", "SW" ,... }	
			for (int spalte = 0; spalte < figs.length;spalte++)
			{
				Feld f = leseFeld(figs[spalte]); 
				feld[zeile][spalte]  = f; //setze die aktuelle Figur auf das Spielfeld
			}
			zeile++;
		}
		s.close();
		return new SpielFeld(feld);
	}
	
	
	public static void main(String[] args) {
		try {
			SpielFeld f = Spielfeldio.einlesen("start.txt");
			f.ausgabe();
			System.out.println(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
