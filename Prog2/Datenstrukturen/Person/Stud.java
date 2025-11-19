package Person;

public class Stud extends Person {

	private static int naechsterMatrikelnummer = 100;
	private int matrikelnummer;

	public Stud(String name, int geburtsjahr) {
		super(name, geburtsjahr);
		this.matrikelnummer = naechsterMatrikelnummer++;
	}

	public int getMatrikel() {
		return matrikelnummer;
	}
	@Override
	public int getGeburtsjahr() {
		
		return super.getGeburtsjahr();
	}

	@Override
	public String toString() {

		return this.matrikelnummer + " " + getName() + " "+  getGeburtsjahr();
	}
	
	
	}

