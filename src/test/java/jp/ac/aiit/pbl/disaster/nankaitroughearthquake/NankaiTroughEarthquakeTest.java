package jp.ac.aiit.pbl.disaster.nankaitroughearthquake;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NankaiTroughEarthquakeTest {
    String qzqms = "1001101010101101001000111001111011010110000000000000000001110001110000001100000011110001110000001100000101110001110000001100000111110001110000001100001001110001110000001100001011110001110000001100001100000100001000000001000000000000000000000000000001";
    NankaiTroughEarthquakeParser nankaiTroughEarthquakeParser = new NankaiTroughEarthquakeParser();
    NankaiTroughEarthquake nankaiTroughEarthquake = nankaiTroughEarthquakeParser.parse(qzqms);

    @Test
    public void NankaiTroughEarthquakeToString() {
        NankaiTroughEarthquake nankaiTroughEarthquake = nankaiTroughEarthquakeParser.parse(qzqms);
        System.out.println(nankaiTroughEarthquake.toString());
    }

    @Test
    public void canGetNankaiTroughEarthquakeTextInformations() {
        String expected = "ぁあぃいぅう";
        assertThat(nankaiTroughEarthquake.getText(),is(expected));
    }

    @Test
    public void canGetNankaiTroughEarthquakePageNumber() {
        int expected = 2;
        assertThat(nankaiTroughEarthquake.getPageNumber(),is(expected));
    }

    @Test
    public void canGetNankaiTroughEarthquakeTotalPage() {
        int expected = 4;
        assertThat(nankaiTroughEarthquake.getTotalPage(),is(expected));
    }

    @Test
    public void canGetByteCodes6() {
        String expected = "１２３４５６";
        String qzqms = "1001101010101101001000111001111011010110000000000000000001110111110111100100100011110111110111100100100101110111110111100100100111110111110111100100101001110111110111100100101011110111110111100100101100000100001000000001000000000000000000000000000001";
        NankaiTroughEarthquakeParser nankaiTroughEarthquakeParser = new NankaiTroughEarthquakeParser();
        NankaiTroughEarthquake nankaiTroughEarthquake = nankaiTroughEarthquakeParser.parse(qzqms);
        assertThat(nankaiTroughEarthquake.getText(),is(expected));
    }

    @Test
    public void canGetByteCodes2() {
        String expected = "１２";
        String qzqms = "1001101010101101001000111001111011010110000000000000000001110111110111100100100011110111110111100100100100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100001000000001000000000000000000000000000001";
        NankaiTroughEarthquakeParser nankaiTroughEarthquakeParser = new NankaiTroughEarthquakeParser();
        NankaiTroughEarthquake nankaiTroughEarthquake = nankaiTroughEarthquakeParser.parse(qzqms);
        assertThat(nankaiTroughEarthquake.getText(),is(expected));
    }
}