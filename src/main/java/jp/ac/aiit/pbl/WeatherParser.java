package jp.ac.aiit.pbl;

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
        WarningState warningstate = new WarningState();
        DisasterSubcategoryRegion disastersubcategoryregion = new DisasterSubcategoryRegion();
        PrefecturalForecastRegion prefecturalforecastregion = new PrefecturalForecastRegion();

        weather.setWarningState(warningstate.definition.get(
                String.valueOf(Integer.parseInt(Format.WARNING_STATE.signalValue(qzqms), 2))));

        weather.setDisasterSubCategoryRegion1(disastersubcategoryregion.definition.get(
                String.valueOf(Integer.parseInt(Format.DISASTER_SUBCATEGORY_REGION1.signalValue(qzqms), 2))));
        weather.setDisasterSubCategoryRegion2(disastersubcategoryregion.definition.get(
                String.valueOf(Integer.parseInt(Format.DISASTER_SUBCATEGORY_REGION2.signalValue(qzqms), 2))));
        weather.setDisasterSubCategoryRegion3(disastersubcategoryregion.definition.get(
                String.valueOf(Integer.parseInt(Format.DISASTER_SUBCATEGORY_REGION3.signalValue(qzqms), 2))));
        weather.setDisasterSubCategoryRegion4(disastersubcategoryregion.definition.get(
                String.valueOf(Integer.parseInt(Format.DISASTER_SUBCATEGORY_REGION4.signalValue(qzqms), 2))));
        weather.setDisasterSubCategoryRegion5(disastersubcategoryregion.definition.get(
                String.valueOf(Integer.parseInt(Format.DISASTER_SUBCATEGORY_REGION5.signalValue(qzqms), 2))));
        weather.setDisasterSubCategoryRegion6(disastersubcategoryregion.definition.get(
                String.valueOf(Integer.parseInt(Format.DISASTER_SUBCATEGORY_REGION6.signalValue(qzqms), 2))));

        weather.setPrefecturalForecastRegionRegion1(prefecturalforecastregion.definition.get(
                String.valueOf(Integer.parseInt(Format.PREFECTURAL_FORECAST_REGION_REGION1.signalValue(qzqms), 2))));
        weather.setPrefecturalForecastRegionRegion2(prefecturalforecastregion.definition.get(
                String.valueOf(Integer.parseInt(Format.PREFECTURAL_FORECAST_REGION_REGION2.signalValue(qzqms), 2))));
        weather.setPrefecturalForecastRegionRegion3(prefecturalforecastregion.definition.get(
                String.valueOf(Integer.parseInt(Format.PREFECTURAL_FORECAST_REGION_REGION3.signalValue(qzqms), 2))));
        weather.setPrefecturalForecastRegionRegion4(prefecturalforecastregion.definition.get(
                String.valueOf(Integer.parseInt(Format.PREFECTURAL_FORECAST_REGION_REGION4.signalValue(qzqms), 2))));
        weather.setPrefecturalForecastRegionRegion5(prefecturalforecastregion.definition.get(
                String.valueOf(Integer.parseInt(Format.PREFECTURAL_FORECAST_REGION_REGION5.signalValue(qzqms), 2))));
        weather.setPrefecturalForecastRegionRegion6(prefecturalforecastregion.definition.get(
                String.valueOf(Integer.parseInt(Format.PREFECTURAL_FORECAST_REGION_REGION6.signalValue(qzqms), 2))));

        return weather;
    }
}
