package Aquarium;

// Die Klasse Schwertfisch, die von der Klasse Fisch erbt
public class Schwertfisch extends Fisch {
    // Konstruktor der Klasse Swordfish, der die Attribute der Elternklasse Fish übernimmt
    public Schwertfisch(int depth, int width, boolean lookingLeft) {
        super(depth, width, lookingLeft); // Ruft den Konstruktor der Elternklasse auf und übergibt die entsprechenden Parameter
        this.leftSymbol = "-<><"; // Setzt das Symbol für die linke Blickrichtung des Schwertfisches
        this.rightSymbol = "><>-" ; // Setzt das Symbol für die rechte Blickrichtung des Schwertfisches
    }
    
    // Methode zur Änderung der Tiefe des Schwertfisches
    // Mit einer Wahrscheinlichkeit von 1/5 wird entschieden, ob der Schwertfisch seine Tiefe ändert
    // Wenn ja, wird mit 50/50 Wahrscheinlichkeit entschieden, ob er nach oben (0) oder unten (1) schwimmt
    public int changeDepth() {
        int r = (int) (Math.random() * 100) % 5; // Generiert eine Zufallszahl zwischen 0 und 4
        if (r == 0) { // Wenn die Zufallszahl 0 ist (mit einer Wahrscheinlichkeit von 1/5)
            return (int) (Math.random() * 100) % 2; // Entscheidet zufällig, ob der Schwertfisch nach oben (0) oder unten (1) schwimmt
        } else {
            return 42; // Andernfalls (mit einer Wahrscheinlichkeit von 4/5) bleibt die Tiefe unverändert (Rückgabe von 42 als Platzhalterwert)
        }
    }
}
