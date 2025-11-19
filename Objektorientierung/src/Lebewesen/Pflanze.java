package Lebewesen;


public class Pflanze extends Lebewesen {
	
	boolean hatNadeln;
	
	
	
 	public Pflanze(int alter, int größe, boolean hatNadeln) {
		super(alter, größe);
		this.hatNadeln = hatNadeln;
		
	}


	
	public void gebeFrüchte() {
		System.out.println("Früchte");
	}
	
}
