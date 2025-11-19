package ParityBit;
public class ParityBit {
	
    public static void main(String[] args) {
    	
    	 // Beispielwert deklarieren
        int wert = 0x17; 

        // Zuerst die Nutzinformation extrahieren (Bits 1-4)
        int nutzInfo = (wert / 2);
        
        // Initialisieren der Quersumme

        int quersumme = 0;
        // Durchlaufe die Bits 1 bis 4 der Nutzinformation mit einer for-Schleife

        for (int i = 1; i <= 4; i++) {
        	
        // Extrahiere das aktuelle Bit und füge es zur Quersumme hinzu
            int bit = (nutzInfo >> i) & 1;
            quersumme += bit;
        }
        // Berechne das Paritätsbit basierend auf der Quersumme
        int prüfbit = quersumme % 2;
        
        // Überprüfe, ob das Paritätsbit korrekt ist (0 für gerade Quersumme)
        boolean korrekt = (prüfbit == 0);
        
        // Ausgabe auf der Konsole mit erläuternden Kommentaren
        System.out.println(korrekt);
        System.out.println(quersumme);
        System.out.println(prüfbit);
    }
}
