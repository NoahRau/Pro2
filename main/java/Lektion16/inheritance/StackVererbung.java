package Lektion16.inheritance;


import java.util.ArrayList;

//Klasse zum Upload ins e-learning
@SuppressWarnings("all")
public class StackVererbung<E> implements Stack<E> {
    private ArrayList<E> list;

    public StackVererbung() {
        list = new ArrayList<E>();
    }

    public void push(E item) {
        list.add(item);
    }

    public E pop() {
        int size = list.size();
        E item = list.get(size - 1);
        list.remove(size - 1);
        return item;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
