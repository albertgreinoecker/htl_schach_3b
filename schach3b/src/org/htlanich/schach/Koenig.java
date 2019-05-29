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
		int dx = Math.abs(nach.x-von.x);
		int dy = Math.abs(nach.y-von.y);
		
		return super.spielzugMoeglich(sp, von, nach) && ((dx<=1)&&(dy<=1));
	}

	@Override
	public String toString() {
		return "K" + super.toString();
	}
}
