package jp.ac.aiit.pbl;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NorthSouthLatitudeTest {
    
    @Test
    public void getSouthLatitudeTest() {
        assertThat(NorthSouthLatitude.NorthLatitude, is(NorthSouthLatitude.getByCode(0)));
    }
    @Test
    public void getNorthLalitudeTest() {
        assertThat(NorthSouthLatitude.SouthLatitude, is(NorthSouthLatitude.getByCode(1)));
    }
}