package Setzbar;

public class TestMainSetzbar {
	
	public static void main(String[] args) {
		testKiste();
		testSpieler();
	}
	
	public static void testKiste() {
		Kiste<Double> box = new Kiste<>();
		Kiste<Integer> bix = new Kiste<>();
		
		
		
		box.set(2.3);
		bix.set(42);
		
		Integer i = bix.get();
		Double d = box.get();
		
		box.reset();
		d = box.get();
		System.out.println(d + " " + i);
	}
	
	public static void testSpieler() {
		Spieler s = new Spieler();
		s.set("nicki");
		System.out.println(s.get());
		s.reset();
		System.out.println(s.get());
	}

}
