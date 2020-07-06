package jp.ac.aiit.pbl;

public class Latitude {
    private double degree;
    private double minute;
    private double second;
    
    Latitude(double degree, double minute, double second){
        this.degree = degree;
        this.minute = minute;
        this.second = second;
    }
    
    public double getDegree() {
        return degree;
    }
    
    public double getMinute() {
        return minute;
    }
    
    public double getSecond() {
        return second;
    }
    
    @Override
    public String toString() {
        return "{" +
                "degree=" + degree +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}

