package jp.ac.aiit.pbl;

import java.util.ArrayList;

public class Weather {
    private String warningState;
    private ArrayList<ArrayList<String>> weatherRegion;

    public String getWarningState() {
        return warningState;
    }

    public void setWarningState(String warningState) {
        this.warningState = warningState;
    }

    public ArrayList<ArrayList<String>> getWeatherRegion() { return weatherRegion; }

    public void setWeatherRegion(ArrayList<ArrayList<String>> weatherRegion) {
        this.weatherRegion = weatherRegion;
    }
}