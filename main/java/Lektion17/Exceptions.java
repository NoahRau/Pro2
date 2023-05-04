package Lektion17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exceptions {
    //NumberFormatException
    //b) ArrayIndexOutOfBoundsException
    //c) NullPointerException
    //d) OutOfMemoryError
    //e) FileNotFoundException
    //f) ArithmeticException
    public void numberformatex(){
        String s = "abc123";
        int i = Integer.parseInt(s);
    }
    public void arrayIndexOOBEx(){
        int[] i = new int[1];
        i[2]= 13;
    }
    public void nullPointerex(){
        String s = null;
        s.length();
    }
    public void outOfMemoryex(){
        List<Integer> list = new ArrayList<>();
        while (true) {
            list.add(1);
        }
    }
    public void fileNotfoundEx() throws FileNotFoundException {
        File file = new File("Non-existing-File.txt");
        Scanner scanner = new Scanner(file);
    }
    public void arithmicEx(){
        double f = 1/0;
    }

}
