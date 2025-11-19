package IbanBerechnen;

import java.util.Scanner;

public class IbanBerechnen {
	
    public static void main(String[] args) {
        // Einlesen der Daten
        Scanner sc = new Scanner(System.in);
        String laenderkennung = sc.next();
        String bankleitzahl = sc.next();
        String kontonummer = sc.next();
        sc.close();
        	
        String iban = erzeugeIban(laenderkennung, bankleitzahl, kontonummer);
        System.out.println(iban);
    }
    private static String erzeugeIban(String laenderkennung, String bankleitzahl, String kontonummer) {
        // Schritt 1
        laenderkennung = normalisiereLaenderkennung(laenderkennung);
        
        // Schritt 2
        kontonummer = normalisiereKontonnummer(kontonummer);
        
        // Schritt 3
        String bban = erzeugeBban(bankleitzahl, kontonummer);
        
        // Schritt 4
        String bban2 = erweitereBban(laenderkennung, bban);
        
        // Schritt 5
        int moduloErgebnis = rechneModulo(bban2);
        
        // Schritt 6
        String pruefzahl = rechne98MinusModuloErgebnis(moduloErgebnis);
        
        // Schritt 7
        return laenderkennung + pruefzahl + bban;
    }
    private static String normalisiereLaenderkennung(String laenderkennung) {
        return laenderkennung.toUpperCase();
    }
    private static String normalisiereKontonnummer(String kontonummer) {
        while (kontonummer.length() < 10) {
            kontonummer = "0" + kontonummer;
        }
        return kontonummer;
    }
    private static String erzeugeBban(String bankleitzahl, String kontonummer) {
        return bankleitzahl + kontonummer;
    }
    private static String erweitereBban(String laenderkennung, String bban) {
        char zeichen1 = laenderkennung.charAt(0);  // 68 
        char zeichen2 = laenderkennung.charAt(1);   // 69
        int zahl1 = zeichen1 - 'A' + 1 + 9;   // 68 - 65 + 1 + 9  = 13
        int zahl2 = zeichen2 - 'A' + 1 + 9;		// 69  - 65 + 1 + 9 = 14
        return bban + zahl1 + zahl2 + "00";
        
    }
    private static int rechneModulo(String bban2) {   // 000123456131400
        int letzte9Ziffern = Integer.parseInt (bban2.substring(0, 9));
        
        int erg = letzte9Ziffern % 97;
      
        String restlicheZiffern =  erg + bban2.substring(9);
    
        while (restlicheZiffern.length() > 2) {
            
            if (restlicheZiffern.length() < 9) {
                letzte9Ziffern = Integer.parseInt(restlicheZiffern.substring(0));
            } else {
                letzte9Ziffern = Integer.parseInt(restlicheZiffern.substring(0, 9));
            }
        
            erg = letzte9Ziffern % 97;
            
            if (restlicheZiffern.length() < 9) {
                restlicheZiffern = erg + "";
            } else {
                restlicheZiffern = erg + restlicheZiffern.substring(9);
            }
            
        }
        return Integer.parseInt(restlicheZiffern);
    }
    private static String rechne98MinusModuloErgebnis (int moduloErgebnis) {
        int ergebnis = 98 - moduloErgebnis;
       
        return ergebnis < 10 ? "0" + ergebnis : "" + ergebnis;
    }
    
}


