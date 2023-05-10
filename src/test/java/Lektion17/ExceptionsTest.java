package Lektion17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

class ExceptionsTest {
        private Exceptions exceptions = new Exceptions();

        @Test
        public void testNumberFormatException() {
            Assertions.assertThrows(NumberFormatException.class, () -> {
                exceptions.numberformatex();
            });
        }

        @Test
        public void testArrayIndexOutOfBoundsException() {
            Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
                exceptions.arrayIndexOOBEx();
            });
        }

        @Test
        public void testNullPointerException() {
            Assertions.assertThrows(NullPointerException.class, () -> {
                exceptions.nullPointerex();
            });
        }

        @Test
        public void testOutOfMemoryError() {
            Assertions.assertThrows(OutOfMemoryError.class, () -> {
                exceptions.outOfMemoryex();
            });
        }

        @Test
        public void testFileNotFoundException() {
            Assertions.assertThrows(FileNotFoundException.class, () -> {
                exceptions.fileNotfoundEx();
            });
        }

        @Test
        public void testArithmeticException() {
            Assertions.assertThrows(ArithmeticException.class, () -> {
                exceptions.arithmicEx();
            });
        }
    }
