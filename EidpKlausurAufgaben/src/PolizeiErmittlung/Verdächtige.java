package PolizeiErmittlung;

public class Verdächtige extends Person {

	private static int id = 1;

	String motiv;
	boolean alibi;
	int nummer;

	public Verdächtige(String name, int vorstrafen, String motiv, boolean alibi) {
		super(name, vorstrafen);
		this.motiv = motiv;
		this.alibi = alibi;
		nummer = id++;

	}

	public String getMotiv() {
		return motiv;
	}

	public boolean HasAlibi() {
		return alibi;
	}

	public String toString() {
		return  "Nr-" + nummer + ": " + super.toString() + ", Motiv: " + motiv + ", Alibi: " + alibi;
		
	}

}
