package jp.ac.aiit.pbl;

import java.util.List;

public class Weather {
    private WarningState warningState;
    private List<WeatherSubcategoryAndRegion> weatherSubcategoryAndRegions;

    public WarningState getWarningState() {
        return warningState;
    }
    public void setWarningState(WarningState warningState) {
        this.warningState = warningState;
    }

    public List<WeatherSubcategoryAndRegion> getWeatherSubcategoryAndRegions() {
        return weatherSubcategoryAndRegions;
    }
    public void setWeatherSubcategoryAndRegions(List<WeatherSubcategoryAndRegion> weatherSubcategoryAndRegions) {
        this.weatherSubcategoryAndRegions = weatherSubcategoryAndRegions;
    }
}