package Lektion20.MauMau;

import java.util.ArrayList;

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
}
