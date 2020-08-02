package jp.ac.aiit.pbl;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WeatherParserTest {
    String qzqms = new String("110001101010110111010011011011001000101000000000000000101011111000011010100000001011111001000001100100001011111010110110110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100110111111110101101101011101000");
    WeatherParser weatherParser = new WeatherParser();
    Weather weather = weatherParser.parse(qzqms);

    @Test
    public  void canGetPrefix(){
        System.out.println(weather.getPrefix().toString());
    }

    @Test
    public void canGetWarningState(){
        WarningState expected = WarningState.CANCEL;
        assertThat(weather.getWarningState(),is(expected));
    }

    @Test
    public void canGetWeatherSubcategoryAndRegions(){
        int expected = 6;
        assertThat(weather.getWeatherSubcategoryAndRegions().size(),is(expected));
    }

    @Test
    public void canGetDisasterSubcategory1(){
        DisasterSubcategory expected = DisasterSubcategory.EARTH_AND_SAND_DISASTER_CAUTION_INFORMATION;
        assertThat(weather.getWeatherSubcategoryAndRegions().get(0).disasterSubcategory,is(expected));
    }

    @Test
    public void canGetPrefecturalForecastRegion1(){
        PrefecturalForecastRegion expected = PrefecturalForecastRegion.FUKUOKAKEN;
        assertThat(weather.getWeatherSubcategoryAndRegions().get(0).prefecturalForecastRegion,is(expected));
    }

    @Test
    public void canGetDisasterSubcategory2(){
        DisasterSubcategory expected = DisasterSubcategory.EARTH_AND_SAND_DISASTER_CAUTION_INFORMATION;
        assertThat(weather.getWeatherSubcategoryAndRegions().get(1).disasterSubcategory,is(expected));
    }

    @Test
    public void canGetPrefecturalForecastRegion2(){
        PrefecturalForecastRegion expected = PrefecturalForecastRegion.SAGAKEN;
        assertThat(weather.getWeatherSubcategoryAndRegions().get(1).prefecturalForecastRegion,is(expected));
    }

    @Test
    public void canGetDisasterSubcategory3(){
        DisasterSubcategory expected = DisasterSubcategory.EARTH_AND_SAND_DISASTER_CAUTION_INFORMATION;
        assertThat(weather.getWeatherSubcategoryAndRegions().get(2).disasterSubcategory,is(expected));
    }

    @Test
    public void canGetPrefecturalForecastRegion3(){
        PrefecturalForecastRegion expected = PrefecturalForecastRegion.OITAKEN;
        assertThat(weather.getWeatherSubcategoryAndRegions().get(2).prefecturalForecastRegion,is(expected));
    }
}
