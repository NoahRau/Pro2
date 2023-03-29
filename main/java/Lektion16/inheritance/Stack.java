package Lektion16.inheritance;

public interface Stack<E> {
    void push(E item);
    E pop();
    boolean isEmpty();
    int size();
}
