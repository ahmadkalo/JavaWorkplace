package Tennisspieler;


public class Tennisspieler extends Sportler {

	private int atpPunkte;
	private boolean linkshaender;
    private int[] turnierSiege;
    private int siegeCount;
    
	public Tennisspieler(String name, int gebJahr, boolean linkshaender) {
		super(name, gebJahr);
		this.atpPunkte = 0;
		this.linkshaender = linkshaender;
		this.siegeCount = 0;
		this.turnierSiege = new int[10];
	}
	
	public int getAtpPunkte() {
		return atpPunkte;
	}
	
	public boolean getRechtsOderLinks() {
		return linkshaender;
	}
	
	public void setAtpPunkte(int atpPunkte) {
		this.atpPunkte = atpPunkte;
	}
	

    public void gewinneTurnier(Turnier turnier) {
    	
        if (siegeCount < 10) {
            turnierSiege[siegeCount] = turnier.getAtpPunkte();
            siegeCount++;
        } else {
            
            for (int i = 1; i < 10; i++) {
                turnierSiege[i - 1] = turnierSiege[i];
            }
            turnierSiege[9] = turnier.getAtpPunkte();
        }
    }

    public int berechneAtpPunkte() {
        int sum = 0;
        for (int i = 0; i < siegeCount; i++) {
            sum += turnierSiege[i];
        }
        return sum;
    }
	
	@Override
	public String toString() {
		
		return "Name: " + getName() + "\n"+ "ATP-Punkte: " + berechneAtpPunkte();
	}
	
	
	

}
