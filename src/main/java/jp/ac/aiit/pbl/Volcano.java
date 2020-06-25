package jp.ac.aiit.pbl;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Volcano {

    private LocalDateTime activityTime;                     //Activity Time(Td)Day(D1)  Hour(H1) Minute(M1)
    private VolcanoWarningCode warningCode;                 //Warning Code(Dw)
    private VolcanoName volcanoName;                        //Volcano Name(Vo)
    private VolcanoLocalGovernment localGovernmentRegion1;  //Local Government Region1
    private VolcanoLocalGovernment localGovernmentRegion2;  //Local Government Region2
    private VolcanoLocalGovernment localGovernmentRegion3;  //Local Government Region3
    private VolcanoLocalGovernment localGovernmentRegion4;  //Local Government Region4
    private VolcanoLocalGovernment localGovernmentRegion5;  //Local Government Region5

    public LocalDateTime getActivityTime() {
        return activityTime;
    }
    public void setActivityTime(LocalDateTime activityTime) {
        this.activityTime = activityTime;
    }
    public VolcanoWarningCode getWarningCode() {
        return warningCode;
    }
    public void setWarningCode(VolcanoWarningCode warningCode) {
        this.warningCode = warningCode;
    }
    public VolcanoName getVolcanoName() {
        return volcanoName;
    }
    public void setVolcanoName(VolcanoName volcanoName) {
        this.volcanoName = volcanoName;
    }
    public VolcanoLocalGovernment getLocalGovernmentRegion1() {
        return localGovernmentRegion1;
    }
    public void setLocalGovernmentRegion1(VolcanoLocalGovernment localGovernmentRegion1) {
        this.localGovernmentRegion1 = localGovernmentRegion1;
    }
    public VolcanoLocalGovernment getLocalGovernmentRegion2() {
        return localGovernmentRegion2;
    }
    public void setLocalGovernmentRegion2(VolcanoLocalGovernment localGovernmentRegion2) {
        this.localGovernmentRegion2 = localGovernmentRegion2;
    }
    public VolcanoLocalGovernment getLocalGovernmentRegion3() {
        return localGovernmentRegion3;
    }
    public void setLocalGovernmentRegion3(VolcanoLocalGovernment localGovernmentRegion3) {
        this.localGovernmentRegion3 = localGovernmentRegion3;
    }
    public VolcanoLocalGovernment getLocalGovernmentRegion4() {
        return localGovernmentRegion4;
    }
    public void setLocalGovernmentRegion4(VolcanoLocalGovernment localGovernmentRegion4) {
        this.localGovernmentRegion4 = localGovernmentRegion4;
    }
    public VolcanoLocalGovernment getLocalGovernmentRegion5() {
        return localGovernmentRegion5;
    }
    public void setLocalGovernmentRegion5(VolcanoLocalGovernment localGovernmentRegion5) {
        this.localGovernmentRegion5 = localGovernmentRegion5;
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