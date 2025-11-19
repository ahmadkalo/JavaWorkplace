package ArrayBasics;
public class zdarrays {

	public static void main(String[] args) {

		String[][] zweiD = { { "Das", "Problem", "ist" }, { "Ich", "kann", "nicht" },
				{ "so", "gut", "programmieren" } };

//Hier wird ein 2-dimensionales Array zweiD erstellt und initialisiert. Es enthält drei Unterarrays, die jeweils eine Zeile repräsentieren 

		for (int i = 0; i < zweiD.length; i++) {
			for (int j = 0; j < zweiD[i].length; j++) {
				System.out.print(zweiD[i][j] + " ");

				// Die äußere Schleife durchläuft die Zeilen des 2D-Arrays (zweiD.length).
				// Die innere Schleife durchläuft die Elemente in jeder Zeile (zweiD[i].length).
			}

		}

	}

}
