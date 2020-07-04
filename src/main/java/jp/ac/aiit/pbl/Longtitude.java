package jp.ac.aiit.pbl;

public class Longtitude {
    public final int longtitudeDegree;
    public final int longtitudeMinute;
    public final int longtitudeSecond;
    
    Longtitude(int longtitudeDegree, int longtitudeMinute, int longtitudeSecond){
        this.longtitudeDegree = longtitudeDegree;
        this.longtitudeMinute = longtitudeMinute;
        this.longtitudeSecond = longtitudeSecond;
    }
    
    public int getLongtitudeDegree() {
        return longtitudeDegree;
    }
    
    public int getLongtitudeMinute() {
        return longtitudeMinute;
    }
    
    public int getLongtitudeSecond() {
        return longtitudeSecond;
    }
}
