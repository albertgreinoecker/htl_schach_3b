package org.htlanich.schach;

/**
@author toalba
*/
public class SpielFeld {
	// 0,0 ist links oben
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
		for (int i = 0; i < mat.length;i++)
		{
			for (int j = 0; j < mat[0].length;j++)
			{
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
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

	public boolean spielZug(Position von, Position nach)
	{
		return false;
	}
	
	public boolean spielzug(String zug) {
		return false;
	}

	public static Position schach2koordinate(String schach) {
		return null;
	}
	
	public Feld getFeld(int x, int y)
	{
		return mat[x][y];
	}
}
