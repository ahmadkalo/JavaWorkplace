
public class IntKiste {
	
	private int inhalt;
	
	public IntKiste(int i ) {
		inhalt = i;
		
		
	}
	
	public int getInhalt() {
		return inhalt;
	}
	public void setInhalt(int inhalt) {
		this.inhalt = inhalt;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.inhalt + " ";
	}

}
