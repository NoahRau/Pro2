package Lektion15;

import java.util.Scanner;

public class Quiz {
    String fragenText;
    String antworttxt;
    public Quiz(String fragenText,String antworttxt){
        this.fragenText=fragenText;
        this.antworttxt=antworttxt;
    }
    public boolean answer(){
        return true;
    }
    public static class MCF extends Quiz{
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
    //Kann auch in die Klasse Quiz geschrieben werden
    public static class TXTF extends Quiz{
        public TXTF(String fragenText, String antwort) {
            super(fragenText, antwort);
        }
        @Override
        public boolean answer(){
                Scanner scanner = new Scanner(System.in);
                System.out.println(this.fragenText);
                System.out.println("Geben sie die Antwort ein:\n\r");
                String antwort = scanner.nextLine().toUpperCase();
                if (antwort.equals(this.antworttxt.toUpperCase())) return true;
                return false;


        }
    }

    public static void main(String[] args){
        Quiz[] quizzes = new Quiz[4];
        quizzes[0]= new MCF("What is 1 + 1?", "B", "A) 3", "B) 2", "C) 4", "D) 5");
        quizzes[1]= new MCF("What is a Pet", "D", "A) Lion", "B) Tiger", "C) Elephant", "D) Cat");
        quizzes[2]= new TXTF("What is the answer to Life","42");
        quizzes[3]= new TXTF("What's our galaxy called?","Milkyway");
        int points=0;
        for(int i=0;i< quizzes.length;i++){
            if(quizzes[i].answer())points++;

        }
        System.out.println("Sie haben "+points+"/"+quizzes.length+" Punkte erreicht");
    }

}
