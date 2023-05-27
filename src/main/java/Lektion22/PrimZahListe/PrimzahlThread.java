package Lektion22.PrimZahListe;

import java.util.HashMap;
import java.util.List;

public class PrimzahlThread extends Thread {

        List<Integer> zahlZumTesten;
        HashMap<Integer,Boolean> primZahlListe=new HashMap<>();

        public PrimzahlThread(List<Integer> zahlZumTesten) {
            this.zahlZumTesten=zahlZumTesten;

        }

        public boolean testeObPrimzahl(int nr) {
            if(nr<2)return true;
         for (int i =2;nr>i;i++){
             if(nr%i==0)return false;
         }
         return true;
        }

        @Override
        public void run() {

            for(int i: zahlZumTesten){
                primZahlListe.put(i,testeObPrimzahl(i));
            }


        }
    }