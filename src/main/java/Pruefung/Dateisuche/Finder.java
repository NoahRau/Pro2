package Pruefung.Dateisuche;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Finder {
    public BufferedReader getSystemInAsBufferedReader() {
       InputStreamReader ir = new InputStreamReader(System.in);
            return new BufferedReader(ir);
    }
    public void findStringInFiles(String searchString, String[] filenames)   {
        HashMap<String,Integer> matches = new HashMap<>();

        for(String match:filenames){

            try(FileReader fr = new FileReader(match);
                BufferedReader br =new BufferedReader(fr);
            )
            {   int i=0;
                String zeile = br.readLine();
                while (zeile!=null){
                    if(match.contains(searchString))matches.put(match,i);
                    i++;
                    zeile=br.readLine();
                }

            }catch(IOException e){System.err.println(match+"Konnte nicht gelesen werden");}
            }
        System.out.println(matches);
        }

    public static void main(String[] args)
    {
        Finder finder = new Finder();
        BufferedReader br = finder.getSystemInAsBufferedReader();
        String searchString = null;
        try {
            searchString = br.readLine();
            finder.findStringInFiles(searchString, args);
            br.close();
        } catch (IOException ex) {
            System.out.println("Einlesen fehlgeschlagen.");
        };
    }
}
