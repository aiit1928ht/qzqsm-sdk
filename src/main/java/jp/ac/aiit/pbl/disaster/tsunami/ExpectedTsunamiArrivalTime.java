package jp.ac.aiit.pbl.disaster.tsunami;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExpectedTsunamiArrivalTime {
    private LocalDateTime issueDate;
    private int day;
    private int hour;
    private int minute;
    private LocalDateTime hasseibi;
    
    public ExpectedTsunamiArrivalTime(LocalDateTime issueDate, int day, int hour, int minute){
        this.issueDate = issueDate;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.hasseibi = LocalDateTime.of(getIssueDate().getYear(),getIssueDate().getMonth(),getIssueDate().getDayOfMonth(),hour,minute);
    }
    
    public LocalDateTime getIssueDate(){
        if(this.day == 0){
            return issueDate;
        }else{
            return issueDate.plusDays(1);
        }
    }
    
    public int getDay() {
        return day;
    }
    
    public void setDay(int day) {
        this.day = day;
    }
    
    public int getHour() {
        return hour;
    }
    
    public void setHour(int hour) {
        this.hour = hour;
    }
    
    public int getMinute() {
        return minute;
    }
    
    public void setMinute(int minute) {
        this.minute = minute;
    }
    
    public void setIssueDate(LocalDateTime issueDate) {
        this.issueDate = issueDate;
    }
    
    public LocalDateTime getHasseibi() {
        return hasseibi;
    }
    
    public void setHasseibi(LocalDateTime hasseibi) {
        this.hasseibi = hasseibi;
    }
}
