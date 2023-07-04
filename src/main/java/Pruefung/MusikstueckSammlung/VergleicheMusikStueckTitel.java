package Pruefung.MusikstueckSammlung;

import java.util.Comparator;

public class VergleicheMusikStueckTitel<E> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        for(int i=0; o1.toString().length()>i;i++){
            if(o1.toString().charAt(i)!=o2.toString().charAt(i))return o1.toString().charAt(i)>o2.toString().charAt(i)?1:-1;
        }return 0;
    }
}
