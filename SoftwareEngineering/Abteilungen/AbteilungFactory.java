public class AbteilungFactory {

    public static abteilung erzeugeAbteilung(String art, String name) {
        if (art.equalsIgnoreCase("atomar")) {
            return new atomar(name);
        } else if (art.equalsIgnoreCase("komplex")) {
            return new komplex(name);
        } else {
            throw new IllegalArgumentException("Ungültiger Abteilungstyp: " + art);
        }
    }

}


