package Lektion14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class StreckeTest {


        @Test
        void testKonstruktor() {
            Strecke s = new Strecke(3, 7);
            assertEquals(3, s.a);
            assertEquals(7, s.b);

            s = new Strecke(7, 3);
            assertEquals(3, s.a);
            assertEquals(7, s.b);


            assertThrows(RuntimeException.class,() -> new Strecke(-3,3));
            assertThrows(RuntimeException.class,() -> {new Strecke(3,-3);});
        }

        @Test
        void testUeberschneidung() {
            Strecke s1 = new Strecke(3, 7);
            Strecke s2 = new Strecke(5, 9);
            assertTrue(s1.ueberschneidung(s1, s2));
            assertTrue(s1.ueberschneidung(s2, s1));

            s1 = new Strecke(3, 7);
            s2 = new Strecke(1, 4);
            assertTrue(s1.ueberschneidung(s1, s2));
            assertTrue(s1.ueberschneidung(s2, s1));

            s1 = new Strecke(3, 7);
            s2 = new Strecke(2, 4);
            assertTrue(s1.ueberschneidung(s1, s2));
            assertTrue(s1.ueberschneidung(s2, s1));

            s1 = new Strecke(3, 7);
            s2 = new Strecke(8, 10);
            assertFalse(s1.ueberschneidung(s1, s2));
            assertFalse(s1.ueberschneidung(s2, s1));
        }

        @Test
        void testToString() {
            Strecke s = new Strecke(3, 7);
            assertEquals("3----7", s.toString());

            s = new Strecke(5, 5);
            assertEquals("5", s.toString());
        }

}
