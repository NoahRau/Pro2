package Lektion23.Comp;

import java.util.Arrays;
import java.util.TreeSet;

public class Compschund {

    static String[] alleWoerter = {"Bienenschwarm", "Buch", "Bibel",
            "Beige", "Barriere", "Bein", "Beil", "Christ", "Christian", "Carmen"};

    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>((String o1, String o2) -> {
            if (o1.length() < o2.length()) return -1;
            else if (o1.length() > o2.length()) return 1;
            else return o1.compareTo(o2);
        });
        t.addAll(Arrays.asList(alleWoerter));
        for (String wort : t) System.out.println(wort);
    }
}
