package jp.ac.aiit.pbl;

import java.util.List;

public class LatitudeOnLongitude {
    
    private String latitudeNorthSouth;
    private String longitudeEastWest;
    private List<Latitude> latitudes;
    private List<Longtitude> longtitudes;
    
    
    public String getLatitudeNorthSouth() {
        return latitudeNorthSouth;
    }
    
    public void setLatitudeNorthSouth(String latitudeNorthSouth) {
        this.latitudeNorthSouth = latitudeNorthSouth;
    }
    
    public String getLongitudeEastWest() {
        return longitudeEastWest;
    }
    
    public void setLongitudeEastWest(String longitudeEastWest) {
        this.longitudeEastWest = longitudeEastWest;
    }
    
    public List<Latitude> getLatitudes() {
        return latitudes;
    }
    
    public void setLatitudes(List<Latitude> latitudes) {
        this.latitudes = latitudes;
    }
    
    public List<Longtitude> getLongtitudes() {
        return longtitudes;
    }
    
    public void setLongtitudes(List<Longtitude> longtitudes) {
        this.longtitudes = longtitudes;
    }
    
    
    @Override
    public String toString() {
        return "{" +
                "latitudeNorthSouthL=" + latitudeNorthSouth +
                ", latitudes=" + latitudes +
                ", longitudeEastWest=" + longitudeEastWest +
                ", longtitudes=" + longtitudes +
                '}';
    }
}
