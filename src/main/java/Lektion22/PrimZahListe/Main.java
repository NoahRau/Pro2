package Lektion22.PrimZahListe;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(9);
        a1.add(7);
        a1.add(5);
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(127);
        a2.add(43242);
        a2.add(86584);
        a2.add(342423);
        a2.add(5747);
        PrimzahlThread p1=new PrimzahlThread(a1);
        PrimzahlThread p2 = new PrimzahlThread(a2);
        p1.start();
        p2.start();
        try{
            p1.join();
            p2.join();
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
        HashMap<Integer,Boolean> res = new HashMap<>();
        p1.primZahlListe.forEach((key,value)->res.merge(key,value,(v1,v2)->true));
        p2.primZahlListe.forEach((key,value)->res.merge(key,value,(v1,v2)->true));
        System.out.println(res);
    }
    public static String print(HashMap<Integer,Boolean> a){
        StringBuilder sb = new StringBuilder();
        a.forEach((v1,v2)->sb.append(v1+" -> "+v2+"\n"));
        return sb.toString();
    }
}
