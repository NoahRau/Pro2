package Pruefung.MusikstueckSammlung;

import java.util.Comparator;

public class VergleicheMusikStueckLaenge<E> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {

        if(Integer.valueOf(o1.toString().split("\nDauer in s:")[1]).equals(Integer.valueOf(o2.toString().split("\nDauer in s:")[1])))return 0;
        return Integer.parseInt(o1.toString().split("\nDauer in s:")[1])>Integer.parseInt(o2.toString().split("\nDauer in s:")[1])?1:-1 ;
    }
}
