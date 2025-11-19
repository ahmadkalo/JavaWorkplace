package Aquarium;

// Die Klasse Kugelfisch, die von der Klasse Fisch erbt
public class Kugelfisch extends Fisch {
    // Konstruktor der Klasse Pufferfish, der die Attribute der Elternklasse Fish übernimmt
    public Kugelfisch(int depth, int width, boolean lookingLeft) {
        super(depth, width, lookingLeft); // Ruft den Konstruktor der Elternklasse auf und übergibt die entsprechenden Parameter
        this.leftSymbol = "<()><"; // Setzt das Symbol für die linke Blickrichtung des Kugelfisches
        this.rightSymbol = "><()>"; // Setzt das Symbol für die rechte Blickrichtung des Kugelfisches
    }
    
    // Methode zur Änderung der Tiefe des Kugelfisches
    // Mit einer Wahrscheinlichkeit von 1/10 wird entschieden, ob der Kugelfisch seine Tiefe ändert
    // Wenn ja, wird mit 50/50 Wahrscheinlichkeit entschieden, ob er nach oben oder unten schwimmt
    public int changeDepth() {
        int r = (int) (Math.random() * 100) % 10; // Generiert eine Zufallszahl zwischen 0 und 9
        if (r == 0) { // Wenn die Zufallszahl 0 ist (mit einer Wahrscheinlichkeit von 1/10)
            return (int) (Math.random() * 100) % 2; // Entscheidet zufällig, ob der Kugelfisch nach oben (0) oder unten (1) schwimmt
        } else {
            return 42; // Andernfalls (mit einer Wahrscheinlichkeit von 9/10) bleibt die Tiefe unverändert (Rückgabe von 42 als Platzhalterwert)
        }
    }  
}
