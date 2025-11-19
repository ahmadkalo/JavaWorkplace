package MittelErde;

public abstract class Wesen {
	
	String name;
	int alter;
	
	public Wesen(String name, int alter) {
		this.name = name;
		this.alter = alter;
	}
	
	
	public abstract void gruss(); 
	
	
	@Override
	public String toString() {
		return "Name: " + this.name + ", Alter: " + this.alter;
	}
	
	

}
