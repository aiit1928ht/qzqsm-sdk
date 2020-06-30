package jp.ac.aiit.pbl;

import java.util.ArrayList;
import java.util.List;

public class WeatherParser {
    String qzqms;

    public WeatherParser(String qzqms) {
        this.qzqms = qzqms;
    }

    public enum Format {
        WARNING_STATE(53, 56),
        DISASTER_SUBCATEGORY_REGION1(56, 61),
        PREFECTURAL_FORECAST_REGION_REGION1(61, 80),
        DISASTER_SUBCATEGORY_REGION2(80, 85),
        PREFECTURAL_FORECAST_REGION_REGION2(85, 104),
        DISASTER_SUBCATEGORY_REGION3(104, 109),
        PREFECTURAL_FORECAST_REGION_REGION3(109, 128),
        DISASTER_SUBCATEGORY_REGION4(128, 133),
        PREFECTURAL_FORECAST_REGION_REGION4(133, 152),
        DISASTER_SUBCATEGORY_REGION5(152, 157),
        PREFECTURAL_FORECAST_REGION_REGION5(157, 176),
        DISASTER_SUBCATEGORY_REGION6(176, 181),
        PREFECTURAL_FORECAST_REGION_REGION6(181, 200);

        private final int biginIndex;
        private final int endIndex;

        Format(final int biginIndex, final int endIndex) {
            this.biginIndex = biginIndex;
            this.endIndex = endIndex;
        }

        public int biginIndex() { return biginIndex; }

        public int endIndex() { return endIndex; }

        public String signalValue(String qzqms) {
            return qzqms.substring(biginIndex, endIndex);
        }
    }

    public Weather parse() {
        Weather weather = new Weather();

        weather.setWarningState(WarningState.getById(
                Integer.parseInt(Format.WARNING_STATE.signalValue(qzqms), 2)));

        List<WeatherSubcategoryAndRegion> weatherSubcategoryAndRegions = new ArrayList<>();
        weatherSubcategoryAndRegions.add(new WeatherSubcategoryAndRegion(
                Integer.parseInt(Format.DISASTER_SUBCATEGORY_REGION1.signalValue(qzqms), 2),
                Integer.parseInt(Format.PREFECTURAL_FORECAST_REGION_REGION1.signalValue(qzqms), 2)));
        weatherSubcategoryAndRegions.add(new WeatherSubcategoryAndRegion(
                Integer.parseInt(Format.DISASTER_SUBCATEGORY_REGION2.signalValue(qzqms), 2),
                Integer.parseInt(Format.PREFECTURAL_FORECAST_REGION_REGION2.signalValue(qzqms), 2)));
        weatherSubcategoryAndRegions.add(new WeatherSubcategoryAndRegion(
                Integer.parseInt(Format.DISASTER_SUBCATEGORY_REGION3.signalValue(qzqms), 2),
                Integer.parseInt(Format.PREFECTURAL_FORECAST_REGION_REGION3.signalValue(qzqms), 2)));
        weatherSubcategoryAndRegions.add(new WeatherSubcategoryAndRegion(
                Integer.parseInt(Format.DISASTER_SUBCATEGORY_REGION4.signalValue(qzqms), 2),
                Integer.parseInt(Format.PREFECTURAL_FORECAST_REGION_REGION4.signalValue(qzqms), 2)));
        weatherSubcategoryAndRegions.add(new WeatherSubcategoryAndRegion(
                Integer.parseInt(Format.DISASTER_SUBCATEGORY_REGION5.signalValue(qzqms), 2),
                Integer.parseInt(Format.PREFECTURAL_FORECAST_REGION_REGION5.signalValue(qzqms), 2)));
        weatherSubcategoryAndRegions.add(new WeatherSubcategoryAndRegion(
                Integer.parseInt(Format.DISASTER_SUBCATEGORY_REGION6.signalValue(qzqms), 2),
                Integer.parseInt(Format.PREFECTURAL_FORECAST_REGION_REGION6.signalValue(qzqms), 2)));
        weather.setWeatherSubcategoryAndRegions(weatherSubcategoryAndRegions);

        return weather;
    }
}
