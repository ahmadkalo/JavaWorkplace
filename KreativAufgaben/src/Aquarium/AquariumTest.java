package Aquarium;

// Die Klasse AquariumTest, um das Aquarium zu testen
public class AquariumTest {

    public static void main(String[] args) throws InterruptedException {

        Aquarium aq1 = new Aquarium(11, 50); // Erstellt ein Aquarium mit den Maßen 11x50
        Fisch f1 = new Schwertfisch(5, 6, false); // Erstellt einen Schwertfisch an der Position (5, 6), der nach rechts schaut
        Fisch f2 = new Fisch(1, 15, true); // Erstellt einen normalen Fisch an der Position (1, 15), der nach links schaut
        Fisch f3 = new Fisch(3, 25, false); // Erstellt einen normalen Fisch an der Position (3, 25), der nach rechts schaut
        Fisch f4 = new Fisch(5, 35, true); // Erstellt einen normalen Fisch an der Position (5, 35), der nach links schaut
        Fisch f5 = new Hai(3, 43, false); // Erstellt einen Hai an der Position (3, 43), der nach rechts schaut
        Fisch f6 = new Kugelfisch(7, 25, true); // Erstellt einen Kugelfisch an der Position (7, 25), der nach links schaut
        Fisch f7 = new Fisch(8, 1, false); // Erstellt einen normalen Fisch an der Position (8, 1), der nach rechts schaut
        
        // Fügt die Fische dem Aquarium hinzu
        aq1.addFish(f1);
        aq1.addFish(f2);
        aq1.addFish(f3);
        aq1.addFish(f4);
        aq1.addFish(f5);
        aq1.addFish(f6);
        aq1.addFish(f7);

        // Die Schleife läuft endlos weiter, um die Bewegung der Fische im Aquarium zu überwachen
        while (true) {
            System.out.println(aq1.currentState()); // Gibt die visuelle Darstellung des Aquariums aus
            aq1.updateAquarium(); // Aktualisiert die Positionen der Fische im Aquarium
            Thread.sleep(150, 0); // Wartet 150 Millisekunden (1.5 Sekunden) zwischen den Aktualisierungen
        }
    }
}
