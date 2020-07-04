package jp.ac.aiit.pbl;

import java.time.LocalDateTime;
import java.util.List;

public class Hypocenter {
    private Prefix prefix;
    private LocalDateTime occurrenceTime;
    private List<Notification> notifications;
    private Integer depthOfHypocenter;
    private Integer magnitude;
    private Epicenter SeismicEpicenter;
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
    
    public void setOccurrenceTime(LocalDateTime occurrenceTime) {
        this.occurrenceTime = occurrenceTime;
    }
    
    public LocalDateTime getOccurrenceTime() {
        return occurrenceTime;
    }
    
    public List<Notification> getNotifications() {
        return notifications;
    }
    
    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }
    
    public Integer getDepthOfHypocenter() {
        return depthOfHypocenter;
    }
    
    public void setDepthOfHypocenter(Integer depthOfHypocenter) {
        this.depthOfHypocenter = depthOfHypocenter;
    }
    
    public Integer getMagnitude() {
        return magnitude;
    }
    
    public void setMagnitude(Integer magnitude) {
        this.magnitude = magnitude;
    }
    
    public Epicenter getSeismicEpicenter() {
        return SeismicEpicenter;
    }
    
    public void setSeismicEpicenter(Epicenter seismicEpicenter) {
        SeismicEpicenter = seismicEpicenter;
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
}
