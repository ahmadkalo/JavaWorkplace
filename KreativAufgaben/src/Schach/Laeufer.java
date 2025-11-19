package Schach;

public class Laeufer extends Schachfigur {

	public Laeufer(Punkt2D position, String farbe, boolean istWeiss, Schachfigur[][] schachbrett) {
		super(position, farbe, istWeiss, schachbrett);

	}

	@Override
	public void step(int n, String r) throws UngueltigeBewegungException {
		int x = position.getX();
		int y = position.getY();
		int newX = x;
		int newY = y;

		if (r.equalsIgnoreCase("vorne links")) { 
			if(this.istWeiss) {
				newX -= n;
				newY += n;	
			} else {
				newX -= n;
				newY -= n;	
			}
			
		} else if (r.equalsIgnoreCase("hinten links")) {
			if(this.istWeiss) {
				newX -= n;
				newY -= n;	
			} else {
				newX -= n;
				newY += n;	
			}
			
		} else if (r.equalsIgnoreCase("vorne rechts")) {
			if(this.istWeiss) {
				newX += n;
				newY += n;
			} else {
				newX += n;
				newY -= n;
			}
			
		} else if (r.equalsIgnoreCase("hinten rechts")) {
			if(this.istWeiss) {
				newX += n;
				newY -= n;	
			} else {
				newX += n;
				newY += n;	
			}
		
		} else {
			throw new UngueltigeBewegungException("Ungültige Richtung für den Läufer");
		}
		if (x < 0 || x > 7 || y < 0 || y > 7) {
			throw new UngueltigeBewegungException("Bewegung außerhalb des Spielfelds");
		}

		position = new Punkt2D(x, y);

		schachbrett[y][x] = null;
		schachbrett[newY][newX] = this;
		position = new Punkt2D(newX, newY);

	}

}
