package jp.ac.aiit.pbl;
import java.time.LocalDateTime;

public class Volcano {

    private LocalDateTime activityTime;                     //Activity Time(Td)Day(D1)  Hour(H1) Minute(M1)
    private WarningCode warningCode;                 //Warning Code(Dw)
    private VolcanoName volcanoName;                        //Volcano Name(Vo)
    private LocalGovernment localGovernmentRegion1;  //Local Government Region1
    private LocalGovernment localGovernmentRegion2;  //Local Government Region2
    private LocalGovernment localGovernmentRegion3;  //Local Government Region3
    private LocalGovernment localGovernmentRegion4;  //Local Government Region4
    private LocalGovernment localGovernmentRegion5;  //Local Government Region5

    public LocalDateTime getActivityTime() {
        return activityTime;
    }
    public void setActivityTime(LocalDateTime activityTime) {
        this.activityTime = activityTime;
    }
    public WarningCode getWarningCode() {
        return warningCode;
    }
    public void setWarningCode(WarningCode warningCode) {
        this.warningCode = warningCode;
    }
    public VolcanoName getVolcanoName() {
        return volcanoName;
    }
    public void setVolcanoName(VolcanoName volcanoName) {
        this.volcanoName = volcanoName;
    }
    public LocalGovernment getLocalGovernmentRegion1() {
        return localGovernmentRegion1;
    }
    public void setLocalGovernmentRegion1(LocalGovernment localGovernmentRegion1) {
        this.localGovernmentRegion1 = localGovernmentRegion1;
    }
    public LocalGovernment getLocalGovernmentRegion2() {
        return localGovernmentRegion2;
    }
    public void setLocalGovernmentRegion2(LocalGovernment localGovernmentRegion2) {
        this.localGovernmentRegion2 = localGovernmentRegion2;
    }
    public LocalGovernment getLocalGovernmentRegion3() {
        return localGovernmentRegion3;
    }
    public void setLocalGovernmentRegion3(LocalGovernment localGovernmentRegion3) {
        this.localGovernmentRegion3 = localGovernmentRegion3;
    }
    public LocalGovernment getLocalGovernmentRegion4() {
        return localGovernmentRegion4;
    }
    public void setLocalGovernmentRegion4(LocalGovernment localGovernmentRegion4) {
        this.localGovernmentRegion4 = localGovernmentRegion4;
    }
    public LocalGovernment getLocalGovernmentRegion5() {
        return localGovernmentRegion5;
    }
    public void setLocalGovernmentRegion5(LocalGovernment localGovernmentRegion5) {
        this.localGovernmentRegion5 = localGovernmentRegion5;
    }
    @Override
    public String toString() {
        return "Volcano{" +
                "activityTime='" + activityTime + '\'' +
                ", warningCode=" + warningCode +
                ", volcanoName=" + volcanoName +
                ", localGovernmentRegion1=" + localGovernmentRegion1 +
                ", localGovernmentRegion2=" + localGovernmentRegion2 +
                ", localGovernmentRegion3=" + localGovernmentRegion3 +
                ", localGovernmentRegion4=" + localGovernmentRegion4 +
                ", localGovernmentRegion5=" + localGovernmentRegion5 + '\'' +
                '}';
    }

}

//    private String preamble;                //Preample(PUB)
//    private String messageType;             //Message Type(MT)
//    private String reportClassification;    //Report Classification (rc) 2: Priority 3: Regular 7: Training/Test
//    private String disasterCategory;        //Disaster Category (dc) 8: 防災気象情報(火山
//    private String reportTimeMonth;         //Month(AtMo) The UTC time when JMA issued the information.(At)
//    private String reportTimeDay;           //Day(AtD)
//    private String reportTimeHour;          //Hour(AtH)
//    private String reportTimeMinute;        //Minute(AtMi)
//    private String informationType;         //Information Type 0: Issue: 発表 1: Correction: 訂正 2: Cancellation: 取消
//    private String Spare1;                  //Spare1 Fix to "0" for spare
//    private String spare2;                  //Spare2
//    private String version;                 //Version number(vn)
//    private String Reserved;
//    private String crc;                     //Cyclic Redundancy Check