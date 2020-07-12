package jp.ac.aiit.pbl.disaster.seismicIntensity;

import jp.ac.aiit.pbl.disaster.seismicIntensity.Prefecture;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PrefectureTest {

    @Test
    public void canGetPrefectureHokkaido() {
        assertThat(Prefecture.Hokkaido, is(Prefecture.getRegionName(1)));
    }
    @Test
    public void canGetPrefectureAomori() {
        assertThat(Prefecture.Aomori, is(Prefecture.getRegionName(2)));
    }
    @Test
    public void canGetPrefectureIwate() {
        assertThat(Prefecture.Iwate, is(Prefecture.getRegionName(3)));
    }
    @Test
    public void canGetPrefectureMiyagi() {
        assertThat(Prefecture.Miyagi, is(Prefecture.getRegionName(4)));
    }
    @Test
    public void canGetPrefectureAkita() {
        assertThat(Prefecture.Akita, is(Prefecture.getRegionName(5)));
    }
    @Test
    public void canGetPrefectureYamagata() {
        assertThat(Prefecture.Yamagata, is(Prefecture.getRegionName(6)));
    }
    @Test
    public void canGetPrefectureFukushima() {
        assertThat(Prefecture.Fukushima, is(Prefecture.getRegionName(7)));
    }
    @Test
    public void canGetPrefectureIbaraki() {
        assertThat(Prefecture.Ibaraki, is(Prefecture.getRegionName(8)));
    }
    @Test
    public void canGetPrefectureTochigi() {
        assertThat(Prefecture.Tochigi, is(Prefecture.getRegionName(9)));
    }
    @Test
    public void canGetPrefectureGunma() {
        assertThat(Prefecture.Gunma, is(Prefecture.getRegionName(10)));
    }
    @Test
    public void canGetPrefectureSaitama() {
        assertThat(Prefecture.Saitama, is(Prefecture.getRegionName(11)));
    }
    @Test
    public void canGetPrefectureChiba() {
        assertThat(Prefecture.Chiba, is(Prefecture.getRegionName(12)));
    }
    @Test
    public void canGetPrefectureTokyo() {
        assertThat(Prefecture.Tokyo, is(Prefecture.getRegionName(13)));
    }
    @Test
    public void canGetPrefectureKanagawa() {
        assertThat(Prefecture.Kanagawa, is(Prefecture.getRegionName(14)));
    }
    @Test
    public void canGetPrefectureNiigata() {
        assertThat(Prefecture.Niigata, is(Prefecture.getRegionName(15)));
    }
    @Test
    public void canGetPrefectureToyama() {
        assertThat(Prefecture.Toyama, is(Prefecture.getRegionName(16)));
    }
    @Test
    public void canGetPrefectureIshikawa() {
        assertThat(Prefecture.Ishikawa, is(Prefecture.getRegionName(17)));
    }
    @Test
    public void canGetPrefectureFukui() {
        assertThat(Prefecture.Fukui, is(Prefecture.getRegionName(18)));
    }
    @Test
    public void canGetPrefectureYamanashi() {
        assertThat(Prefecture.Yamanashi, is(Prefecture.getRegionName(19)));
    }
    @Test
    public void canGetPrefectureNagano() {
        assertThat(Prefecture.Nagano, is(Prefecture.getRegionName(20)));
    }
    @Test
    public void canGetPrefectureGifu() {
        assertThat(Prefecture.Gifu, is(Prefecture.getRegionName(21)));
    }
    @Test
    public void canGetPrefectureShizuoka() {
        assertThat(Prefecture.Shizuoka, is(Prefecture.getRegionName(22)));
    }
    @Test
    public void canGetPrefectureAichi() {
        assertThat(Prefecture.Aichi, is(Prefecture.getRegionName(23)));
    }
    @Test
    public void canGetPrefectureMie() {
        assertThat(Prefecture.Mie, is(Prefecture.getRegionName(24)));
    }
    @Test
    public void canGetPrefectureShiga() {
        assertThat(Prefecture.Shiga, is(Prefecture.getRegionName(25)));
    }
    @Test
    public void canGetPrefectureKyoto() {
        assertThat(Prefecture.Kyoto, is(Prefecture.getRegionName(26)));
    }
    @Test
    public void canGetPrefectureOsaka() {
        assertThat(Prefecture.Osaka, is(Prefecture.getRegionName(27)));
    }
    @Test
    public void canGetPrefectureHyogo() {
        assertThat(Prefecture.Hyogo, is(Prefecture.getRegionName(28)));
    }
    @Test
    public void canGetPrefectureNara() {
        assertThat(Prefecture.Nara, is(Prefecture.getRegionName(29)));
    }
    @Test
    public void canGetPrefectureWakayama() {
        assertThat(Prefecture.Wakayama, is(Prefecture.getRegionName(30)));
    }
    @Test
    public void canGetPrefectureTottori() {
        assertThat(Prefecture.Tottori, is(Prefecture.getRegionName(31)));
    }
    @Test
    public void canGetPrefectureShimane() {
        assertThat(Prefecture.Shimane, is(Prefecture.getRegionName(32)));
    }
    @Test
    public void canGetPrefectureOkayama() {
        assertThat(Prefecture.Okayama, is(Prefecture.getRegionName(33)));
    }
    @Test
    public void canGetPrefectureHiroshima() {
        assertThat(Prefecture.Hiroshima, is(Prefecture.getRegionName(34)));
    }
    @Test
    public void canGetPrefectureYamaguchi() {
        assertThat(Prefecture.Yamaguchi, is(Prefecture.getRegionName(35)));
    }
    @Test
    public void canGetPrefectureTokushima() {
        assertThat(Prefecture.Tokushima, is(Prefecture.getRegionName(36)));
    }
    @Test
    public void canGetPrefectureKagawa() {
        assertThat(Prefecture.Kagawa, is(Prefecture.getRegionName(37)));
    }
    @Test
    public void canGetPrefectureEhime() {
        assertThat(Prefecture.Ehime, is(Prefecture.getRegionName(38)));
    }
    @Test
    public void canGetPrefectureKochi() {
        assertThat(Prefecture.Kochi, is(Prefecture.getRegionName(39)));
    }
    @Test
    public void canGetPrefectureFukuoka() {
        assertThat(Prefecture.Fukuoka, is(Prefecture.getRegionName(40)));
    }
    @Test
    public void canGetPrefectureSaga() {
        assertThat(Prefecture.Saga, is(Prefecture.getRegionName(41)));
    }
    @Test
    public void canGetPrefectureNagasaki() {
        assertThat(Prefecture.Nagasaki, is(Prefecture.getRegionName(42)));
    }
    @Test
    public void canGetPrefectureKumamoto() {
        assertThat(Prefecture.Kumamoto, is(Prefecture.getRegionName(43)));
    }
    @Test
    public void canGetPrefectureOita() {
        assertThat(Prefecture.Oita, is(Prefecture.getRegionName(44)));
    }
    @Test
    public void canGetPrefectureMiyazaki() {
        assertThat(Prefecture.Miyazaki, is(Prefecture.getRegionName(45)));
    }
    @Test
    public void canGetPrefectureKagoshima() {
        assertThat(Prefecture.Kagoshima, is(Prefecture.getRegionName(46)));
    }
    @Test
    public void canGetPrefectureOkinawa() {
        assertThat(Prefecture.Okinawa, is(Prefecture.getRegionName(47)));
    }
}