
package Person;

public class Boxer extends Sportler {
	double kg;
	public Boxer(String name, int gebJahr, double kg) {
		super(name, gebJahr);
		this.kg = kg;
		
		
	}
	
	public double getKg() {
		return kg;
	}
	
	public void setKg(double kg) {
		this.kg = kg;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "Gewicht: " +  kg ;
	}
	


	
	
	
	

}
