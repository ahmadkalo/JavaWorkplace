package Schach;

public class Springer extends Schachfigur {

	public Springer(Punkt2D position, String farbe, boolean istWeiss, Schachfigur[][] schachbrett) {
		super(position, farbe, istWeiss, schachbrett);
	}

	@Override
	public void step(int n, String r) throws UngueltigeBewegungException {
		int x = position.getX();
		int y = position.getY();

		int newX = x;
		int newY = y;

		if (r.equalsIgnoreCase("RRO") && n==1) { //  Zwei Felder nach rechts und ein Feld nach oben.
			if(this.istWeiss) {
				newX += 2;
				newY += 1;	
			} else {
				newX += 2;
				newY -= 1;	
			}
			
		} else if (r.equalsIgnoreCase("ROO")&& n==1 ) { // Ein Feld nach rechts und zwei Felder nach oben.
			newX += 1;
			newY += 2;
		} else if (r.equalsIgnoreCase("RRU")&& n==1) { //  Zwei Felder nach rechts und ein Feld nach unten.
			newX += 2;
			newY -= 1;
		} else if (r.equalsIgnoreCase("RUU") && n==1) { //  Ein Feld nach rechts und zwei Felder nach unten.
			newX += 1;
			newY -= 2;
		} else if (r.equalsIgnoreCase("LLU")&& n==1) { //  Zwei Felder nach links und ein Feld nach unten.
			newX -= 2;
			newY -= 1;
		} else if (r.equalsIgnoreCase("LUU")&& n==1) { // Ein Feld nach links und zwei Felder nach unten.
			newX -= 1;
			newY -= 2;
		} else if (r.equalsIgnoreCase("LLO")&& n==1) { //  Zwei Felder nach links und ein Feld nach oben.
			newX -= 2;
			newY += 1;
		} else if (r.equalsIgnoreCase("LOO")&& n==1) { //  Ein Feld nach links und zwei Felder nach oben.
			newX -= 1;
			newY += 2;
		} else {
			throw new UngueltigeBewegungException("Ungültige Richtung für den Springer");
		}

		if (newX < 0 || newX > 7 || newY < 0 || newY > 7) {
			throw new UngueltigeBewegungException("Bewegung außerhalb des Spielfelds");
		}

		schachbrett[y][x] = null;
		schachbrett[newY][newX] = this;
		position = new Punkt2D(newX, newY);

	}
}
