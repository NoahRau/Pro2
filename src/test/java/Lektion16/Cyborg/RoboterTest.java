package Lektion16.Cyborg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboterTest{

    @Test
    public void testEntscheideLinks()  {
        Roboter roboter = new Roboter();
        Entscheidung entscheidung = roboter.entscheide(Gefahr.GEFAHR_LINKS);
        assertEquals(Entscheidung.RECHTS, entscheidung);
    }

    @Test
    public void testEntscheideRechts() {
        Roboter roboter = new Roboter();
        Entscheidung entscheidung = roboter.entscheide(Gefahr.GEFAHR_RECHTS);
        assertEquals(Entscheidung.LINKS, entscheidung);
    }

    @Test
    public void testEntscheideVorne() {
        Roboter roboter = new Roboter();
        Entscheidung entscheidung = roboter.entscheide(Gefahr.GEFAHR_VORNE);
        assertEquals(Entscheidung.BREMSEN, entscheidung);
    }

}