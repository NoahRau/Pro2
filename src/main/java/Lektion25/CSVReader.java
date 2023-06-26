package Lektion25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(args[0])))) {
            boolean xFound = reader.lines()
                    .map(line -> line.split(";"))
                    .anyMatch(columns -> columns.length > 2 && columns[2].equals("x"));

            if (xFound) {
                System.out.println("Die Zeile mit 'x' wurde gefunden.");
            } else {
                System.out.println("Keine Zeile mit 'x' gefunden.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
