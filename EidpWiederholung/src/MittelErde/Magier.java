package MittelErde;

public class Magier extends Wesen {

	public Magier(String name, int alter) {
		super(name, alter);
		
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
	public String toString() {
		
		return super.toString();
	}
	

}
