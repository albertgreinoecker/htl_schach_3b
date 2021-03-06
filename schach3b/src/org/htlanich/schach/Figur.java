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
		if (spielzugMoeglich(sp, von, nach)) {
			Feld f = sp.getFeld(von.x, von.y);
			sp.setFeld(nach.x, nach.y, f);
			sp.setFeld(von.x, von.y, new Feld());
			return true;
		}
		return false;
	}

	public boolean spielzugMoeglich(SpielFeld sp, Position von, Position nach) {
		Feld nachFeld = sp.getFeld(nach.x, nach.x);
		if (nachFeld instanceof Figur) {
			Figur f = (Figur) nachFeld;
			return !von.equals(nach) && f.farbeWeiss != farbeWeiss;
		}
		return !von.equals(nach);
	}

	@Override
	public String toString() {
		if (farbeWeiss)
			return "W";
		else
			return "B";
	}
}
