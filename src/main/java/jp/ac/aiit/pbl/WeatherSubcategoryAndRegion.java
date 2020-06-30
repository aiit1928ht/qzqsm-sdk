package jp.ac.aiit.pbl;

public class WeatherSubcategoryAndRegion {
    public final DisasterSubcategory disasterSubcategory;
    public final PrefecturalForecastRegion prefecturalForecastRegion;

    WeatherSubcategoryAndRegion(int disasterSubcategoryId, int prefecturalForecastRegionId) {
        this.disasterSubcategory = DisasterSubcategory.get(disasterSubcategoryId);
        this.prefecturalForecastRegion = PrefecturalForecastRegion.get(prefecturalForecastRegionId);
    }

    public DisasterSubcategory getDisasterSubcategory() {
        return disasterSubcategory;
    }
    public PrefecturalForecastRegion getPrefecturalForecastRegion() {
        return prefecturalForecastRegion;
    }
}
