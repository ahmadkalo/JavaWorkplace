import java.util.ArrayList;
import java.util.List;

public class komplex implements abteilung {
    private String name;
    private List<abteilung> abteilungen = new ArrayList<>();

    public komplex(String name) {
        this.name = name;

    }
    @Override
    public void addAbteilung(abteilung abteilung) {
        if (count() < 5) {  // Verwendet count() anstelle von abteilungen.size()
            abteilungen.add(abteilung);
        } else {
            System.out.println("Maximale Anzahl an Abteilungen erreicht!");
        }
    }


    @Override
    public void deleteAbteilung(abteilung abteilung) {
        abteilungen.remove(abteilung);
    }

    @Override
    public int count() {
        return abteilungen.size();
    }
    @Override
    public void zeigeAbteilung() {
        System.out.println("Abteilung: " + name);
        for (abteilung abteilung : abteilungen) {
            abteilung.zeigeAbteilung();
        }
    }
}
