package UserCon;

import java.io.Serializable;

public class UserStory implements Serializable {

    private static int naechsteNummer = 1;
    int nummer;
    private int id;
    private String titel;
    private String akzeptanzkriterium;
    private int risiko;
    private int mehrwert;
    private int aufwand;
    private int strafe;
    private String epic;


    public UserStory(int id, String titel, String akzeptanzkriterium, int mehrwert, int strafe, int aufwand, int risiko, String epic) throws KeineGueltigeUserStoryException {
        this.id = id;
        if (id <= 0 || id > 999999)
            throw new KeineGueltigeUserStoryException("Keine gültige ID. Id muss positiv und maximal 6-stellig sein");
        int maxTitelLaenge = 200;
        if (titel.length() > maxTitelLaenge)
            throw new KeineGueltigeUserStoryException("Titel ist zu lang. Maximale Länge: " + maxTitelLaenge + " Zeichen.");
        else if (titel.length() < 5)
            throw new KeineGueltigeUserStoryException("Titel ist zu kurz. Die Länge des Titels sollte aus mindestens 5 Buchstaben bestehen");
        this.titel = titel;
        int maxAkzeptanzkriteriumLaenge = 200;
        if (akzeptanzkriterium.length() > maxAkzeptanzkriteriumLaenge)
            throw new KeineGueltigeUserStoryException("Akzeptanzkriterium ist zu lang. Maximale Länge: " + maxAkzeptanzkriteriumLaenge + " Zeichen.");
        else if (akzeptanzkriterium.length() < 5)
            throw new KeineGueltigeUserStoryException("Akzeptanzkriterium ist zu kurz. Die Länge des Akzeptanzkriteriums sollte aus mindestens 5 Buchstaben bestehen");
        this.akzeptanzkriterium = akzeptanzkriterium;
        this.risiko = risiko;
        if (risiko <= 0 || risiko > 99)
            throw new KeineGueltigeUserStoryException("Kein gültiger Risikowert, Risikowert muss positiv und maximal 2-stellig sein");
        this.mehrwert = mehrwert;
        if (mehrwert <= 0 || mehrwert > 99)
            throw new KeineGueltigeUserStoryException("Kein gültiger Mehrwert, Mehrwert muss positiv und maximal 2-stellig sein");
        this.aufwand = aufwand;
        if (aufwand <= 0 || aufwand > 99)
            throw new KeineGueltigeUserStoryException("Kein gültiger Aufwandswert, Aufwandswert muss positiv und maximal 2-stellig sein");
        this.strafe = strafe;
        if (strafe <= 0 || strafe > 99)
            throw new KeineGueltigeUserStoryException("Kein gültiger Strafenwert, Strafenwert muss positiv und maximal 2-stellig sein");
        int epicLaenge = 25;
        if (epic.length() > epicLaenge)
            throw new KeineGueltigeUserStoryException("Epic ist zu lang. Maximale Länge: " + epicLaenge + " Zeichen.");
        this.epic = epic;
        this.nummer = naechsteNummer++;

    }

    // Getters

    public int getID() {
        return this.id;
    }

    public String getAkzeptanzkriterium() {
        return akzeptanzkriterium;
    }

    public String getTitel() {
        return titel;
    }

    public int getStrafe() {
        return strafe;
    }

    public int getAufwand() {
        return aufwand;
    }

    public int getRisiko() {
        return risiko;
    }

    public int getMehrwert() {
        return mehrwert;
    }

    public String getEpic() {
        return epic;
    }


    // Setters


    public void setId(int id) throws KeineGueltigeUserStoryException {
        if (id <= 0 || id > 999999) throw new KeineGueltigeUserStoryException("Keine gültige ID. Id muss positiv und maximal 6-stellig sein");
        this.id = id;
    }

    public void setAkzeptanzkriterium(String akzeptanzkriterium) {
        this.akzeptanzkriterium = akzeptanzkriterium;
    }

    public void setMehrwert(int mehrwert) {
        this.mehrwert = mehrwert;
    }

    public void setAufwand(int aufwand) {
        this.aufwand = aufwand;
    }

    public void setEpic(String epic) throws KeineGueltigeUserStoryException {
        int epicLaenge = 25;
        if (epic.length() > epicLaenge) throw new KeineGueltigeUserStoryException("Epic ist zu lang. Maximale Länge: " + epicLaenge + " Zeichen.");
        this.epic = epic;
    }

    public void setRisiko(int risiko) throws KeineGueltigeUserStoryException {
        if (risiko <= 0 || risiko > 99) throw new KeineGueltigeUserStoryException("Kein gültiger Risikowert, muss positiv und maximal 2-stellig sein");
        this.risiko = risiko;
    }

    public void setStrafe(int strafe) throws KeineGueltigeUserStoryException {
        if (strafe <= 0 || strafe > 99) throw new KeineGueltigeUserStoryException("Kein gültiger Strafenwert, Strafenwert muss positiv und maximal 2-stellig sein");
        this.strafe = strafe;
    }

    public void setTitel(String titel) throws KeineGueltigeUserStoryException {
        int maxTitelLaenge = 200;
        if (titel.length() > maxTitelLaenge || titel.length() < 5)
            throw new KeineGueltigeUserStoryException("Akzeptanzkriterium ist zu lang. Maximale Länge: " + maxTitelLaenge + " Zeichen.");

        this.titel = titel;
    }

    public double rechnePriorisierungswert() {
        return (double) (mehrwert + strafe) / (aufwand * risiko);
    }

    @Override
    public String toString() {
        return
                         "------------------------------------" + "\n" +
                          this.nummer + ". UserStory: " + "\n" +
                          "Epic: " + epic + "\n"  +
                          "ID: " + this.id + "\n" +
                          "Titel: " + titel + "\n" +
                          "Akzeptanzkriterium: " + akzeptanzkriterium + "\n" +
                          "Priorität: " + rechnePriorisierungswert() + "\n" +
                           "------------------------------------";


    }



}
