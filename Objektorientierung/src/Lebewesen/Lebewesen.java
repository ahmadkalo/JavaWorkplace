package Lebewesen;


public class Lebewesen {
	
	int alter;
	int größe;
	
	public Lebewesen(int alter, int größe) {
	
		this.alter = alter;
		this.größe = größe;
	}


	public void fortPflanzen() {
		System.out.println("Dieses Lebewesen kann sich forpflanzen");
	}

	
	public void wachsen() {
		
		System.out.println("Das Lebewesen wächst schnell");
	
	}

}
