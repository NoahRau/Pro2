package Lektion21;

public class Naehrstoffangaben {
    String portionsGroesse;
    int anzahlportionen;
    String eiweiss;
    String fett;
    String kohlenhydrate;
    String natrium;
    public Naehrstoffangaben(String portionsGroesse , int anzahlportionen){
        this.portionsGroesse=portionsGroesse;
        this.anzahlportionen=anzahlportionen;
    }
    public Naehrstoffangaben(String portionsGroesse , int anzahlportionen,String eiweiss,String fett,String kohlenhydrate,String natrium){

        this.portionsGroesse=portionsGroesse;
        this.anzahlportionen=anzahlportionen;
        this.natrium=natrium;
        this.kohlenhydrate=kohlenhydrate;
        this.fett=fett;
        this.eiweiss=eiweiss;
    }
    public Naehrstoffangaben withEiweiss(String eiweiss){this.eiweiss=eiweiss;return this;}
    public Naehrstoffangaben withFett(String fett){this.fett=fett;return this;}
    public Naehrstoffangaben withKohlenhydrate(String kohlenhydrate){this.kohlenhydrate=kohlenhydrate;return this;}
    public Naehrstoffangaben withNatrium(String natrium){this.natrium=natrium;return this;}
    public Naehrstoffangaben builder(){return new Naehrstoffangaben(portionsGroesse,anzahlportionen,eiweiss,fett,kohlenhydrate,natrium);}

    @Override
    public String toString(){
        return "pG="+portionsGroesse+"AP="+anzahlportionen+" Na="+natrium+" F="+fett+" K="+kohlenhydrate+" E="+eiweiss;
    }

    public static void main(String[] args){
        Naehrstoffangaben n=new Naehrstoffangaben("100g",3).withEiweiss("12g").withFett("2g").withKohlenhydrate("30g");
        System.out.println(n);
    }
}
