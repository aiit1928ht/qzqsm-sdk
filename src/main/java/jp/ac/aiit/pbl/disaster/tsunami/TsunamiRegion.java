package jp.ac.aiit.pbl.disaster.tsunami;

import java.time.LocalDateTime;

public class TsunamiRegion {
    
    private LocalDateTime issueDate;
    private int day;
    private int hour;
    private int minute;
    private LocalDateTime expectedArrivalDate;
    private TsunamiHeight tsunamiHeight;
    private TsunamiForecastRegion tsunamiForecastRegion;
    
    TsunamiRegion(LocalDateTime issueDate, int day, int hour, int minute, int tsunamiHeightCode, int tsunamiForecastRegionCode){
        this.issueDate = issueDate;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.tsunamiForecastRegion = TsunamiForecastRegion.getRegionName(tsunamiForecastRegionCode);
        this.tsunamiHeight = TsunamiHeight.getTsunamiHeight(tsunamiHeightCode);
        this.expectedArrivalDate = LocalDateTime.of(getIssueDate().getYear(),getIssueDate().getMonth(),getIssueDate().getDayOfMonth(),hour,minute);
    }
    
    public TsunamiHeight getTsunamiHeight() {
        return tsunamiHeight;
    }
    
    public TsunamiForecastRegion getTsunamiForecastRegion() {
        return tsunamiForecastRegion;
    }
    
    public LocalDateTime getIssueDate(){
        if(this.day == 0){
            return issueDate;
        }else{
            return issueDate.plusDays(1);
        }
    }
    
    public void setIssueDate(LocalDateTime issueDate) {
        this.issueDate = issueDate;
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
