package jp.ac.aiit.pbl.disaster.seismicIntensity;

public class SeismicIntensityRegion {
    private Warning warning;
    private Prefecture prefecture;
    
    SeismicIntensityRegion(int warnigCode, int prefectureCode){
        this.warning = Warning.getSeismicIntensity(warnigCode);
        this.prefecture = Prefecture.getRegionName(prefectureCode);
    }
    
    public Prefecture getPrefecture() {
        return prefecture;
    }
    
    public Warning getWarning() {
        return warning;
    }
    
    @Override
    public String toString() {
        return "SeismicIntensityRegion{" +
                "warning=" + warning +
                ", prefecture=" + prefecture +
                '}';
    }
}
