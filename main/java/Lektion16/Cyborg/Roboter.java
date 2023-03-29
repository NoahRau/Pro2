package Lektion16.Cyborg;

public class Roboter {
    public Entscheidung entscheide(Gefahr situation) {
        switch (situation) {
            case GEFAHR_LINKS:
                return Entscheidung.RECHTS;
            case GEFAHR_RECHTS:
                return Entscheidung.LINKS;
            case GEFAHR_VORNE:
                return Entscheidung.BREMSEN;
            default:
                // ansonsten wird eine zufällige Entscheidung getroffen
                int randomNum = (int) (Math.random() * 3);
                switch (randomNum) {
                    case 0:
                        return Entscheidung.LINKS;
                    case 1:
                        return Entscheidung.RECHTS;
                    default:
                        return Entscheidung.BREMSEN;
                }
        }
    }
}
