package Lektion21.EXAM;

import java.io.*;
import java.util.ArrayList;

public class Quiz {
    ArrayList<Question> fragen;
    public Quiz(){
        fragen=new ArrayList<>();
    }

    public void build() {
        try(Reader r = new FileReader("questions.csv");
            BufferedReader br = new BufferedReader(r);){
            int i=0;
            while (true)
            {
                String y= br.readLine();
                if(y==null)break;
                fragen.add(i, Question.toQuestion(y));
                i++;
            }
            } catch(FileNotFoundException e){
            System.err.println("Datei nicht gefunden!");
            e.printStackTrace();
        }catch (IOException e){System.err.println("Fehler beim Einlesen");
        e.printStackTrace();}
    }
    public static void main(String[] args){
        Quiz q= new Quiz();
        q.build();
        ArrayList<Boolean> res = new ArrayList<Boolean>();
        for(int i=0;i<q.fragen.size();i++){
            res.add(q.fragen.get(i).answer());
        }
    }
}
