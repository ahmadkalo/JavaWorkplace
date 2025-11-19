//import java.util.Scanner;
package MarthRandom;


public class MathRandom {
	
		public static void main(String[] args) {
			
//			Scanner sc = new Scanner(System.in);
//			int x = sc.nextInt();
//			int y = sc.nextInt();
//			int epsilon = sc.nextInt();
			double x = Double.parseDouble(args[0]);
			double y = Double.parseDouble(args[1]);
			double epsilon = Double.parseDouble(args[2]);
			
			if ( x < y && epsilon > 0 && Math.abs(y - x) > epsilon) {
				
				double a = 0;
				double b = 0;
				while (!(Math.abs(a - b) >= epsilon)) {
					a =  (x + Math.random() * (y - x));
					b =  (x + Math.random() * (y - x));
				}
				System.out.println("Zufallzahlen a = " + a + " und b = " + b);
			}
			else {
				System.out.println("Bitte halten Sie sich an die Bedingungen");
			}
		}

	}


