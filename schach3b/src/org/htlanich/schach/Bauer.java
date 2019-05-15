package org.htlanich.schach;

public class Bauer extends Figur {
	private String BW;
	private String BS;
	
	public Bauer(boolean farbeWeiss, boolean bewegt, String bW, String bS) {
		super(farbeWeiss, bewegt);
		BW = bW;
		BS = bS;
	}

	public boolean spielZug(SpielFeld sp, Position von, Position nach) {
		// TODO: implement
		return false;
	}

	public boolean spielzugMoeglich(SpielFeld sp, Position von, Position nach) {
		// TODO: implement
		return false;
	}
	public String toString()
	{
		return "B" + super.toString();
	}
}
