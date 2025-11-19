package Fehler;

public class FehlerTest {
	
	public static void main(String[] args) {
		
		
		try {
		testen1();
		testen2();
		} catch (Fehler1 e) {
			System.out.println(e.getMessage());
		} catch (Fehler2 e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Ich werde immer ausgegeben");
		}
		System.out.println("Ende");
		
	}
	
	
	static void testen1() {
		throw new Fehler1("Es ist was schiefgelaufen (Fehler1)" );
	}
	
	static void testen2() throws Fehler2 {
		throw new Fehler2("Hier ist eine geprüfte Fehler");
	}

}
