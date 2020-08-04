package jp.ac.aiit.pbl.disaster.seismicIntensity;

import jp.ac.aiit.pbl.disaster.seismicIntensity.SeismicIntensity;
import jp.ac.aiit.pbl.disaster.seismicIntensity.SeismicIntensityParser;
import org.junit.Test;

/**
 * This Class is SeismicIntensity Parser Test.
 * To test that the parameter values ​​are properly parsed or not, according to the definition.
 */

public class SeismicIntensityParserTest {
    
    @Test
    public void seismicIntensityParserTest() {
        SeismicIntensityParser seismicIntensityParser = new SeismicIntensityParser();
        SeismicIntensity seismicIntensity = seismicIntensityParser.parse("110001101010110111110010110001010001011010000000000000101100010001110101010110001000111111001011000101111100000101100101110111000010110011000001101011011000001100000000101100111110100000010100001000000010000000000");
        
        System.out.println(seismicIntensity.toString());
    }
}