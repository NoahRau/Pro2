package Lektion16.Cyborg;

public class Cyborg {
    private Mensch mensch;
    private Roboter roboter;

    public Cyborg(Mensch mensch, Roboter roboter) {
        this.mensch = mensch;
        this.roboter = roboter;
    }

    public Entscheidung entscheide(Gefahr situation) {
        Entscheidung entscheidungMensch = mensch.entscheide(situation);
        Entscheidung entscheidungRoboter = roboter.entscheide(situation);
        if (entscheidungMensch == entscheidungRoboter) {
            return entscheidungMensch;
        } else {
            // in 50% der Fälle wird die Entscheidung des Menschen getroffen
            if (Math.random() < 0.5) {
                return entscheidungMensch;
            }
            else return entscheidungRoboter;
        }
    }
}