package jp.ac.aiit.pbl;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SeismicIntensityPrefectureTest {

    @Test
    public void canGetPrefectureHokkaido() {
        assertThat(SeismicIntensityPrefecture.Hokkaido, is(SeismicIntensityPrefecture.getRegionName(1)));
    }
    @Test
    public void canGetPrefectureAomori() {
        assertThat(SeismicIntensityPrefecture.Aomori, is(SeismicIntensityPrefecture.getRegionName(2)));
    }
    @Test
    public void canGetPrefectureIwate() {
        assertThat(SeismicIntensityPrefecture.Iwate, is(SeismicIntensityPrefecture.getRegionName(3)));
    }
    @Test
    public void canGetPrefectureMiyagi() {
        assertThat(SeismicIntensityPrefecture.Miyagi, is(SeismicIntensityPrefecture.getRegionName(4)));
    }
    @Test
    public void canGetPrefectureAkita() {
        assertThat(SeismicIntensityPrefecture.Akita, is(SeismicIntensityPrefecture.getRegionName(5)));
    }
    @Test
    public void canGetPrefectureYamagata() {
        assertThat(SeismicIntensityPrefecture.Yamagata, is(SeismicIntensityPrefecture.getRegionName(6)));
    }
    @Test
    public void canGetPrefectureFukushima() {
        assertThat(SeismicIntensityPrefecture.Fukushima, is(SeismicIntensityPrefecture.getRegionName(7)));
    }
    @Test
    public void canGetPrefectureIbaraki() {
        assertThat(SeismicIntensityPrefecture.Ibaraki, is(SeismicIntensityPrefecture.getRegionName(8)));
    }
    @Test
    public void canGetPrefectureTochigi() {
        assertThat(SeismicIntensityPrefecture.Tochigi, is(SeismicIntensityPrefecture.getRegionName(9)));
    }
    @Test
    public void canGetPrefectureGunma() {
        assertThat(SeismicIntensityPrefecture.Gunma, is(SeismicIntensityPrefecture.getRegionName(10)));
    }
    @Test
    public void canGetPrefectureSaitama() {
        assertThat(SeismicIntensityPrefecture.Saitama, is(SeismicIntensityPrefecture.getRegionName(11)));
    }
    @Test
    public void canGetPrefectureChiba() {
        assertThat(SeismicIntensityPrefecture.Chiba, is(SeismicIntensityPrefecture.getRegionName(12)));
    }
    @Test
    public void canGetPrefectureTokyo() {
        assertThat(SeismicIntensityPrefecture.Tokyo, is(SeismicIntensityPrefecture.getRegionName(13)));
    }
    @Test
    public void canGetPrefectureKanagawa() {
        assertThat(SeismicIntensityPrefecture.Kanagawa, is(SeismicIntensityPrefecture.getRegionName(14)));
    }
    @Test
    public void canGetPrefectureNiigata() {
        assertThat(SeismicIntensityPrefecture.Niigata, is(SeismicIntensityPrefecture.getRegionName(15)));
    }
    @Test
    public void canGetPrefectureToyama() {
        assertThat(SeismicIntensityPrefecture.Toyama, is(SeismicIntensityPrefecture.getRegionName(16)));
    }
    @Test
    public void canGetPrefectureIshikawa() {
        assertThat(SeismicIntensityPrefecture.Ishikawa, is(SeismicIntensityPrefecture.getRegionName(17)));
    }
    @Test
    public void canGetPrefectureFukui() {
        assertThat(SeismicIntensityPrefecture.Fukui, is(SeismicIntensityPrefecture.getRegionName(18)));
    }
    @Test
    public void canGetPrefectureYamanashi() {
        assertThat(SeismicIntensityPrefecture.Yamanashi, is(SeismicIntensityPrefecture.getRegionName(19)));
    }
    @Test
    public void canGetPrefectureNagano() {
        assertThat(SeismicIntensityPrefecture.Nagano, is(SeismicIntensityPrefecture.getRegionName(20)));
    }
    @Test
    public void canGetPrefectureGifu() {
        assertThat(SeismicIntensityPrefecture.Gifu, is(SeismicIntensityPrefecture.getRegionName(21)));
    }
    @Test
    public void canGetPrefectureShizuoka() {
        assertThat(SeismicIntensityPrefecture.Shizuoka, is(SeismicIntensityPrefecture.getRegionName(22)));
    }
    @Test
    public void canGetPrefectureAichi() {
        assertThat(SeismicIntensityPrefecture.Aichi, is(SeismicIntensityPrefecture.getRegionName(23)));
    }
    @Test
    public void canGetPrefectureMie() {
        assertThat(SeismicIntensityPrefecture.Mie, is(SeismicIntensityPrefecture.getRegionName(24)));
    }
    @Test
    public void canGetPrefectureShiga() {
        assertThat(SeismicIntensityPrefecture.Shiga, is(SeismicIntensityPrefecture.getRegionName(25)));
    }
    @Test
    public void canGetPrefectureKyoto() {
        assertThat(SeismicIntensityPrefecture.Kyoto, is(SeismicIntensityPrefecture.getRegionName(26)));
    }
    @Test
    public void canGetPrefectureOsaka() {
        assertThat(SeismicIntensityPrefecture.Osaka, is(SeismicIntensityPrefecture.getRegionName(27)));
    }
    @Test
    public void canGetPrefectureHyogo() {
        assertThat(SeismicIntensityPrefecture.Hyogo, is(SeismicIntensityPrefecture.getRegionName(28)));
    }
    @Test
    public void canGetPrefectureNara() {
        assertThat(SeismicIntensityPrefecture.Nara, is(SeismicIntensityPrefecture.getRegionName(29)));
    }
    @Test
    public void canGetPrefectureWakayama() {
        assertThat(SeismicIntensityPrefecture.Wakayama, is(SeismicIntensityPrefecture.getRegionName(30)));
    }
    @Test
    public void canGetPrefectureTottori() {
        assertThat(SeismicIntensityPrefecture.Tottori, is(SeismicIntensityPrefecture.getRegionName(31)));
    }
    @Test
    public void canGetPrefectureShimane() {
        assertThat(SeismicIntensityPrefecture.Shimane, is(SeismicIntensityPrefecture.getRegionName(32)));
    }
    @Test
    public void canGetPrefectureOkayama() {
        assertThat(SeismicIntensityPrefecture.Okayama, is(SeismicIntensityPrefecture.getRegionName(33)));
    }
    @Test
    public void canGetPrefectureHiroshima() {
        assertThat(SeismicIntensityPrefecture.Hiroshima, is(SeismicIntensityPrefecture.getRegionName(34)));
    }
    @Test
    public void canGetPrefectureYamaguchi() {
        assertThat(SeismicIntensityPrefecture.Yamaguchi, is(SeismicIntensityPrefecture.getRegionName(35)));
    }
    @Test
    public void canGetPrefectureTokushima() {
        assertThat(SeismicIntensityPrefecture.Tokushima, is(SeismicIntensityPrefecture.getRegionName(36)));
    }
    @Test
    public void canGetPrefectureKagawa() {
        assertThat(SeismicIntensityPrefecture.Kagawa, is(SeismicIntensityPrefecture.getRegionName(37)));
    }
    @Test
    public void canGetPrefectureEhime() {
        assertThat(SeismicIntensityPrefecture.Ehime, is(SeismicIntensityPrefecture.getRegionName(38)));
    }
    @Test
    public void canGetPrefectureKochi() {
        assertThat(SeismicIntensityPrefecture.Kochi, is(SeismicIntensityPrefecture.getRegionName(39)));
    }
    @Test
    public void canGetPrefectureFukuoka() {
        assertThat(SeismicIntensityPrefecture.Fukuoka, is(SeismicIntensityPrefecture.getRegionName(40)));
    }
    @Test
    public void canGetPrefectureSaga() {
        assertThat(SeismicIntensityPrefecture.Saga, is(SeismicIntensityPrefecture.getRegionName(41)));
    }
    @Test
    public void canGetPrefectureNagasaki() {
        assertThat(SeismicIntensityPrefecture.Nagasaki, is(SeismicIntensityPrefecture.getRegionName(42)));
    }
    @Test
    public void canGetPrefectureKumamoto() {
        assertThat(SeismicIntensityPrefecture.Kumamoto, is(SeismicIntensityPrefecture.getRegionName(43)));
    }
    @Test
    public void canGetPrefectureOita() {
        assertThat(SeismicIntensityPrefecture.Oita, is(SeismicIntensityPrefecture.getRegionName(44)));
    }
    @Test
    public void canGetPrefectureMiyazaki() {
        assertThat(SeismicIntensityPrefecture.Miyazaki, is(SeismicIntensityPrefecture.getRegionName(45)));
    }
    @Test
    public void canGetPrefectureKagoshima() {
        assertThat(SeismicIntensityPrefecture.Kagoshima, is(SeismicIntensityPrefecture.getRegionName(46)));
    }
    @Test
    public void canGetPrefectureOkinawa() {
        assertThat(SeismicIntensityPrefecture.Okinawa, is(SeismicIntensityPrefecture.getRegionName(47)));
    }
}