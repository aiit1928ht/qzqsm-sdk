package jp.ac.aiit.pbl;
import java.time.LocalDateTime;
import java.util.List;

public class SeismicIntensity {
    
    private Prefix prefix;
    private LocalDateTime occurrenceTime;
    private List<SeismicIntensityRegion> regions;
    
    
    public List<SeismicIntensityRegion> getRegions() {
        return regions;
    }
    
    public void setRegions(List<SeismicIntensityRegion> regions) {
        this.regions = regions;
    }
    
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
