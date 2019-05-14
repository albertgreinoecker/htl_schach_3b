package org.htlanich.schach;

public class Figur extends Feld {
	private boolean farbeWeiss;
	private boolean bewegt;

	public Figur(boolean farbeWeiss, boolean bewegt) {
		this.farbeWeiss = farbeWeiss;
		this.bewegt = bewegt;
	}

	public boolean isFarbeWeiss() {
		return farbeWeiss;
	}

	public void setFarbeWeiss(boolean farbeWeiss) {
		this.farbeWeiss = farbeWeiss;
	}

	public boolean isBewegt() {
		return bewegt;
	}

	public void setBewegt(boolean bewegt) {
		this.bewegt = bewegt;
	}

	public boolean spielZug(SpielFeld sp, Position von, Position nach) {
		// TODO: implement
		return false;
	}

	public boolean spielzugMoeglich(SpielFeld sp, Position von, Position nach) {
		// TODO: implement
		return false;
	}
}
