package Lektion15;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class QuizTest {
    @Test
    public void testMCFAnswer() {
        Quiz.MCF mcf = new Quiz.MCF("What is 1 + 1?", "B", "A) 3", "B) 2", "C) 4", "D) 5");

        // Test correct answer
        ByteArrayInputStream in = new ByteArrayInputStream("B\n".getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Assertions.assertTrue(mcf.answer());

        // Test incorrect answer
        in = new ByteArrayInputStream("A\n".getBytes());
        System.setIn(in);
        outContent.reset();
        Assertions.assertFalse(mcf.answer());
    }

    @Test
    public void testTXTFAnswer() {
        Quiz.TXTF txtf = new Quiz.TXTF("What is the capital of Germany?", "Berlin");

        // Test correct answer
        ByteArrayInputStream in = new ByteArrayInputStream("Berlin\n".getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Assertions.assertTrue(txtf.answer());

        // Test incorrect answer
        in = new ByteArrayInputStream("Paris\n".getBytes());
        System.setIn(in);
        outContent.reset();
        Assertions.assertFalse(txtf.answer());
    }
}
