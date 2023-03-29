package Lektion14;

public class Person {
    int pzl;
    int hausNummer;
    String ort;
    String strasse;
    String name;
    String nachname;
    public Person( int pzl, int hausNummer, String ort, String strasse, String name, String nachname){

        //check Uppercase
        if(!(Character.isUpperCase(name.charAt(0))&&Character.isUpperCase(strasse.charAt(0))&&Character.isUpperCase(ort.charAt(0)))){
            throw new RuntimeException("Ort,Name & Strassennamen müssen mit einem Grossbuchstaben beginnen!");
        }
        if(hausNummer<=0)throw new RuntimeException("Hausnummer muss eine Ziffer groesser als 0 sein!");

        this.pzl=pzl;
        this.hausNummer=hausNummer;
        this.ort=ort;
        this.name=name;
        this.nachname=nachname;
        this.strasse=strasse;


    }

}
