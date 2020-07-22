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
        public void measureHandlingTimeForHashMap166700(){

            //Measurement for original handling
            long startPointOriginal = System.nanoTime();
            assertThat(LocalGovernment.HokkaidoTsuruimura,is(LocalGovernment.getById(166700)));
            long endPointOriginal = System.nanoTime();
            long resultTimeOriginal = endPointOriginal - startPointOriginal;

            //Measurement for hash map
            long startPointOriginalHashMap = System.nanoTime();
            assertThat(LocalGovernment.HokkaidoTsuruimura,is(LocalGovernment.get(166700)));
            long endPointOriginalHashMap = System.nanoTime();
            long resultTimeHashMap = endPointOriginalHashMap - startPointOriginalHashMap;

            //Result for original
            System.out.println("startPointOriginal=" + startPointOriginal);
            System.out.println("endPointOriginal=" + endPointOriginal);
            System.out.println("resultTimeOriginal=" + resultTimeOriginal+"Nano");
            //Result for Hash map
            System.out.println("startPointOriginalHashMap=" + startPointOriginalHashMap);
            System.out.println("endPointOriginalHashMap=" + endPointOriginalHashMap);
            System.out.println("resultTimeHashMap=" + resultTimeHashMap+"Nano");
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
