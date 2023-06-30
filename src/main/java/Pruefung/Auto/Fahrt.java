package Pruefung.Auto;

public class Fahrt {
    public int km; //kostenpflichtige Kilometer
    public int min; //kostenpflichtige Minuten

    public Fahrt(int km ,int min){
        this.km=km;
        this.min=min;
    }

    public int getKm() {
        return km;
    }
    public int getMin() {
        return min;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
