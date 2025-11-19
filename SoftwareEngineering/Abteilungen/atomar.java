public class atomar implements abteilung {
   private String name;

    public atomar(String name) {
        this.name = name;

    }

    @Override
    public int count() {
        return 1;
    }

    @Override
    public void zeigeAbteilung() {
        System.out.println("Abteilung: " + name);

    }

    @Override
    public void addAbteilung(abteilung abteilung) {
        System.out.println("Atomare abteilung, diese Funktion wird nicht unterstützt");
    }

    @Override
    public void deleteAbteilung(abteilung abteilung) {
        System.out.println("Atomare abteilung, diese Funktion wird nicht unterstützt");

    }
}
