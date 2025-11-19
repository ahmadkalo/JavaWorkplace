package Schach;

public class Turm extends Schachfigur {

	public Turm(Punkt2D position, String farbe, boolean istWeiss, Schachfigur[][] schachbrett ) {
		super(position, farbe, istWeiss, schachbrett);
		
	}

	@Override
	public void step(int n, String r) throws UngueltigeBewegungException {

		int x = position.getX();
		int y = position.getY();
		
		int newX = x;
		int newY = y;


		if (r.equalsIgnoreCase("oben")) {
			newY += n;
		} else if (r.equalsIgnoreCase("unten")) {

			newY -= n;
		} else if (r.equalsIgnoreCase("rechts")) {

			newX += n;

		} else if (r.equalsIgnoreCase("links")) {

			newX -= n;
		} else {
			throw new UngueltigeBewegungException("Ungültige Richtung für den Turm");
		}
		if (newX < 0 || newX > 7 || newY < 0 || newY > 7) {
			throw new UngueltigeBewegungException("Bewegung außerhalb des Spielfelds");
		}


		schachbrett[y][x] = null;
		schachbrett[newY][newX] = this;
		position = new Punkt2D(newX, newY);

	}

}
