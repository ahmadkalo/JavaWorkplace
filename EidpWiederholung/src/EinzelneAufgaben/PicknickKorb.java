package EinzelneAufgaben;

public class PicknickKorb {
    // Klassenvariablen (static) für die Preise
    private static double kaesePreisProKilo = 14.90;
    private static double weinPreisProFlasche = 6.75;

    // Instanzvariablen für die Mengen
    private double kaeseMengeInKilo;
    private int weinFlaschen;

    // Konstruktor
    public PicknickKorb(double kaeseMenge, int weinFlaschen) {
        this.kaeseMengeInKilo = kaeseMenge;
        this.weinFlaschen = weinFlaschen;
    }

    // Methoden zum Ändern der Preise (Klassenmethoden)
    public static void setKaesePreisProKilo(double neuerPreis) {
        kaesePreisProKilo = neuerPreis;
    }

    public static void setWeinPreisProFlasche(double neuerPreis) {
        weinPreisProFlasche = neuerPreis;
    }

    // Methoden zur Abfrage der Preise (Klassenmethoden)
    public static double getKaesePreisProKilo() {
        return kaesePreisProKilo;
    }

    public static double getWeinPreisProFlasche() {
        return weinPreisProFlasche;
    }

    // Methode zur Berechnung des Käsepreises für diesen Korb
    public double berechneKaesePreis() {
        return kaeseMengeInKilo * kaesePreisProKilo;  // 2,3 * 14,90
    }

    // Methode zur Berechnung des Weinpreises für diesen Korb
    public double berechneWeinPreis() {
        return weinFlaschen * weinPreisProFlasche;
    }

    // Methode zur Berechnung des Gesamtpreises für diesen Korb
    public double berechneGesamtPreis() {
        return berechneKaesePreis() + berechneWeinPreis();
    }

    // Getter für die Mengen
    public double getKaeseMengeInKilo() {
        return kaeseMengeInKilo;
    }

    public int getWeinFlaschen() {
        return weinFlaschen;
    }



    public static void main(String[] args) {
        // Erstelle einige Picknick-Körbe
        PicknickKorb korb1 = new PicknickKorb(2.5, 3);
        PicknickKorb korb2 = new PicknickKorb(1.8, 2);
        PicknickKorb korb3 = new PicknickKorb(3.0, 4);

        // Ausgabe der Preise für die Körbe
        System.out.println("Preise mit den ursprünglichen Werten:");
        ausgabeKorbPreise(korb1, korb2, korb3);

        // Ändere den Weinpreis
        System.out.println("\nÄndere den Weinpreis auf 7.50 Euro...");
        PicknickKorb.setWeinPreisProFlasche(7.50);

        // Ausgabe der neuen Preise
        System.out.println("\nPreise nach der Weinpreis-Änderung:");
        ausgabeKorbPreise(korb1, korb2, korb3);
    }

    // Hilfsmethode zur Ausgabe der Korbpreise
    private static void ausgabeKorbPreise(PicknickKorb... koerbe) {
        System.out.printf("Aktueller Käsepreis: %.2f €/kg\n", PicknickKorb.getKaesePreisProKilo());
        System.out.printf("Aktueller Weinpreis: %.2f €/Flasche\n\n", PicknickKorb.getWeinPreisProFlasche());

        for (int i = 0; i < koerbe.length; i++) {
            PicknickKorb korb = koerbe[i];
            System.out.printf("Korb %d: %.1f kg Käse, %d Flaschen Wein\n", i+1,
                    korb.getKaeseMengeInKilo(), korb.getWeinFlaschen());
            System.out.printf("Käsepreis: %.2f €\n", korb.berechneKaesePreis());
            System.out.printf("Weinpreis: %.2f €\n", korb.berechneWeinPreis());
            System.out.printf("Gesamtpreis: %.2f €\n\n", korb.berechneGesamtPreis());
        }
    }

    }
