package Lektion16.Cyborg;

public class Mensch {
    public Entscheidung entscheide(Gefahr situation) {
        switch (situation) {
            case GEFAHR_LINKS:
                return Entscheidung.RECHTS;
            case GEFAHR_RECHTS:
                return Entscheidung.LINKS;
            case GEFAHR_VORNE:
                return Entscheidung.BREMSEN;
            default:
                // 25% der Fälle ist der Mensch unentschieden
                if (Math.random() < 0.25) {
                    return Entscheidung.UNENTSCHIEDEN;
                } else {
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
}
