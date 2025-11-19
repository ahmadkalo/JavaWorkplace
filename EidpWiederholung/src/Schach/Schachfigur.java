package Schach;


public abstract class Schachfigur extends Spielfigur {
    protected boolean istWeiss;

    public Schachfigur(Punkt2D position, String farbe, boolean istWeiss) {
        super(position, farbe);
        this.istWeiss = istWeiss;
    }

    public boolean istWeiss() {
        return istWeiss;
    }

    @Override
    public String toString() {
       return (istWeiss ? "Weißer " : "Schwarzer ") + getClass().getSimpleName() + ", Position: " + position;
    }

	
		
		
	
}
