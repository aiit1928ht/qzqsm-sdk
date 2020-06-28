package jp.ac.aiit.pbl;

import org.junit.Test;

import static org.junit.Assert.*;

public class SeismicIntensityParserTest {
    
    @Test
    public void seismicIntensityParserTest() {
        SeismicIntensityParser seismicIntensityParser = new SeismicIntensityParser();
        
        SeismicIntensity seismicIntensity = seismicIntensityParser.parse("110001101010110111110010110001010001011010000000000000101100010001110100010110001100111111001011000111110100000101100101110111000010110011000001110001011001100100000000101100111110100000010110100000000010000000000000000100001010010110010010100100010000");
        
        System.out.println(seismicIntensity.toString());
    }
}