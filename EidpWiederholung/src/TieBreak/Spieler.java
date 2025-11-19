package TieBreak;

public class Spieler {
	
	private String name;
	private double gewinnWahrscheinlichkeit;

	public Spieler(String name, double gewinnWahrscheinlichkeit) {
		this.name = name;
		this.gewinnWahrscheinlichkeit = gewinnWahrscheinlichkeit;
	}

	public boolean gewinnt() {
		return Math.random() < gewinnWahrscheinlichkeit;
	}

	public String getName() {
		return name;
	}
}
