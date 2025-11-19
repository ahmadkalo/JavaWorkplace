package control;

import java.util.ArrayList;
import java.util.List;

public class GermanTranslator implements Translator {

    private String date = "Okt/2024"; // Default-Wert


    // Methode zur Übersetzung einer Zahl in eine String-Repräsentation
    public String translateNumber(int number) {

        String[] zahlen = {"eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn"};
        String result = "";
        try {

            result = zahlen[number - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            result = "Übersetzung der Zahl " + number + " nicht möglich !(V " + Translator.version + ")";
        } finally {

            return result;
        }
    }


    /**
     * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
     */
    public void printInfo() {
        System.out.println("GermanTranslator v1.9, erzeugt am " + this.date);
    }

    /**
     * Setzen des Datums, wann der Übersetzer erzeugt wurde (Format: Monat/Jahr (Beispiel: "Okt/2024"))
     * Das Datum sollte system-intern durch eine Factory-Klasse gesetzt werden und nicht von externen View-Klassen
     */
    public void setDate(String date) {
        this.date = date;
    }

}
