package jp.ac.aiit.pbl.disaster.ashfall;

import jp.ac.aiit.pbl.LocalGovernment;
import jp.ac.aiit.pbl.VolcanoName;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * AshFall parser test
 * To verify if parse handling is performed as expected or not.
 * To verify if each parameter value is obtained as expected or not.
 */
public class AshFallParserTest {
    @Test
    public void parseTest() {
        AshFallParser parser = new AshFallParser();
        AshFalll ashFalll = parser.parse("0101001110101101110010101100010100010100000000000000010100010000000010000111000011000101000000101001010110111000001010000001010010101101110000010100000010100101011011100000101000000101001010110111000111000101001010111010100");
        System.out.println(ashFalll.toString());
        assertThat(WarningType.getById(2),is(WarningType.AshFallForecastDetailed));
        assertThat(WarningCode.getById(2),is(WarningCode.MediumAshFall));
        assertThat(VolcanoName.getById(902),is(VolcanoName.NewActiveVolcano));
        assertThat(LocalGovernment.get(169400),is(LocalGovernment.HokkaidoRausucho));
    }

}
