package jp.ac.aiit.pbl;

public class Magnitude {
    private int magunitude;
    
    Magnitude(int magunitude){
        this.magunitude = magunitude;
    }
    
    public int getMagunitude() {
        return magunitude;
    }
    
    @Override
    public String toString() {
        return "{" +
                "magunitude=" + magunitude +
                '}';
    }
}
