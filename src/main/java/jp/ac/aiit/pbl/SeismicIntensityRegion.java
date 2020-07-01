package jp.ac.aiit.pbl;

import java.util.ArrayList;
import java.util.List;

public class SeismicIntensityRegion {
    private Warning intensity;
    //private Prefecture prefecture;
    private List<Warning> warningList;
    private List<Prefecture> prefectureList;
    private List<SeismicIntensityRegion> regions;
    
    
    //public Warning getIntensity() {
    //    return intensity;
    //}
    
    public void setIntensity(Warning intensity) {
        this.intensity = intensity;
    }
    
    //public Prefecture getPrefecture() {
    //    return prefecture;
    //}
    
    //public void setPrefecture(Prefecture prefecture) {
    //    this.prefecture = prefecture;
    //}
    
    public List<Warning> getWarningList() {
        return warningList;
    }
    
    public void setWarningList(List<Warning> warningList) {
        this.warningList = warningList;
    }
    
    public List<Prefecture> getPrefectureList() {
        return prefectureList;
    }
    
    public void setPrefectureList(List<Prefecture> prefectureList) {
        this.prefectureList = prefectureList;
    }
    
    public List<SeismicIntensityRegion> getRegions() {
        return regions;
    }
    
    public void setRegions(List<SeismicIntensityRegion> regions) {
        this.regions = regions;
    }
    
    
    @Override
    public String toString() {
        return "{" +
                "warning=" + warningList +
                ", prefecture=" + prefectureList +
                '}';
    }
}
