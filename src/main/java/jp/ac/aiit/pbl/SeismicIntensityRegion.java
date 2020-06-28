package jp.ac.aiit.pbl;

public class SeismicIntensityRegion {
    private Warning intensity;
    private Prefecture prefecture;
    
    public Warning getIntensity() {
        return intensity;
    }
    
    public void setIntensity(Warning intensity) {
        this.intensity = intensity;
    }
    
    public Prefecture getPrefecture() {
        return prefecture;
    }
    
    public void setPrefecture(Prefecture prefecture) {
        this.prefecture = prefecture;
    }
}
