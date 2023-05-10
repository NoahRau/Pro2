package Lektion18.toUppercaseWriter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ToUpperCaseWriterTest
{
  ByteArrayOutputStream baos;

  @BeforeEach
  public void prepareTest()
  {
    baos = new ByteArrayOutputStream();
  }
  private ToUpperCaseWriter getToUpperCaseWriter() throws IOException {
    return new ToUpperCaseWriter(new OutputStreamWriter(baos));
  }

  @Test
  public void writeCharTest()
  {
    try (ToUpperCaseWriter writer = getToUpperCaseWriter())
    {
      writer.write('a');
      writer.flush();
      String uppercase = baos.toString();
      assertEquals(uppercase, "A");
    }
    catch (IOException e)
    {
      fail("IOException" + e.getMessage());
    }
  }

  @Test
  public void writeCharTestWithNonChar()
  {
    try (ToUpperCaseWriter writer = getToUpperCaseWriter())
    {
      writer.write('1');
      writer.flush();
      String uppercase = baos.toString();
      assertEquals(uppercase, "1");
    }
    catch (IOException e)
    {
      fail("IOException" + e.getMessage());
    }
  }

  @Test
  public void writeCharTestWithLowerCaseLetters()
  {
    try (ToUpperCaseWriter writer = getToUpperCaseWriter())
    {
      for (int i = 'a'; i <= 'z'; i++) {
        writer.write(i);
      }
      writer.flush();
      String uppercase = baos.toString();
      assertEquals(uppercase, "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    }
    catch (IOException e)
    {
      fail("IOException" + e.getMessage());
    }
  }

  @Test
  public void writeCharTestWithAllASCIIChars()
  {
    try (ToUpperCaseWriter writer = getToUpperCaseWriter())
    {
      for (int i = 32; i < 128; i++) {
        char ch = (char) i;
        if (ch >= 'a' && ch <= 'z') {
          writer.write(Character.toUpperCase(ch));
        } else {
          writer.write(ch);
        }
      }
      writer.flush();
      String uppercase = baos.toString();
      //System.out.println(uppercase);
      assertEquals(uppercase, " !"+"\""+"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ["+"\\"+"]^_`ABCDEFGHIJKLMNOPQRSTUVWXYZ{|}~");
    }

    catch (IOException e)
    {
      fail("IOException" + e.getMessage());
    }
  }

  @AfterEach
  public void cleanUp()
  {
    try
    {
      baos.close();
    }
    catch (IOException e)
    {
      fail("IOException" + e.getMessage());
    }
  }
}