package Pruefung.Mitarbeitende;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static transient HashSet<Mitarbeiter> employees;
    public static void main(String[] args){
        HashSet<Mitarbeiter> hm = new HashSet<>();
        hm.add(new Mitarbeiter("Paul", "er", 333123, 312354860));
        hm.add(new Mitarbeiter("Pualine", "sie", 443124, 1023533120));
        hm.add(new Mitarbeiter("Quetz", "tal", 112311, 12342423));
        saveEmp(hm);
        employees=readEMP();
        employees.forEach(System.out::println);

        Arrays.stream(sortiereEMP(employees)).forEach(System.out::println);

    }

    private static void saveEmp(HashSet<Mitarbeiter> hm) {
        try(    FileOutputStream fos = new FileOutputStream("Mitarbeiter.dat");
                ObjectOutputStream oos= new ObjectOutputStream(fos))
        {
            oos.writeObject(hm);
        }catch (IOException e){e.printStackTrace();}
    }
    private static HashSet<Mitarbeiter> readEMP(){
        HashSet<Mitarbeiter> out = new HashSet<>();
        try(    FileInputStream fis = new FileInputStream("Mitarbeiter.dat");
                ObjectInputStream ois= new ObjectInputStream(fis))
        {
            out = (HashSet<Mitarbeiter>)ois.readObject();
        }catch (IOException e){e.printStackTrace();} catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return out;
    }
    private static Mitarbeiter[] sortiereEMP(HashSet<Mitarbeiter> hm){
        Mitarbeiter[] emp = hm.toArray(new Mitarbeiter[0]);
        Arrays.sort(emp,new VergleichePersonalNummer());
        return emp;
    }
}
