package Pruefung.Auto;

public class EBike implements Fahrzeug, Elektro {

    public double kosten(Fahrt fahrt) {
        return fahrt.min * 0.125;
    }

    @Override
    public void kehrezurLadestationzurueck() {

    }
}
