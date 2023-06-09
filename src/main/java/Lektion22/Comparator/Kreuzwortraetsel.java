package Lektion22.Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Kreuzwortraetsel {
    static String[] alleWoerter = {"Bienenschwarm", "Buch", "Bibel",
            "Beige", "Barriere", "Bein", "Beil", "Christ", "Christian", "Carmen"};
    public static void main(String[] args)
    {
        TreeSet<String> t = new TreeSet<>(new compx<>());
        t.addAll(Arrays.asList(alleWoerter));
        for(String wort : t)
            System.out.println(wort);
    }
    private static class compx<T> implements Comparator<T> {
        @Override
        public int compare(T o1, T o2) {
            if(o1.toString().length()==o2.toString().length())return compareAlph( o1,  o2);
            else return o1.toString().length()>o2.toString().length() ? 1: -1;
        }
        public int compareAlph(T o1, T o2){
            for(int i =0;i<o1.toString().length();i++){
                if(o1.toString().charAt(i)!=o2.toString().charAt(i))return o1.toString().charAt(i)>o2.toString().charAt(i) ?1:-1;
            }
            return 0;
        }

    }
}
