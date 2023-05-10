package Lektion16.schach.schach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DameTest {
    @Test
    public void testGibErlaubteFelder() {
        Dame dame = new Dame(4, 5);

        Brett expected = new Brett();

        expected.markiereFeld(4, 1); // Turm-ähnlicher Zug
        expected.markiereFeld(4, 2);
        expected.markiereFeld(4, 3);
        expected.markiereFeld(4, 4);
        expected.markiereFeld(4, 5);
        expected.markiereFeld(4, 6);
        expected.markiereFeld(4, 7);
        expected.markiereFeld(4, 8);
        expected.markiereFeld(1, 5);
        expected.markiereFeld(2, 5);
        expected.markiereFeld(3, 5);
        expected.markiereFeld(5, 5);
        expected.markiereFeld(6, 5);
        expected.markiereFeld(7, 5);
        expected.markiereFeld(8, 5);

        // Läufer-ähnlicher Zug
        expected.markiereFeld(3, 4);
        expected.markiereFeld(2, 3);
        expected.markiereFeld(1, 2);


        expected.markiereFeld(5, 6);
        expected.markiereFeld(6, 7);
        expected.markiereFeld(7, 8);

        expected.markiereFeld(3, 6);
        expected.markiereFeld(2, 7);
        expected.markiereFeld(1, 8);

        expected.markiereFeld(5, 4);
        expected.markiereFeld(6, 3);
        expected.markiereFeld(7, 2);
        expected.markiereFeld(8, 1);

        Brett actual = dame.gibErlaubteFelder();

        assertArrayEquals(expected.brett, actual.brett);
    }

}