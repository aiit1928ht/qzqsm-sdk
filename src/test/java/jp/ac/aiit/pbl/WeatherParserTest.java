package jp.ac.aiit.pbl;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WeatherParserTest {
    String qzqms = new String("110001101010110111010011011011001000101000000000000000101011111000011010100000001011111001000001100100001011111010110110110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100110111111110101101101011101000");
    WeatherParser weatherParser = new WeatherParser(qzqms);
    Weather weather = weatherParser.parse();

    @Test
    public void canGetWarningState(){
        String expected = new String("解除");
        assertThat(weather.getWarningState(),is(expected));
    }

    @Test
    public void canGetDisasterSubcategoryList(){
        int expected = 6;
        assertThat(weather.getDisasterSubcategory().size(),is(expected));
    }

    @Test
    public void canGetPrefecturalForecastRegionList(){
        int expected = 6;
        assertThat(weather.getPrefecturalForecastRegion().size(),is(expected));
    }

    @Test
    public void canGetDisasterSubcategory1(){
        DisasterSubcategory expected = DisasterSubcategory.EARTH_AND_SAND_DISASTER_CAUTION_INFORMATION;
        assertThat(weather.getDisasterSubcategory().get(0),is(expected));
    }

    @Test
    public void canGetPrefecturalForecastRegion1(){
        PrefecturalForecastRegion expected = PrefecturalForecastRegion.FUKUOKAKEN;
        assertThat(weather.getPrefecturalForecastRegion().get(0),is(expected));
    }

    @Test
    public void canGetDisasterSubcategory2(){
        DisasterSubcategory expected = DisasterSubcategory.EARTH_AND_SAND_DISASTER_CAUTION_INFORMATION;
        assertThat(weather.getDisasterSubcategory().get(1),is(expected));
    }

    @Test
    public void canGetPrefecturalForecastRegion2(){
        PrefecturalForecastRegion expected = PrefecturalForecastRegion.SAGAKEN;
        assertThat(weather.getPrefecturalForecastRegion().get(1),is(expected));
    }

    @Test
    public void canGetDisasterSubcategory3(){
        DisasterSubcategory expected = DisasterSubcategory.EARTH_AND_SAND_DISASTER_CAUTION_INFORMATION;
        assertThat(weather.getDisasterSubcategory().get(2),is(expected));
    }

    @Test
    public void canGetPrefecturalForecastRegion3(){
        PrefecturalForecastRegion expected = PrefecturalForecastRegion.OITAKEN;
        assertThat(weather.getPrefecturalForecastRegion().get(2),is(expected));
    }
}
