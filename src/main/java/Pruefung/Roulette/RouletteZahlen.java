package Pruefung.Roulette;

import java.util.ArrayList;
import java.util.Iterator;

public class RouletteZahlen implements Iterable<Integer>{
    @Override
    public Iterator<Integer> iterator()
    {
        return new RouletteZahlenIterator();
    }
    public static void main(String[] args){
        RouletteZahlenIterator r = new RouletteZahlenIterator();
        ArrayList<Integer> list = new ArrayList<>();
        for (; r.hasNext(); ) {
            int zahlen = r.next();
            list.add(zahlen);
        }
        System.out.println(list);
    }
}
