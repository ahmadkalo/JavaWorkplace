package DreiecksFlaeche;
public class DreiecksFlaecheCmd {

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Bitte geben Sie drei Seitenlängen als Argumente ein.");
            return;
        }

        // Seitenlängen aus den Argumenten der Befehlszeile einlesen
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        // Berechnung von s (Halbsumme der Seitenlängen)
        double s = (a + b + c) / 2;

        // Berechnung der Fläche nach der Heron'schen Formel
        double flaeche = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Ausgabe des Ergebnisses
        System.out.println("Der Flächeninhalt des Dreiecks beträgt: " + flaeche);
    }
}
