package jp.ac.aiit.pbl;

public enum SeismicIntensityMessage {
    
    SeismicIntensityLessThan4(1, "Seismic Intensity Less than 4"),
    SeismicIntensity4(2, "Seismic Intensity 4"),
    SeismicIntensity5Lower(3, "Seismic Intensity 5 Lower"),
    SeismicIntensityUpper5(4, "Seismic Intensity Upper 5"),
    SeismicIntensity6Lower(5, "Seismic Intensity 6 Lower"),
    SeismicIntensityUpper6(6, "Seismic Intensity Upper 6"),
    SeismicIntensity7(7, "Seismic Intensity 7");
    
    private int seismicIntensityCode;
    private String seismicIntensityMessage;
    
    private SeismicIntensityMessage(int seismicIntensityCode, String seismicIntensityMessage){
        this.seismicIntensityCode = seismicIntensityCode;
        this.seismicIntensityMessage = seismicIntensityMessage;
        
    }
    public int getSeismicIntensityCode(){
        return this.seismicIntensityCode;
    }
    public static SeismicIntensityMessage getMessage(int seismicIntensityCode){
        switch (seismicIntensityCode) {
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
