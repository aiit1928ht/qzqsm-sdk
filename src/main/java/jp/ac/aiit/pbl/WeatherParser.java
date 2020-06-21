package jp.ac.aiit.pbl;

public class WeatherParser {
    String qzqms;

    public WeatherParser(String qzqms) {
        this.qzqms = qzqms;
    }

    public enum Format {
        PAB(0, 8),
        MESSAGE_TYPE(8, 14),
        REPORT_CLASSIFICATION(14, 17),
        DISASTER_CATEGORY(17, 21),
        REPORT_TIME(21, 41),
        INFO_TYPE(41, 43),
//        spare1(43, 53),
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
        /*
        spare2(200, 214),
        versionNumber(214, 220),
        reserved(220, 226),
        crc(226, 250);
         */

        private final int biginIndex;
        private final int endIndex;

        private Format(final int biginIndex, final int endIndex) {
            this.biginIndex = biginIndex;
            this.endIndex = endIndex;
        }

//        public int biginIndex() { return biginIndex; }

//        public int endIndex() { return endIndex; }

        public String signalValue(String qzqms) {
            return qzqms.substring(biginIndex, endIndex);
        }
    }

    public Weather parse() {
        Weather res = new Weather();
        res.setPab(Format.PAB.signalValue(qzqms));
        res.setMessageType(Format.MESSAGE_TYPE.signalValue(qzqms));
        res.setReportClassification(Format.REPORT_CLASSIFICATION.signalValue(qzqms));
        res.setDisasterCategory(Format.DISASTER_CATEGORY.signalValue(qzqms));
        res.setReportTime(Format.REPORT_TIME.signalValue(qzqms));
        res.setInfoType(Format.INFO_TYPE.signalValue(qzqms));
        res.setWarningState(Format.WARNING_STATE.signalValue(qzqms));
        res.setDisasterSubCategoryRegion1(Format.DISASTER_SUBCATEGORY_REGION1.signalValue(qzqms));
        res.setPrefecturalForecastRegionRegion1(Format.PREFECTURAL_FORECAST_REGION_REGION1.signalValue(qzqms));
        res.setDisasterSubCategoryRegion2(Format.DISASTER_SUBCATEGORY_REGION2.signalValue(qzqms));
        res.setPrefecturalForecastRegionRegion2(Format.PREFECTURAL_FORECAST_REGION_REGION2.signalValue(qzqms));
        res.setDisasterSubCategoryRegion3(Format.DISASTER_SUBCATEGORY_REGION3.signalValue(qzqms));
        res.setPrefecturalForecastRegionRegion3(Format.PREFECTURAL_FORECAST_REGION_REGION3.signalValue(qzqms));
        res.setDisasterSubCategoryRegion4(Format.DISASTER_SUBCATEGORY_REGION4.signalValue(qzqms));
        res.setPrefecturalForecastRegionRegion4(Format.PREFECTURAL_FORECAST_REGION_REGION4.signalValue(qzqms));
        res.setDisasterSubCategoryRegion5(Format.DISASTER_SUBCATEGORY_REGION5.signalValue(qzqms));
        res.setPrefecturalForecastRegionRegion5(Format.PREFECTURAL_FORECAST_REGION_REGION5.signalValue(qzqms));
        res.setDisasterSubCategoryRegion6(Format.DISASTER_SUBCATEGORY_REGION6.signalValue(qzqms));
        res.setPrefecturalForecastRegionRegion6(Format.PREFECTURAL_FORECAST_REGION_REGION6.signalValue(qzqms));
        return res;
    }
}
