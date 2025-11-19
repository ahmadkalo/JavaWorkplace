package Aquarium;

// Die Klasse Fisch
public class Fisch {
    int tiefe; // Die Tiefe des Fisches im Aquarium (y-Achse)
    int breite; // Die Breite des Fisches im Aquarium (x-Achse)
    boolean lookingLeft; // Gibt an, ob der Fisch nach links oder rechts schaut (true = links | false = rechts)
    String leftSymbol = "<><"; // Das Symbol, das verwendet wird, wenn der Fisch nach links schaut
    String rightSymbol = "><>"; // Das Symbol, das verwendet wird, wenn der Fisch nach rechts schaut

    // Konstruktor der Klasse Fish
    public Fisch(int depth, int width, boolean lookingLeft) {
        this.tiefe = depth; // Setzt die Tiefe des Fisches
        this.breite = width; // Setzt die Breite des Fisches
        this.lookingLeft = lookingLeft; // Setzt die Blickrichtung des Fisches
    }
    
    // Methode zum Ändern der Blickrichtung des Fisches
    public void changeDirection() {
        // Kehrt die Blickrichtung um
        lookingLeft = !lookingLeft;
    }
    
    // Methode zur Änderung der Tiefe des Fisches
    public int changeDepth() {
        return 42;
    }
}
