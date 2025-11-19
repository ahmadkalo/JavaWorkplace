package Schach;

import java.util.Scanner;

public class SchachSpielMain {
	public static void main(String[] args) {
		boolean spielLaueft = true;
	

		Schachfigur[][] schachbrett = new Schachfigur[8][8];
		Scanner chessScanner = new Scanner(System.in);

		try {
			erzeugeWeissTeam(schachbrett);
			erzeugeSchwarzTeam(schachbrett);
		} catch (UngueltigeBewegungException e) {
			System.out.println(e.getMessage());
		}

		while (spielLaueft) {
			try {
				printSchachbrett(schachbrett);
				System.out.println("Wählen Sie eine Figur (Bauer, Dame, Koenig, Laeufer, Springer, Turm):");
				String eingabeFigur = chessScanner.nextLine();
				System.out.println("Geben Sie die aktuelle Position der Figur ein (Format: x y):");
				int x = chessScanner.nextInt();
				int y = chessScanner.nextInt();
				chessScanner.nextLine();
				
				if (eingabeFigur.equalsIgnoreCase("Bauer")) {
					System.out.println("Geben Sie die Richtung der Bewegung des Bauers ein: Optionen: (vorne)");
				} else if (eingabeFigur.equalsIgnoreCase("Dame")) {
					System.out.println("Geben Sie die Richtung der Bewegung des Dame ein: Optionen: (vorne, hinten, rechts, links)\nFür diagonale Bewegung: (oben links, unten links, oben rechts, unten rechts)");
				} else if (eingabeFigur.equalsIgnoreCase("Koenig")) {
					System.out.println("Geben Sie die Richtung der Bewegung des Koenigs ein: Optionen: (vorne, hinten, rechts, links)\nFür diagonale Bewegung: (vorne links, hinten links, hinten links, hinten rechts)");
				} else if (eingabeFigur.equalsIgnoreCase("Turm")) {
					System.out.println("Geben Sie die Richtung der Bewegung des Turms ein: Optionen: (oben, unten, rechts, links)");
				} else if (eingabeFigur.equalsIgnoreCase("Laeufer")) {
					System.out.println("Geben Sie die Richtung der Bewegung des Laeufers ein: Optionen: (vorne links, hinten links, vorne rechts, hinten recht)");
				} else if (eingabeFigur.equalsIgnoreCase("Springer")) {
					System.out.println("Geben Sie die Richtung der Bewegung des Springers ein: Optionen: R: Recht, U: Unten, L: Links, R: Rechts\n(RRO, ROO, RRU, RUU, LLU, LUU, LLO, LOO)");
				} else {
					System.out.println("Bitte geben Sie eine gültige Spielfigur ein");
					
				}
				
				String richtung = chessScanner.nextLine();

				int schritte = 1;
				if (!eingabeFigur.equalsIgnoreCase("Bauer") && !eingabeFigur.equalsIgnoreCase("Koenig")
						&& !eingabeFigur.equalsIgnoreCase("Springer")) {
				
					System.out.println("Geben Sie die Anzahl der Schritte ein:");
					schritte = chessScanner.nextInt();
					chessScanner.nextLine();
				}
				Schachfigur figur = schachbrett[y][x];
				
				  if (figur == null || !figur.getClass().getSimpleName().equalsIgnoreCase(eingabeFigur)) {
	                    System.out.println("Ungültige Auswahl der Figur.");
	                    continue;
	                }

				figur.step(schritte, richtung);
				
			} catch (UngueltigeBewegungException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("Ungültige Eingabe. Bitte versuchen Sie es erneut.");
				chessScanner.nextLine();
			}
			
			
		}

		chessScanner.close();
	}

	@SuppressWarnings("unused")
	private static void erzeugeWeissTeam(Schachfigur[][] schachbrett) throws UngueltigeBewegungException {
		Bauer bauerWeiss1 = new Bauer(new Punkt2D(0, 1), "weiß", true, schachbrett);
		Bauer bauerWeiss2 = new Bauer(new Punkt2D(1, 1), "weiß", true, schachbrett);
		Bauer bauerWeiss3 = new Bauer(new Punkt2D(2, 1), "weiß", true, schachbrett);
		Bauer bauerWeiss4 = new Bauer(new Punkt2D(3, 1), "weiß", true, schachbrett);
		Bauer bauerWeiss5 = new Bauer(new Punkt2D(4, 1), "weiß", true, schachbrett);
		Bauer bauerWeiss6 = new Bauer(new Punkt2D(5, 1), "weiß", true, schachbrett);
		Bauer bauerWeiss7 = new Bauer(new Punkt2D(6, 1), "weiß", true, schachbrett);
		Bauer bauerWeiss8 = new Bauer(new Punkt2D(7, 1), "weiß", true, schachbrett);

		Koenig koenigWeiss = new Koenig(new Punkt2D(4, 0), "weiß", true, schachbrett);
		Dame dameWeiss = new Dame(new Punkt2D(3, 0), "weiß", true, schachbrett);
		Laeufer laeufer1Weiss = new Laeufer(new Punkt2D(2, 0), "weiß", true, schachbrett);
		Laeufer laeufer2Weiss = new Laeufer(new Punkt2D(5, 0), "weiß", true, schachbrett);
		Turm turm1Weiss = new Turm(new Punkt2D(0, 0), "weiß", true, schachbrett);
		Turm turm2Weiss = new Turm(new Punkt2D(7, 0), "weiß", true, schachbrett);

		Springer springer1Weiss = new Springer(new Punkt2D(1, 0), "weiß", true, schachbrett);
		Springer springer2Weiss = new Springer(new Punkt2D(6, 0), "weiß", true, schachbrett);

	}

