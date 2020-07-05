package jp.ac.aiit.pbl;

import org.junit.Test;

import static org.junit.Assert.*;

public class HypocenterParserTest {
    
    @Test
    public void hypocenterParserTest() {
        HypocenterParser hypocenterParser = new HypocenterParser();
    
        //Hypocenter hypocenter = hypocenterParser.parse("11000110101011011111001011000101000101101000000000000 001100101 001100110 001100111 0101100010001110 111110101 1100101 0000001011 1 1011001 111011 111011 0 10110011 111011 111011");
    
        Hypocenter hypocenter = hypocenterParser.parse("1100011010101101111100101100010100010110100000000000000110010100110011000110011101011000100011101111101011100101000000101111011001111011111011010110011111011111011");
        System.out.println(hypocenter);
    }
}