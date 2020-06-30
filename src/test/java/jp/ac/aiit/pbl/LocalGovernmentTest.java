package jp.ac.aiit.pbl;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LocalGovernmentTest {
        @Test
        public void canGetLocalGovernmentTest110000(){
            assertThat(LocalGovernment.HokkaidoSapporoshi,is(LocalGovernment.getById(110000)));
        }
        @Test
        public void canGetLocalGovernmentTest120700(){
            assertThat(LocalGovernment.HokkaidoObihiroshi,is(LocalGovernment.getById(120700)));
        }
        @Test
        public void canGetLocalGovernmentTest143300(){
            assertThat(LocalGovernment.HokkaidoMoseushicho,is(LocalGovernment.getById(143300)));
        }
        @Test
        public void canGetLocalGovernmentTest155000(){
            assertThat(LocalGovernment.HokkaidoOketocho,is(LocalGovernment.getById(155000)));
        }
        @Test
        public void canGetLocalGovernmentTest160800(){
            assertThat(LocalGovernment.Hokkaidosamanicho,is(LocalGovernment.getById(160800)));
        }
        @Test
        public void canGetLocalGovernmentTest161000(){
            assertThat(LocalGovernment.HokkaidoShinhidakacho,is(LocalGovernment.getById(161000)));
        }
        @Test
        public void canGetLocalGovernmentTest163300(){
            assertThat(LocalGovernment.HokkaidoKamishorohocho,is(LocalGovernment.getById(163300)));
        }
        @Test
        public void canGetLocalGovernmentTest163800(){
            assertThat(LocalGovernment.HokkaidoNakasatsunaimura,is(LocalGovernment.getById(163800)));
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
