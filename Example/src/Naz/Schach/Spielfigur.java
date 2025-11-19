package Naz.Schach;

public abstract class Spielfigur {


     Punkt2D position;
     boolean istWeiss;

    public Spielfigur(Punkt2D position, boolean istWeiss) {
    this.position = position;
    this.istWeiss = istWeiss;

    }

    public Punkt2D getPosition() {
        return position;
    }

    public abstract void step(int n, String r) throws UngueltigeBewegungException;


}
