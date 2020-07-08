package jp.ac.aiit.pbl;

import java.time.LocalDateTime;
import java.util.List;

public class Hypocenter {
    private Prefix prefix;
    private List<Notification> notificationOnDisasterPreventions;
    private LocalDateTime occurrenceTimeOfEarthquake;
    private DepthOfHypocenter depthOfHypocenter;
    private Magnitude magnitude;
    private SeismicEpicenter SeismicEpicenter;
    private boolean northLatitude;
    private double latitude;
    private boolean eastLongitude;
    private double longitude;
    //private LatitudeOnLongitude latitudeOnLongitude;
    
    
    //public LatitudeOnLongitude getLatitudeOnLongitude() {
    //    return latitudeOnLongitude;
    //}
    
    //public void setLatitudeOnLongitude(LatitudeOnLongitude latitudeOnLongitude) {
    //    this.latitudeOnLongitude = latitudeOnLongitude;
    //}
    
    
    public boolean isNorthLatitude() {
        return northLatitude;
    }
    
    public void setNorthLatitude(boolean northLatitude) {
        this.northLatitude = northLatitude;
    }
    
    public double getLatitude() {
        return latitude;
    }
    
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    
    public boolean isEastLongitude() {
        return eastLongitude;
    }
    
    public void setEastLongitude(boolean eastLongitude) {
        this.eastLongitude = eastLongitude;
    }
    
    public double getLongitude() {
        return longitude;
    }
    
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    
    public Prefix getPrefix() {
        return prefix;
    }
    
    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }
    
    public void setOccurrenceTimeOfEarthquake(LocalDateTime occurrenceTimeOfEarthquake) {
        this.occurrenceTimeOfEarthquake = occurrenceTimeOfEarthquake;
    }
    
    public LocalDateTime getOccurrenceTimeOfEarthquake() {
        return occurrenceTimeOfEarthquake;
    }
    
    public List<Notification> getNotificationOnDisasterPreventions() {
        return notificationOnDisasterPreventions;
    }
    
    public void setNotificationOnDisasterPreventions(List<Notification> notificationOnDisasterPreventions) {
        this.notificationOnDisasterPreventions = notificationOnDisasterPreventions;
    }
    
    public DepthOfHypocenter getDepthOfHypocenter() {
        return depthOfHypocenter;
    }
    
    public void setDepthOfHypocenter(DepthOfHypocenter depthOfHypocenter) {
        this.depthOfHypocenter = depthOfHypocenter;
    }
    
    public SeismicEpicenter getSeismicEpicenter() {
        return SeismicEpicenter;
    }
    
    public void setSeismicEpicenter(SeismicEpicenter seismicEpicenter) {
        SeismicEpicenter = seismicEpicenter;
    }
    
    public Magnitude getMagnitude() {
        return magnitude;
    }
    
    public void setMagnitude(Magnitude magnitude) {
        this.magnitude = magnitude;
    }
    
    @Override
    public String toString() {
        return "Hypocenter{" +
                "prefix=" + prefix +
                ", notificationOnDisasterPreventions=" + notificationOnDisasterPreventions +
                ", occurrenceTimeOfEarthquake=" + occurrenceTimeOfEarthquake +
                ", depthOfHypocenter=" + depthOfHypocenter +
                ", magnitude=" + magnitude +
                ", SeismicEpicenter=" + SeismicEpicenter +
                ", northLatitude=" + northLatitude +
                ", latitude=" + latitude +
                ", eastLongitude=" + eastLongitude +
                ", longitude=" + longitude +
                '}';
    }
}
