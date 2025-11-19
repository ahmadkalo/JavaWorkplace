package Lebewesen;

public class Hund extends Tier {
	
	
	String art;
	String fellfarbe;
	boolean kannSpringen;
	
	
	
	
	public Hund(int alter, int größe, String geräusch, boolean kannFliegen, String art, String fellfarbe, boolean kannSpringen) {
		super(alter, größe, geräusch, kannFliegen);
		this.art = art;
		this.fellfarbe = fellfarbe;
		this.kannSpringen = kannSpringen;
			
	}
	
	
	public String toString() {

		return this.art + ", " + this.größe + ", " +  this.geräusch + ", " +  this.kannFliegen + ", " + this.art + ", " + this.fellfarbe + ", " + this.kannSpringen;
	}

}