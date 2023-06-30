package Pruefung.Auto;

public class Roller implements Fahrzeug {
    public Roller(){

    }
    public double kosten(Fahrt fahrt){
        return 3+fahrt.km*0.15;
    }
}
