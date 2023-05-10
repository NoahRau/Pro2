package Lektion20.Skat;

import java.util.ArrayList;
import java.util.Collections;

public class Player {
    private final String name;
    ArrayList<Karten> karten = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void printHand() {
        System.out.println(name + " hat folgende Karten auf der Hand");
        for (Karten k : karten) {
            System.out.printf("%-5s %s %n", k.getSymbol() , k.getValue().name());
        }
    }

    public void sortHand() {
        Collections.sort(karten);
    }
}
