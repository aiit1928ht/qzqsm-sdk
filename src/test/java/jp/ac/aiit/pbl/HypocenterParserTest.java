package jp.ac.aiit.pbl;

import jp.ac.aiit.pbl.disaster.hypocenter.Hypocenter;
import jp.ac.aiit.pbl.disaster.hypocenter.HypocenterParser;
import org.junit.Test;

public class HypocenterParserTest {
    
    @Test
    public void hypocenterParserTest() {
        HypocenterParser hypocenterParser = new HypocenterParser();
        
        Hypocenter hypocenter = hypocenterParser.parse("1100011010101101111100101100010100010110100000000000000110010100110011000110011101011000100011101111101011100101000000101111011001111011111011010110011111011111011");
        System.out.println(hypocenter);
        
    }
}