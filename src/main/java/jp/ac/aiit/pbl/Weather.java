package jp.ac.aiit.pbl;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    private String warningState;
    private List<List<Enum>> weatherRegion;

    public String getWarningState() {
        return warningState;
    }

    public void setWarningState(String warningState) {
        this.warningState = warningState;
    }

    public List<List<Enum>> getWeatherRegion() { return weatherRegion; }

    public void setWeatherRegion(List<List<Enum>> weatherRegion) {
         this.weatherRegion = weatherRegion;
    }
}