package jp.ac.aiit.pbl;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class HypocenterParserTest {
    
    @Test
    public void hypocenterParserTest() {
        HypocenterParser hypocenterParser = new HypocenterParser();
        
        Hypocenter hypocenter = hypocenterParser.parse("1100011010101101111100101100010100010110100000000000000110010100110011000110011101011000100011101111101011100101000000101111011001111011111011010110011111011111011");
        System.out.println(hypocenter);
    }
    @Test
    public void parserLatlonTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HypocenterParser hypocenterParser = new HypocenterParser();

        double expected = 179.9997222222222;
        Method method = HypocenterParser.class.getDeclaredMethod("parserLatlon",
                int.class , int.class, int.class);
        method.setAccessible(true);
        double actual = (double)method.invoke(hypocenterParser, 179, 59, 59);
        
        assertEquals(expected, actual, 0);
    }

}