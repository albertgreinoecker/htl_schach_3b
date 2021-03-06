package org.htlanich.schach;

import java.util.ArrayList;
import java.util.List;

/**
@author toalba
*/
public class SpielFeld extends Figur {
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

	ArrayList<Position> figs = new ArrayList<Position>();
	private List<Position> getFiguren(boolean weiss)
	{
		
		for (int i = 0; i < mat.length;i++)
		{
			for (int j = 0; j < mat[0].length;j++)
			{
				if (getFeld(i, j) instanceof Figur)
				{
					figs.add(new Position(i, j));
				}
			}
		}
		return null;
	}
	
	private Position getKoenig(boolean weiss)
	{
		for (int i = 0; i < mat.length;i++)
		{
			for (int j = 0; j < mat[0].length;j++)
			{
				if (getFeld(i, j) instanceof Koenig)
				{
					Koenig k = (Koenig) getFeld(i, j);
					if (k.isFarbeWeiss() == weiss)
					{
						return new Position(i, j);
					}
				}
			}
		}
		return null;
	}
	
	public boolean schach() {

		return false;
	}
	
	private boolean schach(boolean weiss) 
	{
		for(int i = 0; i < figs.size(); i++)
		{
			Position X = figs.get(i); 
			Position nachY = figs.get(i++);
			spielzugMoeglich(getFigur, x, nachX);
		}
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
	
	public void setFeld(int x, int y, Feld f)
	{
		mat[x][y] = f;
	}
	public boolean isFigur(int x, int y)
	{
		return getFeld(x, y) instanceof Figur;
	}
}
