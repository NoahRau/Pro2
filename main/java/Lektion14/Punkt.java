package Lektion14;

public class Punkt {
    int x;
    int y;
    public void verschiebePunkt(int zielX, int zielY) {
        if(zielX>=1920||zielY>=1080||zielY<0||zielX<0){
            throw new RuntimeException();
        }

        x = zielX;
        y = zielY;
    }
}
