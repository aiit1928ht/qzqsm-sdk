package jp.ac.aiit.pbl;

import java.util.List;

public class LatitudeOnLongitude {
    private NorthSouthLatitude northSouthLatitude;
    private EastWestLongitude eastWestLongitude;
    private List<Latitude> latitudes;
    private List<Longtitude> longtitudes;
    
    LatitudeOnLongitude(int northSouthLatitude, int eastWestLongitude){
        this.northSouthLatitude = NorthSouthLatitude.getByCode(northSouthLatitude);
        this.eastWestLongitude = EastWestLongitude.getByCode(eastWestLongitude);
    }
    
    public NorthSouthLatitude getNorthSouthLatitude() {
        return northSouthLatitude;
    }
    
    public void setNorthSouthLatitude(NorthSouthLatitude northSouthLatitude) {
        this.northSouthLatitude = northSouthLatitude;
    }
    
    public EastWestLongitude getEastWestLongitude() {
        return eastWestLongitude;
    }
    
    public void setEastWestLongitude(EastWestLongitude eastWestLongitude) {
        this.eastWestLongitude = eastWestLongitude;
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
                "NorthLatitude/SouthLatitude=" + northSouthLatitude +
                ", latitudes=" + latitudes +
                ", EastLongitude/WestLongitude=" + eastWestLongitude +
                ", longtitudes=" + longtitudes +
                '}';
    }
}
