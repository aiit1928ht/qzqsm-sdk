package jp.ac.aiit.pbl.disaster.earthquakeearlywarning;

import jp.ac.aiit.pbl.*;
import jp.ac.aiit.pbl.SeismicEpicenter;
import java.time.LocalDateTime;
import java.util.List;

public class EarthquakeEarlyWarning implements Disaster {
    private Prefix prefix;
    private Notification notification;
    private LocalDateTime occurrenceTimeOfEarthquake;
    private String depthOfSeismicEpicenter;
    private String magnitude;
    private SeismicEpicenter seismicEpicenter;
    private SeismicIntensityLowerLimit seismicIntensityLowerLimit;
    private SeismicIntensityUpperLimit seismicIntensityUpperLimit;
    private List<ForecastRegionEarthquakeEarlyWarning> forecastRegionEarthquakeEarlyWarning;

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public LocalDateTime getOccurrenceTimeOfEarthquake() {
        return occurrenceTimeOfEarthquake;
    }

    public void setOccurrenceTimeOfEarthquake(LocalDateTime occurrenceTimeOfEarthquake) {
        this.occurrenceTimeOfEarthquake = occurrenceTimeOfEarthquake;
    }

    public String getDepthOfSeismicEpicenter() {
        return depthOfSeismicEpicenter;
    }

    public void setDepthOfSeismicEpicenter(String depthOfSeismicEpicenter) {
        this.depthOfSeismicEpicenter = depthOfSeismicEpicenter;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    public SeismicEpicenter getSeismicEpicenter() {
        return seismicEpicenter;
    }

    public void setSeismicEpicenter(SeismicEpicenter seismicEpicenter) {
        this.seismicEpicenter = seismicEpicenter;
    }

    public SeismicIntensityLowerLimit getSeismicIntensityLowerLimit() {
        return seismicIntensityLowerLimit;
    }

    public void setSeismicIntensityLowerLimit(SeismicIntensityLowerLimit seismicIntensityLowerLimit) {
        this.seismicIntensityLowerLimit = seismicIntensityLowerLimit;
    }

    public SeismicIntensityUpperLimit getSeismicIntensityUpperLimit() {
        return seismicIntensityUpperLimit;
    }

    public void setSeismicIntensityUpperLimit(SeismicIntensityUpperLimit seismicIntensityUpperLimit) {
        this.seismicIntensityUpperLimit = seismicIntensityUpperLimit;
    }

    public List<ForecastRegionEarthquakeEarlyWarning> getForecastRegionEarthquakeEarlyWarning() {
        return forecastRegionEarthquakeEarlyWarning;
    }

    public void setForecastRegionEarthquakeEarlyWarning(List<ForecastRegionEarthquakeEarlyWarning> forecastRegionEarthquakeEarlyWarning) {
        this.forecastRegionEarthquakeEarlyWarning = forecastRegionEarthquakeEarlyWarning;
    }

    @Override
    public String toString() {
        return "{" +
                "    \"EarthquakeEarlyWarning\": {" +
                "        \"prefix\": " + prefix + "," +
                "        \"notification\": " + notification + "," +
                "        \"occurrenceTimeOfEarthquake\": " + occurrenceTimeOfEarthquake + "," +
                "        \"depthOfSeismicEpicenter\": " + depthOfSeismicEpicenter + "," +
                "        \"seismicEpicenter\": " + seismicEpicenter + "," +
                "        \"seismicIntensityLowerLimit\": " + seismicIntensityLowerLimit + "," +
                "        \"seismicIntensityUpperLimit\": " + seismicIntensityUpperLimit + "," +
                "        \"forecastRegionEarthquakeEarlyWarning\": " + forecastRegionEarthquakeEarlyWarning + "," +
                "    }" +
                "}";
    }

    @Override
    public MessageType getMessageType() {
        return prefix.getMessageType();
    }

    @Override
    public DisasterCategory getDisasterCategory() {
        return prefix.getDisasterCategory();
    }
}
