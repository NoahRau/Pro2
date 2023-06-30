package Pruefung.Auto;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public class Umsatzberechner {
    double Umsatz;
    HashMap<Fahrzeug,Fahrt> Fuhrpark ;
    public Umsatzberechner(HashMap<Fahrzeug,Fahrt> Fuhrpark){
        this.Fuhrpark=Fuhrpark;
    }
    public void berechneUmsatz(){
        Fuhrpark.forEach((key,value)->Umsatz+=key.kosten(value));
    }
    public double berechneEUmsatz(){
        AtomicReference<Double> EUmsatz = new AtomicReference<>(0.0);
        HashMap<Fahrzeug,Fahrt> EFuhrpark=new HashMap<>();
        Fuhrpark.forEach((key,value)->{
            if(key instanceof Elektro) EFuhrpark.put(key,value);
        });
        EFuhrpark.forEach((key,value)-> EUmsatz.updateAndGet(v -> (double) (v + key.kosten(value))));
        return EUmsatz.get();

    }

    public static void main(String[] args) {
        EBike e = new EBike();
        System.out.println(e instanceof Elektro ? "a" :"b");
    }
}
