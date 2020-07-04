package jp.ac.aiit.pbl;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class EpicenterTest {
    
    @Test
    public void canGetHokkaidoRegion() {
        assertThat(Epicenter.HokkaidoRegion, is(Epicenter.getRegionName(11)));
    }
    @Test
    public void canGetTohokuRegion() {
        assertThat(Epicenter.TohokuRegion, is(Epicenter.getRegionName(12)));
    }
    @Test
    public void canGetHokurikuRegion() {
        assertThat(Epicenter.HokurikuRegion, is(Epicenter.getRegionName(13)));
    }
    @Test
    public void canGetKantoKoshinRegion() {
        assertThat(Epicenter.KantoKoshinRegion, is(Epicenter.getRegionName(14)));
    }
    @Test
    public void canGetOgasawaraRegion() {
        assertThat(Epicenter.OgasawaraRegion, is(Epicenter.getRegionName(15)));
    }
    @Test
    public void canGetTokaiRegion() {
        assertThat(Epicenter.TokaiRegion, is(Epicenter.getRegionName(16)));
    }
    @Test
    public void canGetKinkiRegion() {
        assertThat(Epicenter.KinkiRegion, is(Epicenter.getRegionName(17)));
    }
    @Test
    public void canGetChugokuRegion() {
        assertThat(Epicenter.ChugokuRegion, is(Epicenter.getRegionName(18)));
    }
    @Test
    public void canGetShikokuRegion() {
        assertThat(Epicenter.ShikokuRegion, is(Epicenter.getRegionName(19)));
    }
    @Test
    public void canGetKyushuRegion() {
        assertThat(Epicenter.KyushuRegion, is(Epicenter.getRegionName(20)));
    }
    @Test
    public void canGetOkinawaRegion() {
        assertThat(Epicenter.OkinawaRegion, is(Epicenter.getRegionName(21)));
    }
    
}