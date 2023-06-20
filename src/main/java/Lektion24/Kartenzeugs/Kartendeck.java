package Lektion24.Kartenzeugs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Kartendeck {
    int size;
    List<Karte> deck;


    public  void  erzeugeDeck(){

        deck =Arrays.stream(Farbe.values()).flatMap(f -> Arrays.stream(Wert.values()).map(w -> new Karte(f, w))).collect(Collectors.toList());
    }
    @Override
    public String toString() {
        return deck.stream().map(k -> k.farbe + " " + k.wert).collect(Collectors.joining(", "));
    }
    public static void main(String[] args){
        Kartendeck k = new Kartendeck();
        k.erzeugeDeck();
        System.out.println(k);
    }

}
