package Schach;


public class Bauer extends Schachfigur {
	
	static int anzahlSpielFiguren = 0;
	private int objektNummer; 
	    public Bauer(Punkt2D position, String farbe, boolean istWeiss) {
        super(position, farbe, istWeiss);
        this.objektNummer = anzahlSpielFiguren++;
    }
    
    public static int getAnzahlSpielFiguren() {
		return anzahlSpielFiguren;
	}

    @Override
	public void step(int n, String r) throws UngueltigeBewegungException {

		int x = position.getX();
		int y = position.getY();

		if (r.equals("vorne") && n == 1) {
			if(istWeiss) {
				y += n;	
			} else {
				y -= n;	
			}

			
		
		} else {
			throw new UngueltigeBewegungException("Ungültige Richtung für den König");
		}
		if (x < 0 || x > 7 || y < 0 || y > 7) {
			throw new UngueltigeBewegungException("Bewegung außerhalb des Spielfelds");
		}

		position = new Punkt2D(x, y);

	}
    
    @Override
    public String toString() {
    	
    	return   (istWeiss ? "Weißer " : "Schwarzer ") + getClass().getSimpleName() + " " + (objektNummer+1) + ", Position: " + position;
    }
}

