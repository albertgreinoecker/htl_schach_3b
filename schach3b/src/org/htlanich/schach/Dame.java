package org.htlanich.schach;

public class Dame extends Figur {

	public Dame(boolean farbeWeiss) {
		super(farbeWeiss, false);
	}
	
	public Dame(boolean farbeWeiss, boolean bewegt) {
		super(farbeWeiss, bewegt);
		// TODO implement
	}

	public boolean spielZug(SpielFeld sp, Position von, Position nach) {
		// TODO: implement
		return false;
	}

	public boolean spielzugMoeglich(SpielFeld sp, Position von, Position nach) {
		// TODO: implemen
		return false;
	}
	
	@Override
	public String toString() {
		return "D" + super.toString();
	}
}
