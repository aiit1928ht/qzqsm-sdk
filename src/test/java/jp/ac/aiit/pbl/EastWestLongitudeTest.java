package jp.ac.aiit.pbl;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class EastWestLongitudeTest {
    
    @Test
    public void getEastLongitudeTest() {
        assertThat(EastWestLongitude.EastLongitude, is(EastWestLongitude.getByCode(0)));
    }
    @Test
    public void getWestLongtideTest() {
        assertThat(EastWestLongitude.WestLongitude, is(EastWestLongitude.getByCode(1)));
    }
}