package Schach;

public class Bauer extends Schachfigur {

    static int anzahlWeisseBauern = 0;
    static int anzahlSchwarzeBauern = 0;
    private int objektNummer;
  

    public Bauer(Punkt2D position, String farbe, boolean istWeiss, Schachfigur[][] schachbrett) {
        super(position, farbe, istWeiss, schachbrett);
        
        if (istWeiss) {
            this.objektNummer = anzahlWeisseBauern++;
        } else {
            this.objektNummer = anzahlSchwarzeBauern++;
        }
        
    }

    public static int getAnzahlWeisseBauern() {
        return anzahlWeisseBauern;
    }

    public static int getAnzahlSchwarzeBauern() {
        return anzahlSchwarzeBauern;
    }

    @Override
    public void step(int n, String r) throws UngueltigeBewegungException {
        int x = position.getX();
        int y = position.getY();
        int newY = y;

        if (r.equalsIgnoreCase("vorne") && n == 1) {
            if (istWeiss) {
                newY += n;
            } else {
                newY -= n;
            }
        } else {
            throw new UngueltigeBewegungException("Ungültige Richtung für den Bauer");
        }
        if (x < 0 || x > 7 || newY < 0 || newY > 7) {
            throw new UngueltigeBewegungException("Bewegung außerhalb des Spielfelds");
        }

    
        schachbrett[y][x] = null;
        schachbrett[newY][x] = this;
        position = new Punkt2D(x, newY);
    }

    @Override
    public String toString() {
        if (istWeiss) {
            return "Weißer " + getClass().getSimpleName() + " " + (objektNummer + 1) + ", Position: " + position;
        } else {
            return "Schwarzer " + getClass().getSimpleName() + " " + (objektNummer + 1) + ", Position: " + position;
        }
    }
}
