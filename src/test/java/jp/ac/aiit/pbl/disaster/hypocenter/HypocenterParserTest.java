package jp.ac.aiit.pbl.disaster.hypocenter;

import jp.ac.aiit.pbl.disaster.hypocenter.Hypocenter;
import jp.ac.aiit.pbl.disaster.hypocenter.HypocenterParser;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HypocenterParserTest {
    
    @Test
    public void hypocenterParserTest() {
        HypocenterParser hypocenterParser = new HypocenterParser();
    
        Hypocenter hypocenter = hypocenterParser.parse("1100011010101101111100101100010100010110100000000000000110010100110011000110011101011000100011101111101011100101000000101111011001111011111011010110011111011111011");
        System.out.println(hypocenter);
    }
    
    /**
     * lad (degree:89, minute:59, second:59)
     * lon (degree:179, minute:59, second:59)
     */
    @Test
    public void inCaseOfMaxValueOfLatLon(){
        HypocenterParser hypocenterParser = new HypocenterParser();
        Hypocenter hypocenter = hypocenterParser.parse("1100011010101101111100101100010100010110100000000000000110010100110011000110011101011000100011101111101011100101000000101111011001111011111011010110011111011111011");
    
        assertThat(hypocenter.getLatitude(), is(89.99972222222222));
        assertThat(hypocenter.getLongitude(), is(179.9997222222222));
    }
    
    /**
     * lad (degree:0, minute:0, second:0)
     * lon (degree:0, minute:0, second:0)
     */
    @Test
    public void inCaseOfMinValueOfLatLon(){
        HypocenterParser hypocenterParser = new HypocenterParser();
        Hypocenter hypocenter = hypocenterParser.parse("1100011010101101111100101100010100010110100000000000000110010100110011000110011101011000100011101111101011100101000000101110000000000000000000000000000000000000000");
        
        assertThat(hypocenter.getLatitude(), is(0.0));
        assertThat(hypocenter.getLongitude(), is(0.0));
    }
    
    /**
     * lad (degree:30, minute:30, second:30)
     * lon (degree:30, minute:30, second:30)
     */
    @Test
    public void inCaseOfMidValueLatLon(){
        HypocenterParser hypocenterParser = new HypocenterParser();
        Hypocenter hypocenter = hypocenterParser.parse("1100011010101101111100101100010100010110100000000000000110010100110011000110011101011000100011100000000000001000000000101110011110011110011110000011110011110011110");
        
        assertThat(hypocenter.getLatitude(), is(30.5083333333333333));
        assertThat(hypocenter.getLongitude(), is(30.508333333333333));
    }
    /**
     * Magnitude (101 if more than 10.0, and 127 if unknown.
     * 126 if more than 8.0 under the
     * condition that moment magnitude is unknown.
     * Return the decimal point.)
     */
    @Test
    public void inCaseOfMagnitudeUnknown(){
        HypocenterParser hypocenterParser = new HypocenterParser();
        Hypocenter hypocenter = hypocenterParser.parse("1100011010101101111100101100010100010110100000000000000110010100110011000110011101011000100011101111101010000000000000101111011010011110011110010110100011110011110");
        
        assertThat(hypocenter.getMagnitude(), is(127.0));
    }
    /**
     * Magnitude (101 if more than 10.0, and 127 if unknown.
     * 126 if more than 8.0 under the
     * condition that moment magnitude is unknown.
     * Return the decimal point.)
     */
    @Test
    public void inCaseOfMagnitudeUnknownOver10(){
        HypocenterParser hypocenterParser = new HypocenterParser();
        Hypocenter hypocenter = hypocenterParser.parse("1100011010101101111100101100010100010110100000000000000110010100110011000110011101011000100011100000000000001010000000101110011110011110011110000011110011110011110");
        
        assertThat(hypocenter.getMagnitude(), is(101.0));
        assertThat(hypocenter.getDepthOfHypocenter(), is(0));
    }
    /**
     * Magnitude (101 if more than 10.0, and 127 if unknown.
     * 126 if more than 8.0 under the
     * condition that moment magnitude is unknown.
     * Return the decimal point.)
     */
    @Test
    public void inCaseOfMagnitudeUnknownOver8(){
        HypocenterParser hypocenterParser = new HypocenterParser();
        Hypocenter hypocenter = hypocenterParser.parse("1100011010101101111100101100010100010110100000000000000110010100110011000110011101011000100011101111101010001000011111010110011110011110011110000011110011110011110");
  
        assertThat(hypocenter.getMagnitude(), is(126.0));
    }
    /**
     * Magnitude (Return the magnitude that occurred,
     * other than special conditions.
     * Return the decimal point.)
     */
    @Test
    public void inCaseOfMagnitude5(){
        HypocenterParser hypocenterParser = new HypocenterParser();
        Hypocenter hypocenter = hypocenterParser.parse("1100011010101101111100101100010100010110100000000000000110010100110011000110011101011000100011101111101010000101011111010110011110011110011110000011110011110011110");
        
        assertThat(hypocenter.getMagnitude(), is(0.5));
    }
    
    @Test
    public void hypocenterDigitTest(){
        HypocenterParser hypocenterParser = new HypocenterParser();
        Hypocenter hypocenter = hypocenterParser.parse("1100011010101101111100101100010100010110100000000000000110010100110011000110011101011000100011100000000000001010000000101110011110011110011110000011110011110011110");
        
        assertThat(hypocenter.getDepthOfHypocenter(), is(0));
        assertThat(hypocenter.getMagnitude(), is(101.0));
        assertThat(hypocenter.getNotifications().size(), is(3));
        assertThat(hypocenter.getSeismicEpicenter().getCode(), is(11));
        assertThat(hypocenter.isNorthLatitude(), is(false));
        assertThat(hypocenter.getLatitude(), is(30.508333333333333));
        assertThat(hypocenter.isEastLongitude(), is(true));
        assertThat(hypocenter.getLongitude(), is(30.508333333333333));
    }
}