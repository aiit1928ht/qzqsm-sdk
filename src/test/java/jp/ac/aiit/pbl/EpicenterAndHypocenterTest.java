package jp.ac.aiit.pbl;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class EpicenterAndHypocenterTest {
    
    @Test
    public void canGetHokkaidoRegion() {
        assertThat(EpicenterAndHypocenter.HokkaidoRegion, is(EpicenterAndHypocenter.getRegionName(11)));
    }
    @Test
    public void canGetTohokuRegion() {
        assertThat(EpicenterAndHypocenter.TohokuRegion, is(EpicenterAndHypocenter.getRegionName(12)));
    }
    @Test
    public void canGetHokurikuRegion() {
        assertThat(EpicenterAndHypocenter.HokurikuRegion, is(EpicenterAndHypocenter.getRegionName(13)));
    }
    @Test
    public void canGetKantoKoshinRegion() {
        assertThat(EpicenterAndHypocenter.KantoKoshinRegion, is(EpicenterAndHypocenter.getRegionName(14)));
    }
    @Test
    public void canGetOgasawaraRegion() {
        assertThat(EpicenterAndHypocenter.OgasawaraRegion, is(EpicenterAndHypocenter.getRegionName(15)));
    }
    @Test
    public void canGetTokaiRegion() {
        assertThat(EpicenterAndHypocenter.TokaiRegion, is(EpicenterAndHypocenter.getRegionName(16)));
    }
    @Test
    public void canGetKinkiRegion() {
        assertThat(EpicenterAndHypocenter.KinkiRegion, is(EpicenterAndHypocenter.getRegionName(17)));
    }
    @Test
    public void canGetChugokuRegion() {
        assertThat(EpicenterAndHypocenter.ChugokuRegion, is(EpicenterAndHypocenter.getRegionName(18)));
    }
    @Test
    public void canGetShikokuRegion() {
        assertThat(EpicenterAndHypocenter.ShikokuRegion, is(EpicenterAndHypocenter.getRegionName(19)));
    }
    @Test
    public void canGetKyushuRegion() {
        assertThat(EpicenterAndHypocenter.KyushuRegion, is(EpicenterAndHypocenter.getRegionName(20)));
    }
    @Test
    public void canGetOkinawaRegion() {
        assertThat(EpicenterAndHypocenter.OkinawaRegion, is(EpicenterAndHypocenter.getRegionName(21)));
    }
    
}