package ComparableStud;

public class Stud implements Comparable<Stud> {

	private static int nextNr = 100;

	private String name;
	private int matNr;

	public Stud(String name) {
		this.name = name;
		this.matNr = nextNr++;

	}

	public String getName() {
		return name;
	}

	public int getMatNr() {
		return matNr;
	}

	@Override
	public String toString() {

		return name + "(" + matNr + ")";

	}

	@Override
	public int compareTo(Stud o) {

		if (this.matNr > o.matNr) {
			return 1;

		} else if (this.matNr < o.matNr) {
			return -1;

		} else {
			return 0;
		}

	}

}
