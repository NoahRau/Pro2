package Lektion18;

import java.io.*;

public class Studiengangsplitter {

    public static class MatrikelnummerException extends Exception {
        Exception MatrikelnummerException = new Exception("Keine gültige Matrikelnummer");
    }


    public  void splitStudiengaenge(String dateiname) throws MatrikelnummerException
    {

        try {
            String out = "";
            BufferedReader br = new BufferedReader(new FileReader(dateiname));

            do {
                String in =br.readLine();
                if(in == null)break;
                int line = Integer.parseInt(in);
                if (line >= 5000000 && line <= 5099999) out = "WInfNr.txt";
                if (line >= 5100000 && line <= 5199999) out = "InfNr.txt";
                if (line >= 6100000 && line <= 6199999) out = "ECNr.txt";
                if (out.equals("")) {
                    br.close();
                    throw new MatrikelnummerException();
                }
                FileWriter fw = new FileWriter(out,true);
                fw.write(line+"\r");
                fw.flush();
                out="";
            }while(true);

        }catch(Exception e){
            e.printStackTrace();}
    }
    public static void main(String[] args) throws MatrikelnummerException {
        Studiengangsplitter s = new Studiengangsplitter();
        s.splitStudiengaenge("MatrNr.txt");
    }
}
