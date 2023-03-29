package Lektion14;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PersonTest {

        @Test
        public void testPersonValid() {
            Person person = new Person(12345, 1, "Berlin", "Musterstraße", "Max", "Mustermann");
            Assertions.assertEquals(12345, person.pzl);
            Assertions.assertEquals(1, person.hausNummer);
            Assertions.assertEquals("Berlin", person.ort);
            Assertions.assertEquals("Musterstraße", person.strasse);
            Assertions.assertEquals("Max", person.name);
            Assertions.assertEquals("Mustermann", person.nachname);
        }

        @Test
        public void testPersonInvalidUppercase() {
            Assertions.assertThrows(RuntimeException.class, () -> {
                new Person(12345, 1, "berlin", "musterstraße", "max", "mustermann");
            });
        }

        @Test
        public void testPersonInvalidHausnummer() {
            Assertions.assertThrows(RuntimeException.class, () -> {
                new Person(12345, 0, "Berlin", "Musterstraße", "Max", "Mustermann");
            });
        }



}