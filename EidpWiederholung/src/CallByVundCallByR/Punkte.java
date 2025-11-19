package CallByVundCallByR;

public class Punkte {

	public static void main(String[] args) {
		int hausarbeit = 5;
		int vortrag = 8;
		int summe = 0;
		bewerten(hausarbeit, vortrag, summe);
		System.out.println("erreichte Punkte : " + summe);
	}

	public static void bewerten(int h, int v, int s) {

		h = h*3;
		v = v*2;
		s = h+v;
		return;
	}

}

		/*
		Die Methode main initialisiert drei Variablen: hausarbeit, vortrag und summe.
		Anschließend ruft sie die Methode bewerten auf und übergibt diese drei Variablen.
		Die Methode bewerten ändert die Werte ihrer Parameter, aber sie gibt keinen Wert 
		zurück und ändert nicht die ursprünglichen Variablen in der Methode main.
		Daher bleibt summe 0 und dies wird ausgegeben.
		 */