package Lektion22.Baum;

public interface Visitor<T> {


        void visit(Baum.Knoten<T> current);

}
