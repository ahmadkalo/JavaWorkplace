package Kalender;
public class Jahr {
	
	int jahreszahl;
	Tag[] tage;
	int belegteTage;
	
	
	public Jahr(int jahreszahl) {
		this.jahreszahl = jahreszahl;
		this.tage = new Tag[356];
		belegteTage = 0;
	}
	
	
	public void eintragen(int tag, String was, int prioritaet) {
		if (this.tage[tag-1] != null
				&& this.tage[tag-1].getVerabredung() != null)
			System.out.println("Fehler: " + this.tage[tag-1].getVerabredung());
		else {
			Tag neuerTag =  new Tag();
			neuerTag.eintragen(was, prioritaet);
			this.tage[tag-1] = neuerTag;
			belegteTage++;
		}
	}
	
	public String getTermin(int tag) {
		if (this.tage[tag-1] == null)
			return null;

		return this.tage[tag-1].getVerabredung();
		
	}
	
	public int getPrioritaet(int tag) {
		if (this.tage[tag-1] == null)
			return 0;
		
		return this.tage[tag-1].getPrioritaet();
		
	}
	
	public int getBelegt() {
		return belegteTage;
	}
}