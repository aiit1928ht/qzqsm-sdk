package jp.ac.aiit.pbl;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SeismicIntensityWarningTest {
    
    @Test
    public void cangetSeismicIntensityLessThan4() {
        assertThat(SeismicIntensityWarning.SeismicIntensityLessThan4, is(SeismicIntensityWarning.getSeismicIntensity(1)));
    }
    @Test
    public void cangetSeismicIntensitySeismicIntensity4() {
        assertThat(SeismicIntensityWarning.SeismicIntensity4, is(SeismicIntensityWarning.getSeismicIntensity(2)));
    }
    @Test
    public void cangetSeismicIntensity5Lower() {
        assertThat(SeismicIntensityWarning.SeismicIntensity5Lower, is(SeismicIntensityWarning.getSeismicIntensity(3)));
    }
    @Test
    public void cangetSeismicIntensityUpper5() {
        assertThat(SeismicIntensityWarning.SeismicIntensityUpper5, is(SeismicIntensityWarning.getSeismicIntensity(4)));
    }
    @Test
    public void cangetSeismicIntensity6Lower() {
        assertThat(SeismicIntensityWarning.SeismicIntensity6Lower, is(SeismicIntensityWarning.getSeismicIntensity(5)));
    }
    @Test
    public void cangetSeismicIntensityUpper6() {
        assertThat(SeismicIntensityWarning.SeismicIntensityUpper6, is(SeismicIntensityWarning.getSeismicIntensity(6)));
    }
    @Test
    public void cangetSeismicIntensity7() {
        assertThat(SeismicIntensityWarning.SeismicIntensity7, is(SeismicIntensityWarning.getSeismicIntensity(7)));
    }
}