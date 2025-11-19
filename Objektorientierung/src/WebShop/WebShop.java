package WebShop;

public class WebShop {
    private Kunde[] kunden;
    private Artikel[] artikel;
    private int kundenAnzahl;
    private int artikelAnzahl;

    public WebShop() {
        this.kunden = new Kunde[10];
        this.artikel = new Artikel[10];
        this.kundenAnzahl = 0;
        this.artikelAnzahl = 0;
    }

    public void neuerArtikel(String name, double preis, int anzahl) {
        if (artikelAnzahl < 10) {
            artikel[artikelAnzahl++] = new Artikel(name, preis, anzahl);
        }
    }

    public Kunde neuerKunde(String vorname, String nachname) {
        if (kundenAnzahl < 10) {
            kunden[kundenAnzahl++] = new Kunde(vorname, nachname);
            return kunden[kundenAnzahl - 1];
        }
        return null;
    }

    public Kunde neuerKunde(String vorname, String nachname, double nachlass) {
        if (kundenAnzahl < 10) {
            kunden[kundenAnzahl++] = new GuterKunde(vorname, nachname, nachlass);
            return kunden[kundenAnzahl - 1];
        }
        return null;
    }
    
    public String bestellen(Kunde kunde, String[] artikel) {
        double gesamtpreis = 0.0;
        String rechnung = "Rechnung fuer " + kunde.getVorname() +" " +kunde.getNachname() + ":\n";

        for (int i = 0; i < artikel.length; i++) {
            String artikelName = artikel[i];
            Artikel artikell = findeArtikel(artikelName);
            if (artikell == null) {
                rechnung += artikelName + " : nicht gefunden\n";
            } else if (artikell.getBestand() == 0) {
                rechnung += artikelName + " : nicht mehr vorhanden\n";
            } else {
                artikell.reduziereBestand();
                double preis = artikell.getPreis();
                if (kunde instanceof GuterKunde) {
                    GuterKunde guterKunde = (GuterKunde) kunde;
                    preis = preis * (1 - guterKunde.getRabatt());
                }
                rechnung += artikelName + " : " + preis + "\n";
                gesamtpreis += preis;
            }
        }
        rechnung += "Gesamtpreis : " + gesamtpreis + "\n";
        return rechnung;
    }

    private Artikel findeArtikel(String name) {
        for (int i = 0; i < artikelAnzahl; i++) {
            if (artikel[i].getName().equals(name)) {
                return artikel[i];
            }
        }
        return null;
    }


  
}
