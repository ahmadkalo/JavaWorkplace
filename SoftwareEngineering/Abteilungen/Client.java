public class Client {

    public static void main(String[] args) {

        abteilung hauptAbteilung = AbteilungFactory.erzeugeAbteilung("komplex", "Haupt");

        abteilung abteilung1 = AbteilungFactory.erzeugeAbteilung("atomar", "Vertrieb");
        abteilung abteilung2 = AbteilungFactory.erzeugeAbteilung("komplex", "IT");
        abteilung abteilung3 = AbteilungFactory.erzeugeAbteilung("komplex", "HR");
        abteilung abteilung4 = AbteilungFactory.erzeugeAbteilung("atomar", "Kunden");
        abteilung abteilung5 = AbteilungFactory.erzeugeAbteilung("atomar", "Finanzen");
        abteilung abteilung6 = AbteilungFactory.erzeugeAbteilung("atomar", "Sitz");


        hauptAbteilung.addAbteilung(abteilung1);
        hauptAbteilung.addAbteilung(abteilung2);
        hauptAbteilung.addAbteilung(abteilung3);
        hauptAbteilung.addAbteilung(abteilung4);
        hauptAbteilung.addAbteilung(abteilung5);
        hauptAbteilung.addAbteilung(abteilung6);


        hauptAbteilung.zeigeAbteilung();


    }
}
