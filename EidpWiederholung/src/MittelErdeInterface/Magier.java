package MittelErdeInterface;

public class Magier extends Wesen {

	public Magier(String name, int alter, double geldbeutel, Tragbar ding) {
		super(name, alter, geldbeutel, ding);
		
	}
	@Override
	public void gruss() {
		System.out.println("Sei gegrüßt");
		
	}
	
	public void heilt (Hobbit hobbit) {
		if(hobbit.lebenserwartung > 0) {
			hobbit.lebenserwartung = 150;
		} else {
			System.out.println(hobbit.name + " kann leider nicht geheilt werden er ist tot");
		}
		
	}
	
	@Override
	public void traegt(Gegenstand gegenstand) {
		
		System.out.println(this.name + " " + "trägt " + gegenstand.getBezeichnung() );
		
	}
	
	@Override
	public void kaufen(Kaufbar kaufbar) {
		if (kaufbar.preis() <= this.geldbeutel) {
			System.out.println(this.name + " kann ein " +  kaufbar.getClass().getSimpleName()  +  " kaufen");
		} else {
			System.out.println(this.name + " hat leider nicht genug Geld, um ein " + kaufbar.getClass().getSimpleName() +" zu kaufen");
		}
	}
	
	@Override
	public void nehmen(Tragbar ding) {

		System.out.println(this.name + " hat jetzt " + ding.getClass().getSimpleName() + " genommen");
	}

	
	@Override
	public String toString() {
		
		return super.toString();
	}
	
	
	
	
	

}
