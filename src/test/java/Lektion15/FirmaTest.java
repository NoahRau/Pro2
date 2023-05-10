package Lektion15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FirmaTest {
    @Test
    public void testAngestellter() {
        Firma firma = new Firma();
        Firma.Angestellter angestellter = firma.new Angestellter("01.01.1990", "Max", "Mustermann", 1);
        Assertions.assertEquals(100.0, angestellter.gehalt, 0.001);
    }

    @Test
    public void testAbteilungsleiter() {
        Firma firma = new Firma();
        Firma.Abteilungsleiter abteilungsleiter = firma.new Abteilungsleiter("01.01.1980", "Anna", "Musterfrau", 2);
        Assertions.assertEquals(200.0, abteilungsleiter.gehalt, 0.001);
    }
    @Test
    public void testBefoerdern(){
        Firma firma =new Firma();
        Firma.Abteilungsleiter abteilungsleiter = firma.new Abteilungsleiter("01.01.1980", "Anna", "Musterfrau", 2);
        Firma.Angestellter angestellter = firma.new Angestellter("01.01.1990", "Max", "Mustermann", 1);
        abteilungsleiter.befoerdern(angestellter);
        Assertions.assertEquals(110.0,angestellter.gehalt,0.001);
    }
}