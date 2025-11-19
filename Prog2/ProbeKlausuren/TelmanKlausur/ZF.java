package TelmanKlausur;

public class ZF extends Liste<Integer> {
// default konstruktor
	ZF() {
	}

	private int nextValue(int n) { // bestimme den nächsten Wert der Zahlenfolge
		return (2 * n) - 3;
	}

	public void extend(int n) { // erzeuge n weitere Zahlen der Folge
		while (0 < n--) { 
			if (0 == size)
				append(7);
			else
				append(nextValue(get(size - 1)));
		}
	}
	
	public static void main(String[] args) {
		
		ZF folge = new ZF();
		folge.extend(5);
		
		System.out.println(folge);
		
		
	}
	
	
}
