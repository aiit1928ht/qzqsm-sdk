package jp.ac.aiit.pbl;
import java.time.LocalDateTime;
import java.util.List;

public class SeismicIntensity {
    
    private Prefix prefix;
    
    private LocalDateTime occurrenceTime;
    
    private SeismicIntensityRegion warning;
    
    public void setWarning(SeismicIntensityRegion warning) {
        this.warning = warning;
    }
    
    private List<SeismicIntensityRegion> regions;
    
    public List<SeismicIntensityRegion> getRegions() {
        return regions;
    }
    
    public void setRegions(List<SeismicIntensityRegion> regions) {
        this.regions = regions;
    }
    
    
    public List<Warning> warnings;
    
    public List<Warning> getWarnings() {
        return warnings;
    }
    
    public void setWarnings(List<Warning> warnings) {
        this.warnings = warnings;
    }
    
    public List<Prefecture> getPrefectures() {
        return prefectures;
    }
    
    public void setPrefectures(List<Prefecture> prefectures) {
        this.prefectures = prefectures;
    }
    
    public List<Prefecture> prefectures;
    
    public LocalDateTime getOccurrenceTime() {
        return occurrenceTime;
    }
    
    public void setOccurrenceTime(LocalDateTime occurrenceTime) {
        this.occurrenceTime = occurrenceTime;
    }
    
    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }
    
    @Override
    public String toString() {
        return "SeismicIntensity{" +
                "prefix=" + prefix +
                ", occurrenceTime=" + occurrenceTime +
                ", regions=" + regions +
                '}';
    }
}
