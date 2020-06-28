package jp.ac.aiit.pbl;

import java.util.ArrayList;

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
                Integer.parseInt(Format.WARNING_STATE.signalValue(qzqms), 2)).getWarningStateName());

        ArrayList<ArrayList<String>> weatherRegion = new ArrayList<>();

        ArrayList<String> weatherRegion1 = new ArrayList<>();
        weatherRegion1.add(DisasterSubcategory.get(Integer.parseInt(Format.DISASTER_SUBCATEGORY_REGION1.signalValue(qzqms), 2)));
        weatherRegion1.add(PrefecturalForecastRegion.get(Integer.parseInt(Format.PREFECTURAL_FORECAST_REGION_REGION1.signalValue(qzqms), 2)));
        weatherRegion.add(weatherRegion1);

        ArrayList<String> weatherRegion2 = new ArrayList<>();
        weatherRegion2.add(DisasterSubcategory.get(Integer.parseInt(Format.DISASTER_SUBCATEGORY_REGION2.signalValue(qzqms), 2)));
        weatherRegion2.add(PrefecturalForecastRegion.get(Integer.parseInt(Format.PREFECTURAL_FORECAST_REGION_REGION2.signalValue(qzqms), 2)));
        weatherRegion.add(weatherRegion2);

        ArrayList<String> weatherRegion3 = new ArrayList<>();
        weatherRegion3.add(DisasterSubcategory.get(Integer.parseInt(Format.DISASTER_SUBCATEGORY_REGION3.signalValue(qzqms), 2)));
        weatherRegion3.add(PrefecturalForecastRegion.get(Integer.parseInt(Format.PREFECTURAL_FORECAST_REGION_REGION3.signalValue(qzqms), 2)));
        weatherRegion.add(weatherRegion3);

        ArrayList<String> weatherRegion4 = new ArrayList<>();
        weatherRegion4.add(DisasterSubcategory.get(Integer.parseInt(Format.DISASTER_SUBCATEGORY_REGION4.signalValue(qzqms), 2)));
        weatherRegion4.add(PrefecturalForecastRegion.get(Integer.parseInt(Format.PREFECTURAL_FORECAST_REGION_REGION4.signalValue(qzqms), 2)));
        weatherRegion.add(weatherRegion4);

        ArrayList<String> weatherRegion5 = new ArrayList<>();
        weatherRegion5.add(DisasterSubcategory.get(Integer.parseInt(Format.DISASTER_SUBCATEGORY_REGION5.signalValue(qzqms), 2)));
        weatherRegion5.add(PrefecturalForecastRegion.get(Integer.parseInt(Format.PREFECTURAL_FORECAST_REGION_REGION5.signalValue(qzqms), 2)));
        weatherRegion.add(weatherRegion5);

        ArrayList<String> weatherRegion6 = new ArrayList<>();
        weatherRegion6.add(DisasterSubcategory.get(Integer.parseInt(Format.DISASTER_SUBCATEGORY_REGION6.signalValue(qzqms), 2)));
        weatherRegion6.add(PrefecturalForecastRegion.get(Integer.parseInt(Format.PREFECTURAL_FORECAST_REGION_REGION6.signalValue(qzqms), 2)));
        weatherRegion.add(weatherRegion6);

        weather.setWeatherRegion(weatherRegion);

        return weather;
    }
}
