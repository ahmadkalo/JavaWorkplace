package Lauflaengenkodierung;

import java.util.Scanner;

public class Lauflaengenkodierung {
	
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
        int aktuelleZahl = sc.nextInt();  //4
		int zaehler = 1;  // 3
        String result = "";


		while(sc.hasNextInt()) {

		    int i = sc.nextInt();  // 4
		 
		    if (i == aktuelleZahl) { 
		    	zaehler++;
		    } else {
		    	result += zaehler + "x" + aktuelleZahl + ".";
		    	aktuelleZahl = i;
		    	zaehler = 1;
		    }
		}
    	result += zaehler + "x" + aktuelleZahl + ".";

		System.out.println(result);
		sc.close();
    }
}