	@SuppressWarnings("unused")
	private static void erzeugeSchwarzTeam(Schachfigur[][] schachbrett) throws UngueltigeBewegungException {

		Bauer bauerSchwarz1 = new Bauer(new Punkt2D(0, 6), "schwarz", false, schachbrett);
		Bauer bauerSchwarz2 = new Bauer(new Punkt2D(1, 6), "schwarz", false, schachbrett);
		Bauer bauerSchwarz3 = new Bauer(new Punkt2D(2, 6), "schwarz", false, schachbrett);
		Bauer bauerSchwarz4 = new Bauer(new Punkt2D(3, 6), "schwarz", false, schachbrett);
		Bauer bauerSchwarz5 = new Bauer(new Punkt2D(4, 6), "schwarz", false, schachbrett);
		Bauer bauerSchwarz6 = new Bauer(new Punkt2D(5, 6), "schwarz", false, schachbrett);
		Bauer bauerSchwarz7 = new Bauer(new Punkt2D(6, 6), "schwarz", false, schachbrett);
		Bauer bauerSchwarz8 = new Bauer(new Punkt2D(7, 6), "schwarz", false, schachbrett);

		Koenig koenigSchwarz = new Koenig(new Punkt2D(4, 7), "schwarz", false, schachbrett);
		Dame dameSchwarz = new Dame(new Punkt2D(3, 7), "schwarz", false, schachbrett);
		Laeufer laeufer1Schwarz = new Laeufer(new Punkt2D(2, 7), "schwarz", false, schachbrett);
		Laeufer laeufer2Schwarz = new Laeufer(new Punkt2D(5, 7), "schwarz", false, schachbrett);
		Turm turm1Schwarz = new Turm(new Punkt2D(0, 7), "schwarz", false, schachbrett);
		Turm turm2Schwarz = new Turm(new Punkt2D(7, 7), "schwarz", false, schachbrett);

		Springer springer1Schwarz = new Springer(new Punkt2D(1, 7), "schwarz", false, schachbrett);
		Springer springer2Schwarz = new Springer(new Punkt2D(6, 7), "schwarz", false, schachbrett);

	}

	public static void printSchachbrett(Schachfigur[][] schachbrett) {
		System.out.println("+------------------------+");
		for (int i = schachbrett.length - 1; i >= 0; i--) {
			 System.out.print("|");
			for (int j = 0; j < schachbrett[i].length; j++) {
				
				if (schachbrett[i][j] instanceof Bauer) {
					if (schachbrett[i][j].istWeiss) {

						System.out.print("BW ");
					} else {
						System.out.print("BS ");
					}

				} else if (schachbrett[i][j] instanceof Dame) {
					if (schachbrett[i][j].istWeiss) {
						System.out.print("DW ");
					} else {
						System.out.print("DS ");
					}

				} else if (schachbrett[i][j] instanceof Koenig) {
					if (schachbrett[i][j].istWeiss) {
						System.out.print("KW ");
					} else {
						System.out.print("KS ");
					}

				} else if (schachbrett[i][j] instanceof Laeufer) {
					if (schachbrett[i][j].istWeiss) {
						System.out.print("LW ");
					} else {
						System.out.print("LS ");
					}
				} else if (schachbrett[i][j] instanceof Springer) {
					if (schachbrett[i][j].istWeiss) {
						System.out.print("SW ");
					} else {
						System.out.print("SS ");
					}
				} else if (schachbrett[i][j] instanceof Turm) {
					if (schachbrett[i][j].istWeiss) {
						System.out.print("TW ");
					} else {
						System.out.print("TS ");
					}
				} else {
					System.out.print("   ");
				}
			}
			   System.out.println("|");
		}
		System.out.println("+------------------------+");
	}

}
