package jp.ac.aiit.pbl;

public enum SeismicIntensityWarningCode {
    
    SeismicIntensityLessThan4(1, "震度4未満"),
    SeismicIntensity4(2, "震度4"),
    SeismicIntensity5Lower(3, "震度5弱"),
    SeismicIntensityUpper5(4, "震度5強"),
    SeismicIntensity6Lower(5, "震度6弱"),
    SeismicIntensityUpper6(6, "震度6強"),
    SeismicIntensity7(7, "震度7");
    
    private int code;
    private String seismicIntensity;
    
    private SeismicIntensityWarningCode(int code, String seismicIntensity){
        this.code = code;
        this.seismicIntensity = seismicIntensity;
        
    }
    public int getCode(){
        return this.code;
    }
    public static SeismicIntensityWarningCode getSeismicIntensity(int code){
        switch (code) {
            case 1:
                return SeismicIntensityLessThan4;
            case 2:
                return SeismicIntensity4;
            case 3:
                return SeismicIntensity5Lower;
            case 4:
                return SeismicIntensityUpper5;
            case 5:
                return SeismicIntensity6Lower;
            case 6:
                return SeismicIntensityUpper6;
            case 7:
                return SeismicIntensity7;
        }
        return null;
    }
}
