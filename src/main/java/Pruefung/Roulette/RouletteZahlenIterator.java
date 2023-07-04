package Pruefung.Roulette;

import java.util.Iterator;
import java.util.Random;

public class RouletteZahlenIterator implements Iterator<Integer> {
    private Random random;
    private int zeroCount;

    public RouletteZahlenIterator(){
        zeroCount=0;
        random=new Random();
    }
    @Override
    public boolean hasNext() {
        return zeroCount<3;
    }

    @Override
    public Integer next() {

        int randomNumber=random.nextInt(37);
        if(randomNumber==0)zeroCount++;
        return randomNumber;
    }
    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove() is not supported.");
    }
}
