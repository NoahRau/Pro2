package Lektion17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class OutputstreamxTest {
    @Test
    public void outTest() throws IOException {
        int off = 0;
        Outputstreamx raus = new Outputstreamx();
        //Teste byte Length >= 32 Bytes
        byte[] out =new byte[34];
        Assertions.assertThrows(IOException.class,()->raus.write(out,off,out.length));




    }


}