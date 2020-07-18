package jp.ac.aiit.pbl.disaster.marine;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MarineParserTest {
    /**
     * Marine parser test
     * To verify if parse handling is performed as expected or not.
     * To verify if each parameter value is obtained as expected or not.
     */

    @Test
    public void MarineParser() {
        MarineParser parser = new MarineParser();
        Marine marine = parser.parse("0101001110101101111100101100010100010100000000000000010100010000000011101010001000000001110101000100000000111010100010000000011101010001000000001110101000100000000111010100010000000011101010001000000001110101000100000000111010100010000000011100111010100");
        System.out.println(marine.toString());
        assertThat(WarningCode.getById(20),is(WarningCode.SeaWindAlert));
        assertThat(MarineForecastRegion.getById(4110),is(MarineForecastRegion.NihonKaiNorthernWest));
    }
}