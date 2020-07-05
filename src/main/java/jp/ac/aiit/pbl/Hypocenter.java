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
    private NorthSouthLatitude latitudeNorthSouth;
    private List<Latitude> Latitude;
    private EastWestLongitude longitudeEastWest;
    private List<Longtitude> Longitude;
    
    
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
    
    public NorthSouthLatitude getLatitudeNorthSouth() {
        return latitudeNorthSouth;
    }
    
    public void setLatitudeNorthSouth(NorthSouthLatitude latitudeNorthSouth) {
        this.latitudeNorthSouth = latitudeNorthSouth;
    }
    
    public List<Latitude> getLatitude() {
        return Latitude;
    }
    
    public void setLatitude(List<Latitude> latitude) {
        Latitude = latitude;
    }
    
    public EastWestLongitude getLongitudeEastWest() {
        return longitudeEastWest;
    }
    
    public void setLongitudeEastWest(EastWestLongitude longitudeEastWest) {
        this.longitudeEastWest = longitudeEastWest;
    }
    
    public List<Longtitude> getLongitude() {
        return Longitude;
    }
    
    public void setLongitude(List<Longtitude> longitude) {
        Longitude = longitude;
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
                ", latitudeNorthSouth=" + latitudeNorthSouth +
                ", Latitude=" + Latitude +
                ", longitudeEastWest=" + longitudeEastWest +
                ", Longitude=" + Longitude +
                '}';
    }
}
