package Lektion16.Cyborg;

public class Roboter  {


    public Entscheidung entscheide(Gefahr situation) {
        return switch (situation) {
            case GEFAHR_LINKS -> Entscheidung.RECHTS;
            case GEFAHR_RECHTS -> Entscheidung.LINKS;
            case GEFAHR_VORNE -> Entscheidung.BREMSEN;
        };
    }


}

