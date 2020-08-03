package jp.ac.aiit.pbl;

import jp.ac.aiit.pbl.disaster.prefix.Prefix;
import jp.ac.aiit.pbl.disaster.prefix.PrefixParser;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class PrefixParserTest {
    @Test
    public void parseTest(){
        PrefixParser parser = new PrefixParser();

        Prefix prefix = parser.parse("1001101010101101111100101100010100010001100000000000001011000011111100100101");

        System.out.println(prefix.toString());
    }

}
