package org.htlanich.schach;

public class SpielFeld {
	private Feld[][] mat = new Feld[8][8];
	private boolean werAmZug;

	public SpielFeld(Feld[][] mat, boolean werAmZug) {
		this.mat = mat;
		this.werAmZug = werAmZug;
	}

	public Feld[][] getMat() {
		return mat;
	}

	public void setMat(Feld[][] mat) {
		this.mat = mat;
	}

	public boolean isWerAmZug() {
		return werAmZug;
	}

	public void setWerAmZug(boolean werAmZug) {
		this.werAmZug = werAmZug;
	}

	public void ausgabe() {

	}

	public boolean schach() {
		return false;
	}

	public boolean schachMatt() {
		return false;
	}

	public boolean spielzug(String zug) {
		return false;
	}

	public Position schach2koordinate(String schach) {
		return null;
	}
}
