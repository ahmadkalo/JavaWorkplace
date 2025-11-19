package Schach;


public abstract class Schachfigur extends Spielfigur {
    protected boolean istWeiss;

    public Schachfigur[][] schachbrett;
    public Schachfigur(Punkt2D position, String farbe, boolean istWeiss, Schachfigur[][] schachbrett) {
        super(position, farbe);
        this.istWeiss = istWeiss;
        this.schachbrett = schachbrett;
        schachbrett[position.getY()][position.getX()] = this;
        
    }

    public boolean istWeiss() {
        return istWeiss;
    }

    @Override
    public String toString() {
       return (istWeiss ? "Weißer " : "Schwarzer ") + getClass().getSimpleName() + ", Position: " + position;
    }

	
		
		
	
}
