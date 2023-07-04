package Pruefung.BaumVisitor;

public interface Visitor<T> {
    public void visit(Baum.Knoten<T> current);
}
