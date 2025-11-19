package PersonGetraenkStudent;

public class Getraenkekarte {
	
	/* Klassenmethoden */
	
	public static void main(String[] args) {
		
		Getraenkekarte gk = new Getraenkekarte();
		gk.neuesGetraenk(new Getraenk("Cola", 200, 250, 0)); 
		gk.neuesGetraenk(new Getraenk("Bier", 200, 200, 16));
		gk.neuesGetraenk(new Getraenk("Vodka", 20, 300, 18));
				
		System.out.println(gk);
		Getraenk g = gk.suchen("Cola");
			
		if(g != null) {
				
		System.out.println(g);
				
		}	
		
	}
	
	/* Instanzvariabeln */
	
	Getraenk[] getraenke;
	
	/* Konsturktoren */
	
	public Getraenkekarte() {
		this.getraenke = new Getraenk[0];
		  
	}
	
	/* Instanzmethoden*/
	
	public void neuesGetraenk(Getraenk g) {
		Getraenk[] tmp = new Getraenk[this.getraenke.length + 1];
		
		for (int i = 0; i < this.getraenke.length; i++) {
			tmp[i] = this.getraenke[i];
			
		}
		
		tmp[tmp.length - 1] = g;
		this.getraenke = tmp;
		
		
	}
	
	public String toString() {
		
		String erg ="";
		
		for (int i = 0; i < getraenke.length; i++) {
			erg += getraenke[i] + "\n";
		}
		return erg;  
	}
	
	public Getraenk suchen(String name) {
		for (int i = 0; i < getraenke.length; i++) {
			if (this.getraenke[i].name.equals(name)) {
				return this.getraenke[i];	
				
			}
		}
		
		return null;
	}

}
