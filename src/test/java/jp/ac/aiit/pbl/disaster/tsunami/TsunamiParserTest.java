package jp.ac.aiit.pbl.disaster.tsunami;

import static org.junit.Assert.*;
import org.junit.Test;

public class TsunamiParserTest {
    
    @Test
    public void tsunamiParserTest(){
        TsunamiParser tsunamiParser = new TsunamiParser();
        Tsunami tsunami = tsunamiParser.parse(
                "1100011010101101111100101100010100010110100000000000000110010100110011000110011111110101111110111111000110010011011111101111110001100100110111111011111100011001001101111110111111000110010011011111101111110001100100");
        
        System.out.println(tsunami);
    }
}
