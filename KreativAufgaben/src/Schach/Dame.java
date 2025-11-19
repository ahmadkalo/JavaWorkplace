package Schach;

public class Dame extends Schachfigur {

	
	public Dame(Punkt2D position, String farbe, boolean istWeiss, Schachfigur[][] schachbrett) {
		super(position, farbe, istWeiss, schachbrett);
		
	}

	@Override
	public void step(int n, String r) throws UngueltigeBewegungException {

		int x = position.getX();
		int y = position.getY();
		int NewX = x;
		int NewY = y;


		if (r.equalsIgnoreCase("vorne")) {
			if(this.istWeiss) {
				NewY += n;
			} else {
				NewY -= n;
			}
		
		} else if (r.equalsIgnoreCase("hinten")) {
			if(this.istWeiss) {
				NewY -= n;
			} else {
				NewY += n;
			}

		} else if (r.equalsIgnoreCase("rechts")) {

			NewX += n;

		} else if (r.equalsIgnoreCase("links")) {

			NewX -= n;
		} else if (r.equalsIgnoreCase("oben links")) {
			NewX -= n;
			NewY += n;
		} else if (r.equalsIgnoreCase("unten links")) {
			NewX -= n;
			NewY -= n;
		} else if (r.equalsIgnoreCase("oben rechts")) {
			NewX += n;
			NewY += n;
		} else if (r.equalsIgnoreCase("unten rechts")) {
			NewX += n;
			NewY -= n;
		} else {
			throw new UngueltigeBewegungException("Ungültige Richtung für die Dame");
		}
		if (NewX < 0 || NewX > 7 ||NewY < 0 || NewY > 7) {
			throw new UngueltigeBewegungException("Bewegung außerhalb des Spielfelds");
		}
		
		schachbrett[y][x] = null;
        schachbrett[NewY][NewX] = this;

		position = new Punkt2D(NewY, NewX);

	}
	
	
	
	

}
