package jp.ac.aiit.pbl;

public class Latitude {
    public final int latitudeDegree;
    public final int latitudeMinute;
    public final int latitudeSecond;
    
    Latitude(int latitudeDegree, int latitudeMinute, int latitudeSecond){
        this.latitudeDegree = latitudeDegree;
        this.latitudeMinute = latitudeMinute;
        this.latitudeSecond = latitudeSecond;
    }
    
    public int getLatitudeDegree() {
        return latitudeDegree;
    }
    
    public int getLatitudeMinute() {
        return latitudeMinute;
    }
    
    public int getLatitudeSecond() {
        return latitudeSecond;
    }
}
