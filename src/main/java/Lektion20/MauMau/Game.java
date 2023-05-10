package Lektion20.MauMau;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Game {
    ArrayList<Karten> karten = new ArrayList<>();
    ArrayList<Karten> spieldeck = new ArrayList<>();
    Set<Player> player = new HashSet<>();

    private static final int CARD_AMOUNT = 6;

    public void addPlayer(Player p) {
        player.add(p);
    }

    public void genCards(){
        for(Karten.Symbols symbol : Karten.Symbols.values()) {
            for (Karten.Values value : Karten.Values.values()) {
                karten.add(new Karten(value, symbol.getValue()));
            }
        }
    }
    public void mixCards(){
        for(int i = karten.size(); i > 0; i--) {
            spieldeck.add(karten.remove((int) (Math.random()*i)));
        }
    }

    public void dealCards() {
        for (int i = 0; i < CARD_AMOUNT; i++) {
            for(Player p : player) {
                p.karten.add(spieldeck.remove(0));
            }
        }
    }
    public static void main(String[] args) {
        Game game = new Game();
        Player p = new Player("Noah");
        game.addPlayer(p);
        game.genCards();
        game.mixCards();
        game.dealCards();
        p.printHand();

    }
}
