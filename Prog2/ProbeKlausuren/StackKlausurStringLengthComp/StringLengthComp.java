package StackKlausurStringLengthComp;

import java.util.Comparator;

public class StringLengthComp implements Comparator<String> {

	public static void main(String[] args) {
		Comparator<String> c = new StringLengthComp();
		System.out.println(c.compare("kurz", "laenger "));
		System.out.println(c.compare("kurz", "auch"));
		System.out.println(c.compare(" laenger ", "kurz "));
	}

	@Override
	public int compare(String s1, String s2) {
		Integer i1 = s1.length();
		Integer i2 = s2.length();
		if (i1 < i2) {
			return -1;
		} else if (i1 > i2) {
			return 1;
		} else {
			return 0;
		}
	}

}
