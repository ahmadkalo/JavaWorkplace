package MittelErdeInterface;

public abstract class Wesen {

	String name;
	int alter;
	double geldbeutel;
	Tragbar ding;

	public Wesen(String name, int alter, double geldbeutel, Tragbar ding) {
		this.name = name;
		this.alter = alter;
		this.geldbeutel = geldbeutel;
		this.ding = ding;

	}
	
	public abstract void nehmen(Tragbar ding);
	
	public abstract void traegt(Gegenstand gegenstand);

	public abstract void gruss();
	
	public abstract void kaufen(Kaufbar kaufbar);
	
	 public void tragen() {
		 
	 }

	@Override
	public String toString() {
		return "Name: " + this.name + ", Alter: " + this.alter + ", Geldbeutel: " + this.geldbeutel;
	}


	

}
