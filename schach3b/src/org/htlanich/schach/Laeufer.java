package org.htlanich.schach;

public class Laeufer extends Figur {

	public Laeufer(boolean farbeWeiss, boolean bewegt) {
		super(farbeWeiss, bewegt);
	}

	public Laeufer(boolean farbeWeiss) {
		super(farbeWeiss, false);
	}

	public boolean spielZug(SpielFeld sp, Position von, Position nach) {
		// TODO implement
		return false;
	}

	public boolean spielzugMoeglich(SpielFeld sp, Position von, Position nach) {

		int dx = Math.abs(von.x - nach.x);
		int dy = Math.abs(von.y - nach.y);

		if (dy == dx) {
			// rechtsunten nach linksoben
			if (von.x > nach.x && von.y > nach.y) {
				for (int i = 1; i < dy - 1; i++) {
					if (sp.isFigur(von.x + i, von.y - i)) {
						return false;
					}
				}

			}

			// Rechtsoben nach linksunten
			else if (von.x > nach.x && von.y < nach.y) {
				for (int i = 1; i < dy - 1; i++) {
					if (sp.isFigur(von.x - i, von.y + i)) {
						return false;
					}
				}

			}

			// linksunten nach rechtsoben
			else if (von.x < nach.x && von.y > nach.y) {
				for (int i = 1; i < dy - 1; i++) {
					if (sp.isFigur(von.x + i, von.y - i)) {
						return false;
					}
				}

			}

			// linksoben nach rechtsunten
			else if (von.x < nach.x && von.y < nach.y) {
				for (int i = 1; i < dy - 1; i++) {
					if (sp.isFigur(von.x - i, von.y + i)) {
						return false;
					}
				}

			}

		}

		return true;
	}

	@Override
	public String toString() {
		return "L" + super.toString();
	}
}
