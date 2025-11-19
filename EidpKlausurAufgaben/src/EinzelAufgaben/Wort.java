package EinzelAufgaben;

public class Wort {
	
	public static String createWorte(char[] zeichen, int[] werte) throws WortException {
		
		
		
		String summe = "";
		for (int i = 0; i < werte.length; i++) {
			int index = werte[i];
			if(index < 0 || index >= zeichen.length ) {
				throw new WortException("Ungültiger Index: " + index);
			}
			summe += zeichen[index];
			  
		}
		return summe;
		
	}
	
	
	public static void main(String[] args) {
		
		char[] zeichen = {'S','C','H','I','F','F','E'};
		
		int[] werte = {0,6,3,5,6};
		try {
			String summe = createWorte(zeichen, werte);
			System.out.println(summe);	
		} catch (WortException e) {
			  System.out.println("Fehler: " + e.getMessage());
			
		}
		
	}

}
