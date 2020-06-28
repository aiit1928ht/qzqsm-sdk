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
    public void canGetWeatherRegion(){
        int expected = 6;
        assertThat(weather.getWeatherRegion().size(),is(expected));
    }

    @Test
    public void canGetDisasterSubcategory1(){
        String expected = new String("土砂災害警戒情報");
        assertThat(weather.getWeatherRegion().get(0).get(0),is(expected));
    }

    @Test
    public void canGetPrefecturalForecastRegion1(){
        String expected = new String("福岡県");
        assertThat(weather.getWeatherRegion().get(0).get(1),is(expected));
    }

    @Test
    public void canGetDisasterSubcategory2(){
        String expected = new String("土砂災害警戒情報");
        assertThat(weather.getWeatherRegion().get(1).get(0),is(expected));
    }

    @Test
    public void canGetPrefecturalForecastRegion2(){
        String expected = new String("佐賀県");
        assertThat(weather.getWeatherRegion().get(1).get(1),is(expected));
    }

    @Test
    public void canGetDisasterSubcategory3(){
        String expected = new String("土砂災害警戒情報");
        assertThat(weather.getWeatherRegion().get(2).get(0),is(expected));
    }

    @Test
    public void canGetPrefecturalForecastRegion3(){
        String expected = new String("大分県");
        assertThat(weather.getWeatherRegion().get(2).get(1),is(expected));
    }
}
