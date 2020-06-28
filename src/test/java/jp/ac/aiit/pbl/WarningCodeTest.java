package jp.ac.aiit.pbl;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WarningCodeTest {
    @Test
    public void canGetWarningCode1(){
        assertThat(WarningCode.eruptionWarning,is(WarningCode.getById(1)));
    }
    @Test
    public void canGetWarningCode11(){
        assertThat(WarningCode.level1,is(WarningCode.getById(11)));
    }
    @Test
    public void canGetWarningCode21(){
        assertThat(WarningCode.activeVolcano,is(WarningCode.getById(21)));
    }
    @Test
    public void canGetWarningMax(){
        assertThat(WarningCode.others,is(WarningCode.getById(127)));
    }
    @Test
    public void canGetWarningCodeMoreThanMax(){
        assertThat(null,is(WarningCode.getById(128)));
    }
    @Test
    public void canGetWarningCodeLessThanMin(){
        assertThat(null,is(WarningCode.getById(0)));
    }

}
