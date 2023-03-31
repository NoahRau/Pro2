package Lektion16.Cyborg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class MenschTest {

    @Test
    void testEntscheide() {
        // Mock-Objekt erstellen
        Mensch menschMock = spy(Mensch.class);

        // Wenn getUnentschieden() aufgerufen wird, wird immer 0.5 zurückgegeben
        doReturn(0.5).when(menschMock).getUnentschieden();

        assertEquals(Entscheidung.LINKS, menschMock.entscheide(Gefahr.GEFAHR_RECHTS));
        assertEquals(Entscheidung.RECHTS, menschMock.entscheide(Gefahr.GEFAHR_LINKS));
        assertEquals(Entscheidung.BREMSEN, menschMock.entscheide(Gefahr.GEFAHR_VORNE));

        // Wenn getUnentschieden() aufgerufen wird, wird immer 0.2 zurückgegeben
        doReturn(0.2).when(menschMock).getUnentschieden();
        assertEquals(Entscheidung.UNENTSCHIEDEN, menschMock.entscheide(Gefahr.GEFAHR_VORNE));
        assertEquals(Entscheidung.UNENTSCHIEDEN, menschMock.entscheide(Gefahr.GEFAHR_LINKS));
        assertEquals(Entscheidung.UNENTSCHIEDEN, menschMock.entscheide(Gefahr.GEFAHR_RECHTS));

    }



}