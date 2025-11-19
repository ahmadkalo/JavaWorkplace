import java.util.Scanner;

public class LaengsteKette {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int aktuelleZahl = 0;
        int zaehler = 0;
        int mayarZaehler = 0;

        while (sc.hasNextInt()) {
            int i = sc.nextInt();

            if (i == aktuelleZahl) {
                zaehler++;
            } else {
                aktuelleZahl = i;
                zaehler = 1;
            }

            if (zaehler > mayarZaehler) {
                mayarZaehler = zaehler;
            }
        }

        System.out.println(mayarZaehler);

    }
}
