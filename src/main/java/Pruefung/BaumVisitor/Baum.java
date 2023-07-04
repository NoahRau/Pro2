package Pruefung.BaumVisitor;

import java.util.Comparator;
public class Baum<E extends Comparator<E>> {
    public static class Knoten<E>
    {
        Knoten<E> left;
        Knoten<E> right;
        E content;
    }

    Knoten<E> root;
    public void einfuegen(E content) {  }
    protected void traversiere(Visitor<E> visitor)
    {
        if (root == null) return;
        else traversiere(root, visitor);
    }
    protected void traversiere(Knoten<E> current, Visitor<E> visitor)
    {
        if (current.left != null) traversiere(current.left, visitor);
        visitor.visit(current);
        if (current.right != null) traversiere(current.right, visitor);
    }
    public int size(){
        Visit<E> visitor = new Visit<E>();
        traversiere(visitor);
        return visitor.getCount();
    }

}
