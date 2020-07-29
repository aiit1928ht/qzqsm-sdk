package jp.ac.aiit.pbl.disaster.flood;

import jp.ac.aiit.pbl.Prefix;

import java.util.List;

/**
 * This class is the information of Flood transmitted by QZSS.
 * It has properties about disaster Warning level and forecast region, etc.
 * And It provides setter/getter of their properties.
 */

public class Flood {
    private Prefix prefix;
    private List<FloodWarningLevelAndForecastRegion> floodWarningLevelAndForecastRegion;

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    public List<FloodWarningLevelAndForecastRegion> getFloodWarningLevelAndForecastRegion() {
        return floodWarningLevelAndForecastRegion;
    }

    public void setFloodWarningLevelAndForecastRegion(List<FloodWarningLevelAndForecastRegion> floodWarningLevelAndForecastRegion) {
        this.floodWarningLevelAndForecastRegion = floodWarningLevelAndForecastRegion;
    }
}
