package Lektion22.Baum;


public class Baum<E extends Comparable<E>> {

    int size;
    public static class Knoten<E>
    {
        Knoten<E> left;
        Knoten<E> right;
        E content;

    }

    Knoten<E> root;

    public int size() {
        SizeVisitor<E> visitor = new SizeVisitor<>();
        traversiere(visitor);
        return visitor.getCount();
    }

    public void einfuegen(E content) {
        //size++;
    }
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
}
