package Lektion17;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;


public class Outputstreamx {
    public void write(byte b[], int off, int len) throws IOException {
        if(len>=32)throw new IOException();
        byte[] out= b ;
        OutputStream raus = new ByteArrayOutputStream();
        raus.write(b);
        System.setOut(new PrintStream(raus));
    }


}
