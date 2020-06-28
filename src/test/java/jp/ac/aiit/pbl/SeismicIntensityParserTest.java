package jp.ac.aiit.pbl;

import org.junit.Test;

import static org.junit.Assert.*;

public class SeismicIntensityParserTest {
    
    @Test
    public void seismicIntensityParserTest() {
        SeismicIntensityParser seismicIntensityParser = new SeismicIntensityParser();
        
        SeismicIntensity seismicIntensity = seismicIntensityParser.parse("010100111010110111110010110001010001010000000000000001010001000000001110000001001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100000001111000101001010111010100");
        
        System.out.println(seismicIntensity.toString());
    }
}