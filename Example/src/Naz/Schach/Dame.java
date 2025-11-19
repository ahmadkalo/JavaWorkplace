package Naz.Schach;


public class Dame extends Schachfigur {
    public Dame(Punkt2D position, boolean istWeiss) {
        super(position, istWeiss);

    }

    @Override
    public void step(int n, String r) throws UngueltigeBewegungException {

        int x = position.getX();
        int y = position.getY();

        if (r.equals("oben")) {
            y += n;
        } else if (r.equals("unten")) {
            y -= n;
        } else if (r.equals("rechts")) {
            x += n;
        } else if (r.equals("links")) {
            x -= n;
        } else if (r.equals("diagonal oben links")) {
            x -= n;
            y += n;
        } else if (r.equals("diagonal unten links")) {
            x -= n;
            y -= n;
        } else if (r.equals("diagonal oben rechts")) {
            x += n;
            y += n;
        } else if (r.equals("diagonal unten recht")) {
            x += n;
            y -= n;
        } else {
            throw new UngueltigeBewegungException("Ungültige Richtung für den Läufer");
        }

        position = new Punkt2D(x, y);

    }

    @Override
    public String toString() {
        return (getClass().getSimpleName() + "(" + position + ")");
    }
}
