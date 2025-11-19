package ArrayBasics;
public class TwoDArrayExample {
	
	
    public static void main(String[] args) {
        // Größe des 2D-Arrays festlegen
        int zeilen = 3;
        int spalten = 4;

        // 2D-Array erstellen
        int[][] meinArray = new int[zeilen][spalten];

        // 2D-Array mit Werten füllen
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < spalten; j++) {
                meinArray[i][j] = i + j; // Beispielwert, Sie können dies nach Bedarf ändern
            }
        }

         //meinArray[0][1] = 42;
        // 2D-Array durchlaufen und ausgeben
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < spalten; j++) {
                System.out.print(meinArray[i][j] + " ");
            }
            System.out.println(); // Neue Zeile für jeden Zeilenumbruch
        }
    }
}
