package jp.ac.aiit.pbl.disaster.tsunami;

import java.time.LocalDateTime;

public class TsunamiRegion {
    
    private LocalDateTime expectedTsunamiArrivalTime;
    private TsunamiHeight tsunamiHeight;
    private TsunamiForecastRegion tsunamiForecastRegion;
    
    TsunamiRegion(LocalDateTime expectedTsunamiArrivalTime, int tsunamiHeightCode, int tsunamiForecastRegionCode){
        this.expectedTsunamiArrivalTime = expectedTsunamiArrivalTime;
        this.tsunamiForecastRegion = TsunamiForecastRegion.getRegionName(tsunamiForecastRegionCode);
        this.tsunamiHeight = TsunamiHeight.getTsunamiHeight(tsunamiHeightCode);
    }
    
    public TsunamiHeight getTsunamiHeight() {
        return tsunamiHeight;
    }
    
    public TsunamiForecastRegion getTsunamiForecastRegion() {
        return tsunamiForecastRegion;
    }
    
}
