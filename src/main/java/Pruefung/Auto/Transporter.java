package Pruefung.Auto;

public class Transporter implements Fahrzeug {
    public double kosten(Fahrt fahrt){
        return fahrt.min>=60 ? 0.30*fahrt.km:0.30*fahrt.km+ (fahrt.min-60)*0.25;
    }

}
