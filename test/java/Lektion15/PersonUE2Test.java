package Lektion15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PersonUE2Test {

    @Test
    public void PersonenTest(){
        PersonUE2[] pers=new PersonUE2[2];
        pers[0]=new PersonUE2.Student();
        pers[1]=new PersonUE2.Professor();
        assertSame(PersonUE2.Student.class, pers[0].getClass());
        assertSame(PersonUE2.Professor.class, pers[1].getClass());
    }

    @Test
    public void TaetigkeitsTest(){

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PersonUE2[] pers=new PersonUE2[100];
        for(int i=0;i<pers.length;i++){
            if(i%2==0)pers[i]=new PersonUE2.Professor();
            else pers[i]=new PersonUE2.Student();
        }

        //geht nicht in eins da Unterschiede beim \n\r sind
        /*
        for (int i = 0; i < 100; i++) {
        outContent.reset();
        pers[i].gibTaetigkeitAus();

        if (i % 2 == 0) Assertions.assertEquals("Der Professor unterrichtet Programmieren.\n", outContent.toString());
        else Assertions.assertEquals("Der Student besucht das Fach Programmieren.\n", outContent.toString());
        }
        * */
        for(int i=0;i<100;i++){
            pers[i].gibTaetigkeitAus();
        }
        String[] lines = outContent.toString().split(System.lineSeparator());
        for (int i = 0; i < lines.length; i++) {
            if (i % 2 == 0) Assertions.assertEquals("Der Professor unterrichtet Programmieren.", lines[i]);
            else Assertions.assertEquals("Der Student besucht das Fach Programmieren.", lines[i]);
        }
    }

}