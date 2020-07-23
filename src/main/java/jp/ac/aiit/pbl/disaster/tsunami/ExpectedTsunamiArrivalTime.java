package jp.ac.aiit.pbl.disaster.tsunami;

import java.time.LocalDateTime;

public class ExpectedTsunamiArrivalTime {
    
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
    
}
