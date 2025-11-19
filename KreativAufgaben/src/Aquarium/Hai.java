package Aquarium;

// Die Klasse Hai, die von der Klasse Fisch erbt
public class Hai extends Fisch {
    // Konstruktor der Klasse Shark, der die Attribute der Elternklasse Fish übernimmt
    public Hai(int depth, int width, boolean lookingLeft) {
        super(depth, width, lookingLeft); // Ruft den Konstruktor der Elternklasse auf und übergibt die entsprechenden Parameter
        this.leftSymbol = "<///====><"; // Setzt das Symbol für die linke Blickrichtung des Hais
        this.rightSymbol = "><====///>"; // Setzt das Symbol für die rechte Blickrichtung des Hais
    }

    // Methode zur Änderung der Tiefe des Hais
    // Mit einer Wahrscheinlichkeit von 1/4 wird entschieden, ob der Hai seine Tiefe ändert
    // Wenn ja, wird mit 50/50 Wahrscheinlichkeit entschieden, ob er nach oben (0) oder unten (1) schwimmt
    public int changeDepth() {
        int r = (int) (Math.random() * 100) % 4; // Generiert eine Zufallszahl zwischen 0 und 3
        if (r == 0) { // Wenn die Zufallszahl 0 ist (mit einer Wahrscheinlichkeit von 1/4)
            return (int) (Math.random() * 100) % 2; // Entscheidet zufällig, ob der Hai nach oben (0) oder unten (1) schwimmt
        } else {
            return 42; // Andernfalls (mit einer Wahrscheinlichkeit von 3/4) bleibt die Tiefe unverändert (Rückgabe von 42 als Platzhalterwert)
        }
    }
}
