package FeldIterable;

import java.util.Comparator;

public class StringLengthComp implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }
}

