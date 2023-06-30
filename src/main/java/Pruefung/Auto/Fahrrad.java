package Pruefung.Auto;

public class Fahrrad implements Fahrzeug {

    public double kosten(Fahrt fahrt){
        return fahrt.min*0.125;
    }

}
