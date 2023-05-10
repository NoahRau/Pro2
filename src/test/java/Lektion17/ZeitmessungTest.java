package Lektion17;

import org.junit.jupiter.api.Test;
import java.io.*;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ZeitmessungTest {
    @Test
    public void testFileCopy() throws IOException {
        // Erzeuge Testdatei
        File testFile = File.createTempFile("test", ".txt");
        FileWriter fw = new FileWriter(testFile);
        fw.write("Dies ist ein Test");
        fw.close();

        // Kopiere Testdatei
        File destFile = File.createTempFile("testCopy", ".txt");
        Zeitmessung zeitmessung = new Zeitmessung();
        zeitmessung.fileCopy(testFile.getPath(), destFile.getPath());

        // Prüfe ob Kopie existiert
        assertTrue(destFile.exists());

        // Prüfe ob Kopie den gleichen Inhalt hat
        FileReader fr = new FileReader(destFile);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        assertEquals("Dies ist ein Test", line);
        br.close();

        // Lösche Testdatei und Kopie
        testFile.delete();
        destFile.delete();
    }

    @Test
    public void testBufferedFileCopy() throws IOException {
        // Erzeuge Testdatei
        File testFile = File.createTempFile("test", ".txt");
        FileWriter fw = new FileWriter(testFile);
        fw.write("Dies ist ein Test");
        fw.close();

        // Kopiere Testdatei
        File destFile = File.createTempFile("testCopy", ".txt");
        Zeitmessung zeitmessung = new Zeitmessung();
        zeitmessung.bufferdFileCopy(testFile.getPath(), destFile.getPath());

        // Prüfe ob Kopie existiert
        assertTrue(destFile.exists());

        // Prüfe ob Kopie den gleichen Inhalt hat
        FileReader fr = new FileReader(destFile);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        assertEquals("Dies ist ein Test", line);
        br.close();

        // Lösche Testdatei und Kopie
        testFile.delete();
        destFile.delete();
    }
}