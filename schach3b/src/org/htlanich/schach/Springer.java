package org.htlanich.schach;

public class Springer extends Figur 
{

	public Springer(boolean farbeWeiss)
	{
		super(farbeWeiss, false);
	}
	
	public Springer(boolean farbeWeiss, boolean bewegt) 
	{
		super(farbeWeiss, bewegt);
		// TODO implement
	}

	public boolean spielZug(SpielFeld sp, Position von, Position nach) {
		// TODO implement
		return false;
	}

	public boolean spielzugMoeglich(SpielFeld sp, Position von, Position nach) {
		int dx = Math.abs(von.x -nach.x);
		int dy = Math.abs(von-y -nach.y);
		return(dx == 2 && dy == 1) || (dx == 1 && dy == 2);
	}
	 
	@Override
	public String toString()
	{
		return "S" + super.toString();
	}
}
