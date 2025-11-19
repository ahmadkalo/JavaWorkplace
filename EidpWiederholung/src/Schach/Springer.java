package Schach;



public class Springer extends Schachfigur {
	
	public Springer(Punkt2D position, String farbe, boolean istWeiss) {
		super(position, farbe, istWeiss);
	}

	@Override
	public void step(int n, String r) throws UngueltigeBewegungException {
		int x = position.getX();
		int y = position.getY();

		if (r.equals("NOO")) { // (North-East-East): Zwei Felder nach rechts und ein Feld nach oben.
			x += 2;
			y -= 1;
		} else if (r.equals("OON")) { // (East-East-North): Ein Feld nach rechts und zwei Felder nach oben.
			x += 1;
			y -= 2;
		} else if (r.equals("OO")) { // (East-East-South): Zwei Felder nach rechts und ein Feld nach unten.
			x += 2;
			y += 1;
		} else if (r.equals("SSO")) { // (South-South-East): Ein Feld nach rechts und zwei Felder nach unten.
			x += 1;
			y += 2;
		} else if (r.equals("SS")) { //(South-South-West): Zwei Felder nach links und ein Feld nach unten.
			x -= 2;
			y += 1;
		} else if (r.equals("SWW")) { // SWW (South-West-West): Ein Feld nach links und zwei Felder nach unten.
			x -= 1;
			y += 2;
		} else if (r.equals("WW")) { // (West-West-North): Zwei Felder nach links und ein Feld nach oben.
			x -= 2;
			y -= 1;
		} else if (r.equals("NNW")) {  //(North-North-West): Ein Feld nach links und zwei Felder nach oben.
			x -= 1;
			y -= 2;
		} else {
			throw new UngueltigeBewegungException("Ungültige Richtung für den Springer");
		}

		if (x < 0 || x > 7 || y < 0 || y > 7) {
			throw new UngueltigeBewegungException("Bewegung außerhalb des Spielfelds");
		}

		position = new Punkt2D(x, y);
	}
}
