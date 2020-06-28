package jp.ac.aiit.pbl;

import java.util.Arrays;

public enum Warning {
    
    SeismicIntensityLessThan4(1, "震度4未満"),
    SeismicIntensity4(2, "震度4"),
    SeismicIntensity5Lower(3, "震度5弱"),
    SeismicIntensityUpper5(4, "震度5強"),
    SeismicIntensity6Lower(5, "震度6弱"),
    SeismicIntensityUpper6(6, "震度6強"),
    SeismicIntensity7(7, "震度7");
    
    private int code;
    private String seismicIntensity;
    
    private Warning(int code, String seismicIntensity){
        this.code = code;
        this.seismicIntensity = seismicIntensity;
        
    }
    public Integer getCode(){
        return this.code;
    }
    
    public static Warning getSeismicIntensity(int code){
        return Arrays.stream(Warning.values())
                .filter(data -> data.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }
}
