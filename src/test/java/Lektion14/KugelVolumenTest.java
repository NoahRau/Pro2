package Lektion14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KugelVolumenTest {

        @Test
        public void testRadius0() {
            double expected = 0.0;
            double actual = KugelVolumen.berechneKugelvolumen(0.0);
            double delta = 0.0001;
            Assertions.assertEquals(expected, actual, delta);
        }

        @Test
        public void testRadius1() {
            double expected = 4.1888;
            double actual = KugelVolumen.berechneKugelvolumen(1.0);
            double delta = 0.0001;
            Assertions.assertEquals(expected, actual, delta);
        }

        @Test
        public void testRadius5() {
            double expected = 523.5988;
            double actual = KugelVolumen.berechneKugelvolumen(5.0);
            double delta = 0.0001;
            Assertions.assertEquals(expected, actual, delta);
        }

        @Test
        public void testRadiusMinus1() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                KugelVolumen.berechneKugelvolumen(-1.0);
            });
        }
    }