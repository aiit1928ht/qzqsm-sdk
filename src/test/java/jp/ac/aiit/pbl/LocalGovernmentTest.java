package jp.ac.aiit.pbl;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LocalGovernmentTest {
        @Test
        public void canGetLocalGovernmentTest110000(){
            assertThat(LocalGovernment.HokkaidoSapporoShi,is(LocalGovernment.getById(110000)));
        }
        @Test
        public void canGetLocalGovernmentTest120700(){
            assertThat(LocalGovernment.HokkaidoObihiroShi,is(LocalGovernment.getById(120700)));
        }
        @Test
        public void canGetLocalGovernmentTest166700(){
            assertThat(LocalGovernment.HokkaidoTsuruimura,is(LocalGovernment.getById(166700)));
        }
        @Test
        public void canGetLocalGovernmentTestMax(){
            assertThat(LocalGovernment.HokkaidoOthers,is(LocalGovernment.getById(199999)));
        }
        @Test
        public void canGetLocalGovernmentTestMoreThanMax(){
            assertThat(null,is(LocalGovernment.getById(200000)));
        }
        @Test
        public void canGetLocalGovernmentTestLessThanMin(){
            assertThat(null,is(LocalGovernment.getById(100)));
        }

}
