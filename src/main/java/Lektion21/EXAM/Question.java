package Lektion21.EXAM;

import java.util.Scanner;

public class Question {
        String fragenText;
        String antworttxt;

        public static Question toQuestion (String Zeile){
            int i=0;
            try{
            for(char y:Zeile.toCharArray()) {
                if (y == ';') break;
                i++;
            }
            }catch(NullPointerException e){}
            return new Question(Zeile.substring(0,i),Zeile.substring(i+2));
        }
        public Question(String fragenText,String antworttxt){
            this.fragenText=fragenText;
            this.antworttxt=antworttxt;
        }
    public boolean answer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(this.fragenText);
        System.out.println("Geben sie die Antwort ein:\n\r");
        String antwort = scanner.nextLine().toUpperCase();
        if (antwort.equals(this.antworttxt.toUpperCase())) return true;
        return false;}


    public static class MCF extends Question {
            String A;
            String B;
            String C;
            String D;

            public MCF(String fragenText, String antwort,String A,String B,String C,String D) {
                super(fragenText, antwort);
                this.A=A;
                this.B=B;
                this.C=C;
                this.D=D;
            }
            @Override
            public boolean answer(){
                Scanner scanner=new Scanner(System.in);
                System.out.println(this.fragenText);
                System.out.println(A);
                System.out.println(B);
                System.out.println(C);
                System.out.println(D);

                String antwort = scanner.nextLine();
                if(Character.toUpperCase(antwort.charAt(0))==(Character.toUpperCase(this.antworttxt.charAt(0))))return true;
                return false;
            }


        }



    }

