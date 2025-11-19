package Person;

import StudentModul.Modul;

public class Stud extends Person {
	
	int matNr;
	int cp;

	public Stud(String name, int gebJahr, int matNr, int cp) {
		super(name, gebJahr);
		this.matNr = matNr;
		this.cp = cp;
	}
	
	public void belegen(Modul m) {
		
	}
	
	public void pruefung(Modul m, double c) {
		
	}
	
	
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stud other = (Stud) obj;
		return cp == other.cp && matNr == other.matNr;
	}

	@Override
	public String toString() {
	
		return super.toString() + "Matrikelnummer: " + matNr + "Creditpoints:" + cp;
	}
	
	

}
