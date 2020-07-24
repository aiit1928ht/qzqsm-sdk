package jp.ac.aiit.pbl.disaster.tsunami;

import java.time.LocalDateTime;

public class TsunamiRegion {
    
    private LocalDateTime expectedArrivalDate;
    private TsunamiHeight tsunamiHeight;
    private TsunamiForecastRegion tsunamiForecastRegion;
    
    TsunamiRegion(LocalDateTime reportTime, int day, int hour, int minute, int tsunamiHeightCode, int tsunamiForecastRegionCode){
        this.expectedArrivalDate = getReachTimeToRegion(reportTime, day, hour, minute);
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
    
    public LocalDateTime getReachTimeToRegion(LocalDateTime reportTime, int day, int hour, int minute){
        LocalDateTime issueDate;
        int year = reportTime.getYear();
        issueDate = reportTime.plusDays(day);
        
        if (hour == 31){
            year = 9999;
            hour = 0;
            minute = 0;
        }
        if (minute == 63){
            year = 9999;
            hour = 0;
            minute = 0;
        }
        return LocalDateTime.of(year, issueDate.getMonth(), issueDate.getDayOfMonth(),hour , minute);
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
