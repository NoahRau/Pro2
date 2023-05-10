package Lektion20.SMS;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    @BeforeEach
    public void init(){
        SMS.main(null);
    }
    @Test
    public void testConversionTable(){
        assertEquals("2", SMS.conversionTable.get('A'));
    }
}
