package jp.ac.aiit.pbl.disaster.tsunami;

import java.time.LocalDateTime;

public class TsunamiRegion {
    
    private LocalDateTime expectedArrivalDate;
    private TsunamiHeight tsunamiHeight;
    private TsunamiForecastRegion tsunamiForecastRegion;
    
    TsunamiRegion(LocalDateTime expectedArrivalDate, int tsunamiHeightCode, int tsunamiForecastRegionCode){
        this.expectedArrivalDate = expectedArrivalDate;
        this.tsunamiForecastRegion = TsunamiForecastRegion.getRegionName(tsunamiForecastRegionCode);
        this.tsunamiHeight = TsunamiHeight.getTsunamiHeight(tsunamiHeightCode);
    }
    
    public TsunamiHeight getTsunamiHeight() {
        return tsunamiHeight;
    }
    
    public TsunamiForecastRegion getTsunamiForecastRegion() {
        return tsunamiForecastRegion;
    }
    
    public LocalDateTime getExpectedArrivalDate() {
        return expectedArrivalDate;
    }
    
    @Override
    public String toString() {
        return "{" +
                "expectedArrivalDate=" + expectedArrivalDate +
                ", tsunamiHeight=" + tsunamiHeight +
                ", tsunamiForecastRegion=" + tsunamiForecastRegion +
                '}';
    }
}
