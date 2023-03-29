package Lektion15;

public abstract class  PersonUE2 {
    String taetigkeit;
    public PersonUE2(String taetigkeit){
        this.taetigkeit=taetigkeit;
    }

    public void gibTaetigkeitAus(){
        if(this.taetigkeit.equals("Student"))System.out.println("Der Student besucht das Fach Programmieren.");
        else if (this.taetigkeit.equals("Professor"))System.out.println("Der Professor unterrichtet Programmieren.");
    }


    public static class Student extends PersonUE2{
        public Student(){
            super("Student");
        }
    }
    public static class Professor extends PersonUE2{
        public Professor(){
            super("Professor");
        }
    }
}
