package jp.ac.aiit.pbl.disaster.tsunami;

import static org.junit.Assert.*;
import org.junit.Test;

public class TsunamiParserTest {
    
    @Test
    public void tsunamiParserTest(){
        TsunamiParser tsunamiParser = new TsunamiParser();
        Tsunami tsunami = tsunamiParser.parse(
                "110001101010110111110010110001010001011010000000000000011001010011001100011001111111010111111011111100011001001101111110111111000110010011011111101111110001100100" +
                        "1101111110111111000110010011011111101111110001100100");
        
        System.out.println(tsunami);
    }
}
