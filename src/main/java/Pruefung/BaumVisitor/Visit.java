package Pruefung.BaumVisitor;

public class Visit<E> implements Visitor<E>{
    private int count;

    public Visit(){
        count=0;
    }
    @Override
    public void visit(Baum.Knoten<E> current) {  count++;
    }

    public int getCount() {
        return count;
    }
}
