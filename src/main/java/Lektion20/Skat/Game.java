package Lektion20.Skat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Game {
    ArrayList<Karten> karten = new ArrayList<>();
    ArrayList<Karten> spieldeck = new ArrayList<>();
    Set<Player> player = new HashSet<>();

    private static final int CARD_AMOUNT = 10;

    public void addPlayer(Player p) {
        player.add(p);
    }

    public void genCards(){
        for(Karten.Symbols symbol : Karten.Symbols.values()) {
            for (Karten.Values value : Karten.Values.values()) {
                karten.add(new Karten(value, symbol));
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
        Player p2 = new Player("Martin");
        game.addPlayer(p2);
        Player p3 = new Player("Anna");
        game.addPlayer(p3);
        game.genCards();
        game.mixCards();
        game.dealCards();
        p.sortHand();
        p.printHand();
        p2.sortHand();
        p2.printHand();
        p3.sortHand();
        p3.printHand();

    }
}
