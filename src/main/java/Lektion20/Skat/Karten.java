package Lektion20.Skat;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Karten implements Comparable<Karten>{
    private final Values value;
    private final Symbols symbol;

    public Karten(Values value,Symbols symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public Values getValue() {
        return value;
    }

    public Symbols getSymbol() {
        return symbol;
    }

    @Override
    public int compareTo(@NotNull Karten o) {
        int comp = compareSymbol(o);
        if (value.getValue() == 14) return -1;
        if (o.value.getValue() == 14) return 1;
        return switch (comp) {
            case 0 -> Integer.compare(o.value.getValue(),this.value.getValue());
            default -> comp;
        };
    }

    private int compareSymbol(Karten o) {
        if(Objects.equals(this.symbol.getValue(), o.symbol.getValue()))return 0;
        return this.symbol.getValue() > o.symbol.getValue()  ? -1 : 1;
    }


    public enum Values {

        Sieben(7), Acht(8), Neun(9), Zehn(10), Bube(11), Dame(12), Koenig(13), Ass(14);

        private final int value;

        Values(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum Symbols {
        HERZ(1), KARO(0), PIK(2), KREUZ(3);

        private final int value;

        Symbols(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
