package Lebewesen;


public class Tier extends Lebewesen {
	 
	
	String geräusch;
	boolean kannFliegen;

		
	

	public Tier(int alter, int größe, String geräusch, boolean kannFliegen) {
		super(alter, größe);
		this.geräusch = geräusch;
		this.kannFliegen = kannFliegen;
	}




	public void macheGeräusch() {
		System.out.println(geräusch);
	}
}
