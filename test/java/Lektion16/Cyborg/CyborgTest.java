package Lektion16.Cyborg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyborgTest {
    @Test
    public void testeEntscheidung(){
        Mensch Justus = new Mensch();
        Roboter C3 = new Roboter();
        Cyborg R2 = new Cyborg(Justus,C3);
        assertEquals(R2.entscheide(Gefahr.GEFAHR_VORNE),Entscheidung.BREMSEN);
        assertEquals(R2.entscheide(Gefahr.GEFAHR_LINKS),Entscheidung.RECHTS);
        assertEquals(R2.entscheide(Gefahr.GEFAHR_RECHTS),Entscheidung.LINKS);
    }

}