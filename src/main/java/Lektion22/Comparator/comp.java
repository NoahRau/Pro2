package Lektion22.Comparator;

import java.util.Comparator;

public class comp<T> implements Comparator<T> {
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
