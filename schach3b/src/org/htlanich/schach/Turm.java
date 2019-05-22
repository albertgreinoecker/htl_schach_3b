package org.htlanich.schach;

public class Turm extends Figur {
	
	public Turm(boolean farbeWeiss)
	{
		super(farbeWeiss, false);
		
	}

	public Turm(boolean farbeWeiss, boolean bewegt) {
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
	public String toString()
	{
		
		return "T" + super.toString();
	}
}
