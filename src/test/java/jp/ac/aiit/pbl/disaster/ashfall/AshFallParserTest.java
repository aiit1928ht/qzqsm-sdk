package jp.ac.aiit.pbl.disaster.ashfall;


import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AshFallParserTest {
    @Test
    public void parseTest() {
        AshFallParser parser = new AshFallParser();
        AshFalll ashFalll = parser.parse("0101001110101101111100101100010100010100000000000000010100010000000010000111000011000101000000101001010110111000001010000001010010101101110000010100000010100101011011100000101000000101001010110111000111000101001010111010100");
        System.out.println(ashFalll.toString());
    }

}
