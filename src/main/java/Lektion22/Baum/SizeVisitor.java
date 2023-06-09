package Lektion22.Baum;

public class SizeVisitor<T> implements Visitor<T> {
    private int count;

    public SizeVisitor() {
        count = 0;
    }

    public void visit(Baum.Knoten<T> current) {
        count++;
    }

    public int getCount() {
        return count;
    }
}
