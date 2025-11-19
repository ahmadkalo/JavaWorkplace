package WürfelSpiele;


import java.util.Scanner;

public class Spiel {
    public static void simplesSpiel(Spieler s1, Spieler s2) {
        Scanner scanner = new Scanner(System.in);
        String eingabe;

        do {
            int wurf1 = s1.wuerfeln();
            int wurf2 = s2.wuerfeln();

            System.out.println(s1.getName() + " würfelt: " + wurf1);
            System.out.println(s2.getName() + " würfelt: " + wurf2);

            if (wurf1 > wurf2) {
                s1.punktPlus();
            } else if (wurf2 > wurf1) {
                s2.punktPlus();
            } else {
                System.out.println("Gleichstand – kein Punkt!");
            }

            System.out.print("Weiter? (j/n): ");
            eingabe = scanner.nextLine();
        } while (eingabe.equalsIgnoreCase("j"));

        System.out.println("Endstand:");
        System.out.println(s1);
        System.out.println(s2);
    }

    public static void filzlaus(Spieler s1, Spieler s2) {
        int punkte1 = filzlausVersuch(s1);
        int punkte2 = filzlausVersuch(s2);

        if (punkte1 == 0 && punkte2 == 0) {
            System.out.println("Beide Spieler haben verloren!");
        } else if (punkte1 == 0) {
            System.out.println(s2.getName() + " gewinnt!");
        } else if (punkte2 == 0) {
            System.out.println(s1.getName() + " gewinnt!");
        } else if (punkte1 < punkte2) {
            System.out.println(s1.getName() + " gewinnt!");
        } else if (punkte2 < punkte1) {
            System.out.println(s2.getName() + " gewinnt!");
        } else {
            System.out.println("Unentschieden!");
        }
    }

    private static int filzlausVersuch(Spieler s) {
        for (int i = 1; i <= 8; i++) {
            int wurf = s.wuerfeln();
            System.out.println(s.getName() + " wurfelt: " + wurf);
            if (wurf == 1) {
                return i; // so viele Versuche gebraucht
            }
        }
        return 0; // keine 1 gewürfelt -> verloren
    }


    public static void sechserPasch(Spieler s1, Spieler s2) {
        int punkte1 = paschVersuch(s1);
        int punkte2 = paschVersuch(s2);

        if (punkte1 == 0 && punkte2 == 0) {
            System.out.println("Beide Spieler haben verloren!");
        } else if (punkte1 == 0) {
            System.out.println(s2.getName() + " gewinnt!");
        } else if (punkte2 == 0) {
            System.out.println(s1.getName() + " gewinnt!");
        } else if (punkte1 < punkte2) {
            System.out.println(s1.getName() + " gewinnt!");
        } else if (punkte2 < punkte1) {
            System.out.println(s2.getName() + " gewinnt!");
        } else {
            System.out.println("Unentschieden!");
        }
    }

    private static int paschVersuch(Spieler s) {
        for (int i = 1; i <= 8; i++) {
            int wurf1 = s.wuerfeln();
            int wurf2 = s.wuerfeln();
            System.out.println(s.getName() + " wurfelt: " + wurf1 + " und " + wurf2);
            if (wurf1 == 6 && wurf2 == 6) {
                return i; // so viele Versuche gebraucht
            }
        }
        return 0; // kein 6 Pasch -> verloren
    }


    public static void grosseHausnummer(Spieler s1, Spieler s2) {
        int hausnummer1 = hausnummerBilden(s1, true);
        int hausnummer2 = hausnummerBilden(s2, false);

        System.out.println(s1.getName() + " hat die Hausnummer: " + hausnummer1);
        System.out.println(s2.getName() + " hat die Hausnummer: " + hausnummer2);

        if (hausnummer1 > hausnummer2) {
            System.out.println(s1.getName() + " gewinnt!");
        } else if (hausnummer2 > hausnummer1) {
            System.out.println(s2.getName() + " gewinnt!");
        } else {
            System.out.println("Unentschieden!");
        }
    }

    private static int hausnummerBilden(Spieler s, boolean menschlich) {
        int[] stellen = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int wurf = s.wuerfeln();
            System.out.println(s.getName() + " würfelt: " + wurf);

            if (menschlich) {
                boolean gesetzt = false;
                while (!gesetzt) {
                    System.out.print("Wohin setzen? (1=Einer, 2=Zehner, 3=Hunderter): ");
                    int pos = scanner.nextInt() - 1;
                    if (pos >= 0 && pos <= 2 && stellen[pos] == 0) {
                        stellen[pos] = wurf;
                        gesetzt = true;
                    } else {
                        System.out.println("Ungültig oder Position belegt!");
                    }
                }
            } else {
                for (int j = 2; j >= 0; j--) {
                    if (stellen[j] == 0) {
                        stellen[j] = wurf;
                        break;
                    }
                }
            }
        }

        return stellen[2] * 100 + stellen[1] * 10 + stellen[0];
    }
}
