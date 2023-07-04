package Pruefung.Morsen;

import java.util.HashMap;

public class Morse {
    public static String[][] tabelle = {
            { "A", ".−"},
            { "B", "−..."},
            { "C", "−.-."},
            { "D", "-.."},
            { "E", "."},
            { "F", "..-."},
            { "G", "--."},
            { "H", "...."},
            { "I", ".."},
            { "J", ".---"},
            { "K", "_._"},
            { "L", ".-.."},
            { "M", "--"},
            { "N", "-."},
            { "O", "---"},
            { "P", ".--."},
            { "Q", "--.-"},
            { "R", ".-."},
            { "S", "..."},
            { "T", "-"},
            { "U", "..-"},
            { "V", "...-"},
            { "W", ".--"},
            { "X", "-..-"},
            { "Y", "-.--"},
            { "Z", "--.."}
    }; // end tabelle
    public HashMap<String,String> getMorseCodeMap(String[][] table){
        HashMap<String,String> out =new HashMap<>();
        for(int i=0;i<table.length;i++){
            out.put(table[i][0],table[i][1]);
        }
        return out;
    }
    public String zeichenketteToMorse(String s){
        HashMap<String,String> x= getMorseCodeMap(tabelle);
        String out= "";
        for(int i=0;i<s.length();i++){
            String ch= String.valueOf(Character.toUpperCase(s.charAt(i)));
            out+=(x.get(ch));
            out+=" ";
        }
        return out;
    }
public static void main(String[] args){
        Morse m = new Morse();
        System.out.println( m.zeichenketteToMorse("Klausurerfolg"));
}

}
