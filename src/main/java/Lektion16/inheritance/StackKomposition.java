package Lektion16.inheritance;

import java.util.ArrayList;

public class StackKomposition<E> extends ArrayList<E>{


        public StackKomposition() {
            super();
        }

        public void push(E item) {
            add(item);
        }

        public E pop() {
            int size = size();
            return remove(size - 1);
        }

        public boolean isEmpty() {
            return isEmpty();
        }

        public int size() {
            return size();
        }
    }


