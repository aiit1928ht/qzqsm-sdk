package jp.ac.aiit.pbl;

import java.util.List;

public class Weather {
    private String warningState;
    private List<DisasterSubcategory> disasterSubcategory;
    private List<PrefecturalForecastRegion> prefecturalForecastRegion;

    public String getWarningState() {
        return warningState;
    }

    public void setWarningState(String warningState) {
        this.warningState = warningState;
    }

    public List<DisasterSubcategory> getDisasterSubcategory() { return disasterSubcategory; }

    public void setDisasterSubcategory(List<DisasterSubcategory> disasterSubcategory) {
         this.disasterSubcategory = disasterSubcategory;
    }

    public List<PrefecturalForecastRegion> getPrefecturalForecastRegion() { return prefecturalForecastRegion; }

    public void setPrefecturalForecastRegion(List<PrefecturalForecastRegion> prefecturalForecastRegion) {
        this.prefecturalForecastRegion = prefecturalForecastRegion;
    }
}