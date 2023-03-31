package Lektion16.Cyborg;

public class Mensch{
    public Entscheidung entscheide(Gefahr situation) {
        if (getUnentschieden() < 0.25) {
            return Entscheidung.UNENTSCHIEDEN;
        }
        else {
            return switch (situation) {
                case GEFAHR_LINKS -> Entscheidung.RECHTS;
                case GEFAHR_RECHTS -> Entscheidung.LINKS;
                case GEFAHR_VORNE -> Entscheidung.BREMSEN;
            };
        }
    }
    public double getUnentschieden(){
        return  Math.random();
    }


    }


