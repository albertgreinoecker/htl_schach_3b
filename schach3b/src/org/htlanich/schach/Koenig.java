package org.htlanich.schach;

public class Koenig extends Figur {

	public Koenig(boolean farbeWeiss) {
		
		super(farbeWeiss, false);
	}
	
	public Koenig(boolean farbeWeiss, boolean bewegt) {
		super(farbeWeiss, bewegt);
		// TODO implement
	}

	public boolean spielZug(SpielFeld sp, Position von, Position nach) {
		// TODO implement
		return false;
	}

	public boolean spielzugMoeglich(SpielFeld sp, Position von, Position nach) {
		// TODO implement
		return false;
	}

	@Override
	public String toString() {
		return "K" + super.toString();
	}
}
