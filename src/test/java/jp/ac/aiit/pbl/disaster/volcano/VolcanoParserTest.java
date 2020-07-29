package jp.ac.aiit.pbl.disaster.volcano;
import jp.ac.aiit.pbl.LocalGovernment;
import jp.ac.aiit.pbl.VolcanoName;
import jp.ac.aiit.pbl.disaster.volcano.Volcano;
import jp.ac.aiit.pbl.disaster.volcano.VolcanoParser;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class VolcanoParserTest {
    /**
     * Volcano parser test
     * To verify if parse handling is performed as expected or not.
     * To verify if each parameter value is obtained as expected or not.
     */
        @Test
        public void parseTest(){
            VolcanoParser parser = new VolcanoParser();
            //Prefix prefix = parser.parse("010100111010110111110010110001010001010000000000000001010001000000001110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100000001111000101001010111010100");
            Volcano volcano = parser.parse("010100111010110111110010110001010001010000000000000001010001000000001000000100000110010100000101000101100101100000001010001011001011000000010100010110010110000000101000101100101100000001010001011001011000000000000000000100000001111000101001010111010100");
            System.out.println(volcano.toString());
            assertThat(WarningCode.getById(1),is(WarningCode.EruptionWarning));
            assertThat(VolcanoName.getById(101),is(VolcanoName.Shiretokoiozan));
            assertThat(LocalGovernment.get(166700),is(LocalGovernment.HokkaidoTsuruimura));
        }
    }
