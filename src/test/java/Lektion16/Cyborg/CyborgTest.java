package Lektion16.Cyborg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class CyborgTest {
    @Test
    public void testEntscheide() {
        // Erstelle Mock-Objekte für die Mensch- und Roboter-Klassen
        Mensch menschMock = mock();
        Roboter roboterMock = mock();

        // Erstelle ein Spy-Objekt für den Cyborg
        Cyborg cyborg = spy(new Cyborg(menschMock, roboterMock));

        // Definiere das Verhalten der Mock-Objekte
        when(menschMock.entscheide(Gefahr.GEFAHR_LINKS)).thenReturn(Entscheidung.LINKS);
        when(roboterMock.entscheide(Gefahr.GEFAHR_LINKS)).thenReturn(Entscheidung.RECHTS);
        when(cyborg.zufallszahl()).thenReturn(0.4);

        // Rufe die Methode auf dem Spy-Objekt auf
        Entscheidung entscheidung = cyborg.entscheide(Gefahr.GEFAHR_LINKS);

        // Überprüfe das Ergebnis
        assertEquals(Entscheidung.LINKS, entscheidung);

        //Roboter entscheidet

        when(cyborg.zufallszahl()).thenReturn(0.6);

        // Rufe die Methode auf dem Spy-Objekt auf
         entscheidung = cyborg.entscheide(Gefahr.GEFAHR_LINKS);

        // Überprüfe das Ergebnis
        assertEquals(Entscheidung.RECHTS, entscheidung);
    }

}