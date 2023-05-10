package Lektion16.muenzautomat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeCalculatorTest {
    @Test
    public void testGetChange() {
        CoinChangeCalculator coin= new CoinChangeCalculator();
        int euros = 8;
        int cent = 67;
        int[] expected = {0, 1, 1, 1, 0, 1, 0, 4};
        int[] actual = coin.getChange(euros, cent);
        assertArrayEquals(expected, actual);
    }
}