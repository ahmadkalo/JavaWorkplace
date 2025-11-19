package factory;

import control.GermanTranslator;
import control.Translator;

public class Factory {

    // Statische Methode zur Erstellung eines GermanTranslator-Objekts
    public static Translator createTranslator() {
        GermanTranslator translator = new GermanTranslator();
        // Setzt das Erstellungsdatum
        translator.setDate("Okt/2024");
        translator.printInfo();
        return translator;
    }
}
