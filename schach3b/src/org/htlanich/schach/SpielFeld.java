package org.htlanich.schach;

/**
@author toalba
*/
public class SpielFeld {
	private Feld[][] mat = new Feld[8][8];
	private boolean werAmZug;

	public SpielFeld() {
		
	}
	
	public SpielFeld(Feld[][] mat) {
		this(mat, true);
	}
	
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

		/*if(Koenig.spielzugMoeglich = false )
		{
			return true;
		} */
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
	
	public Feld getFeld(int x, int y)
	{
		return mat[x][y];
	}
}
