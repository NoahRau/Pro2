package Lektion15;

public class Firma {
    public class Angestellter{
    int grundgehalt;
    double gehaltsfaktor;
    String name;
    String nachname;
    String geburtsdatum;
    int identifikator;
    double gehalt =grundgehalt*gehaltsfaktor;

    public Angestellter(String geburtsdatum, String name, String nachname,int identifikator){
        this.gehaltsfaktor=1.0;
        this.grundgehalt=100;
        this.geburtsdatum=geburtsdatum;
        this.name=name;
        this.nachname=nachname;
        this.identifikator=identifikator;
        this.gehalt =grundgehalt*gehaltsfaktor;
    }


    }

    public class Abteilungsleiter extends Angestellter {
        int grundgehalt;
        double gehaltsfaktor;
        String name;
        String nachname;
        String geburtsdatum;
        int identifikator;
        double gehalt;

        public Abteilungsleiter(String geburtsdatum, String name, String nachname,int identifikator){
            super(geburtsdatum,name,nachname,identifikator);
            this.gehaltsfaktor=2.0;

        }
        public void befoerdern(Angestellter xy){
            xy.gehaltsfaktor+=0.1;
            xy.gehalt=xy.grundgehalt*xy.gehaltsfaktor;
        }
    }
}
