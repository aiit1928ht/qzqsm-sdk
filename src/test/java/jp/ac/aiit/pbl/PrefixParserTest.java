package jp.ac.aiit.pbl;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class PrefixParserTest {
    @Test
    public void parseTest(){
        PrefixParser parser = new PrefixParser();

        Prefix prefix = parser.parse("010100111010110111110010110001010001010000000000000001010001000000001110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100000001111000101001010111010100");

        System.out.println(prefix.toString());
    }

}
