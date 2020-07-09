package jp.ac.aiit.pbl.disaster.seismicIntensity;
import jp.ac.aiit.pbl.*;

import java.time.LocalDateTime;
import java.util.List;

/*
This class holds the converted information about the SeismicIntensity of the signals received from QZSS.
This class holds seismic intensity and area name in 16 areas.
 */

public class SeismicIntensity implements Disaster {
    
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
    
    @Override
    public MessageType getMessageType() {
        return null;
    }
    
    @Override
    public DisasterCategory getDisasterCategory() {
        return null;
    }
}
