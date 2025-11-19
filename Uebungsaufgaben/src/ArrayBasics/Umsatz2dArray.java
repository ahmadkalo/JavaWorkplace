package ArrayBasics;

public class Umsatz2dArray {

    public static void main(String[] args) {
 
    	String[][] umsatzArray = new String[12][2];
    	
    	// Monatszahlen als Strings initialisieren
    	umsatzArray[0][0] = "Januar";
    	umsatzArray[1][0] = "Februar";
    	umsatzArray[2][0] = "März";
    	umsatzArray[3][0] = "April";
    	umsatzArray[4][0] = "Mai";
    	umsatzArray[5][0] = "Juni";
    	umsatzArray[6][0] = "Juli";
    	umsatzArray[7][0] = "August";
    	umsatzArray[8][0] = "September";
    	umsatzArray[9][0] = "Oktober";
    	umsatzArray[10][0] = "November";
    	umsatzArray[11][0] = "Dezember";
    	
    	umsatzArray[0][1] = "34";
    	umsatzArray[1][1] = "44";
    	umsatzArray[2][1] = "23";
    	umsatzArray[3][1] = "76";
    	umsatzArray[4][1] = "65";
    	umsatzArray[5][1] = "98";
    	umsatzArray[6][1] = "123";
    	umsatzArray[7][1] = "102";
    	umsatzArray[8][1] = "87";
    	umsatzArray[9][1] = "43";
    	umsatzArray[10][1] = "34";
    	umsatzArray[11][1] = "12";
    	
    	for(int i = 0; i < umsatzArray.length; i++) {
    		System.out.println("Für den Monat " + umsatzArray[i][0] + " betrug der Umsatz " + umsatzArray[i][1] + "€");
    	}
    }
}
