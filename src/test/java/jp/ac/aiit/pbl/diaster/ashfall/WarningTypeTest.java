package jp.ac.aiit.pbl.diaster.ashfall;

import jp.ac.aiit.pbl.WarningType;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class WarningTypeTest {
    @Test
    public void canGetWarningType1(){
        assertThat(WarningType.AshFallForecastPreliminary,is(WarningType.getById(1)));
    }

    @Test
    public void canGetWarningType2(){
        assertThat(WarningType.AshFallForecastDetaied,is(WarningType.getById(2)));
    }
}
