package jp.ac.aiit.pbl;

public class Latitude {
    public final int degree;
    public final int minute;
    public final int second;
    
    Latitude(int degree, int minute, int second){
        this.degree = degree;
        this.minute = minute;
        this.second = second;
    }
    
    public int getDegree() {
        return degree;
    }
    
    public int getMinute() {
        return minute;
    }
    
    public int getSecond() {
        return second;
    }
    
}
