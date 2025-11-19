package Handel;

public class Kunde {
    static int naechsterKundennummer = 1;
    String name;
    int kundennummer;
    private Artikel[] korb;
    int anz;


    public Kunde(String name) {
        this.name = name;
        this.korb = new Artikel[5];
        this.kundennummer = naechsterKundennummer++;
        this.anz = 0;
    }

    public void inWarenkorbLegen(Artikel artikel) {

        if (korb.length == anz) {
            Artikel[] neuerkorb = new Artikel[korb.length + 5];
            for (int i = 0; i < korb.length; i++) {
                neuerkorb[i] = korb[i];
            }
            korb = neuerkorb;

        }
        korb[anz] = artikel;
        anz++;
    }

    public double kaufen() {
        double summe = 0.0;
        for (int i = 0; i < anz; i++) {
            summe += korb[i].getPreis();
        }
        korb = new Artikel[5];
        anz = 0;

        return summe;
    }

    public void zeigeWarenkorb() {
        System.out.println("Warenkorb von: " + name + ", Kundennummer: " + kundennummer);
        for(int i = 0; i < anz; i++) {
            System.out.print(korb[i]);
        }
    }


    public static void main(String[] args) {

        Kunde naz = new Kunde("Naz");

        Artikel art1 = new Artikel("Wurst", 2);
        Artikel art2 = new Artikel("Laptop", 100);
        Artikel art3 = new Artikel("Laptop", 100);
        Artikel art4 = new Artikel("Laptop", 100);
        Artikel art5 = new Artikel("Laptop", 100);
        Artikel art6 = new Artikel("Laptop", 100);

        naz.inWarenkorbLegen(art1);
        naz.inWarenkorbLegen(art2);
        naz.inWarenkorbLegen(art4);
        naz.inWarenkorbLegen(art5);
        naz.inWarenkorbLegen(art6);


        naz.zeigeWarenkorb();
        System.out.println("Gesamtpreis: " + naz.kaufen());
        naz.zeigeWarenkorb();

    }
}
