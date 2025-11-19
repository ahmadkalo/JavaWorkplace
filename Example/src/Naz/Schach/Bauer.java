package Naz.Schach;

public class Bauer extends Schachfigur {
    public Bauer(Punkt2D position, boolean istWeiss) {
        super(position, istWeiss);
    }

    @Override
    public void step(int n, String r) throws UngueltigeBewegungException {
        int y = position.getY();
        int x = position.getX();
        if (r.equals("vorne") && n == 1) {
            if (istWeiss) {
                y += n;
            } else {
                y -= n;
            }
        } else {
            throw new UngueltigeBewegungException("Ungültige Bewegung");
        }
        if (x < 0 || x > 8 || y < 0 || y > 8) {
            throw new UngueltigeBewegungException("Bewegung außerhalb des Bretts");

        }

        position = new Punkt2D(x, y);


    }

    @Override
    public String toString() {
        return (getClass().getSimpleName() + "(" + position + ")");
    }
}
