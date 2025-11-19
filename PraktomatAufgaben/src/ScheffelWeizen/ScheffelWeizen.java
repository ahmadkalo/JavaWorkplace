package ScheffelWeizen;


import java.util.Scanner;

public class ScheffelWeizen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anzahl der Scheffeln eingeben: ");
        int scheffel = scanner.nextInt();


        System.out.print("Anzahl der Personen eingeben: ");
        int personen = scanner.nextInt();

        scanner.close();

        int maenner = 0;

        while (maenner <= personen) {
            int frauen = 0;


            while (frauen <= personen - maenner) {
                int kinder = personen - maenner - frauen;


                double scheffelAnzahl = 3 * maenner + 2 * frauen + 0.5 * kinder;


                if (scheffelAnzahl == scheffel) {
                    System.out.println(maenner + " " + frauen + " " + kinder);
                }

                frauen++;
            }

            maenner++;
        }
    }
}
