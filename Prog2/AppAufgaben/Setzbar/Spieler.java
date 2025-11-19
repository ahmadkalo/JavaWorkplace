package Setzbar;

public class Spieler implements Setzbar<String> {

	private String nickname;

	@Override
	public void set(String n) {
		this.nickname = n;
	}

	@Override
	public String get() {
		return this.nickname;
	}

	@Override
	public void reset() {
		this.nickname = "dummy";
	}

}