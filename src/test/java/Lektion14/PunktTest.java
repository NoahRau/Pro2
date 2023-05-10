package Lektion14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PunktTest {


        @Test
        public void testVerschiebePunktValid() {
            Punkt punkt = new Punkt();
            punkt.verschiebePunkt(10, 20);
            Assertions.assertEquals(10, punkt.x);
            Assertions.assertEquals(20, punkt.y);
        }

        @Test
        public void testVerschiebePunktNegativeX() {
            Punkt punkt = new Punkt();
            Assertions.assertThrows(RuntimeException.class, () -> {
                punkt.verschiebePunkt(-10, 20);
            });
        }

        @Test
        public void testVerschiebePunktNegativeY() {
            Punkt punkt = new Punkt();
            Assertions.assertThrows(RuntimeException.class, () -> {
                punkt.verschiebePunkt(10, -20);
            });
        }

        @Test
        public void testVerschiebePunktTooLargeX() {
            Punkt punkt = new Punkt();
            Assertions.assertThrows(RuntimeException.class, () -> {
                punkt.verschiebePunkt(2000, 20);
            });
        }

        @Test
        public void testVerschiebePunktTooLargeY() {
            Punkt punkt = new Punkt();
            Assertions.assertThrows(RuntimeException.class, () -> {
                punkt.verschiebePunkt(10, 2000);
            });
        }



}