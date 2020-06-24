package jp.ac.aiit.pbl;

//import java.time.LocalDate;

public class Volcano {
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
    private String activityTime;            //Activity Time(Td)Day(D1)  Hour(H1) Minute(M1)
    private String warningCode;             //Warning Code(Dw)
    private String volcanoName;             //Volcano Name(Vo)
    private String localGovernmentRegion1; //Local Government Region1
    private String localGovernmentRegion2; //Local Government Region2
    private String localGovernmentRegion3; //Local Government Region3
    private String localGovernmentRegion4; //Local Government Region4
    private String localGovernmentRegion5; //Local Government Region5
    private String spare2;                  //Spare2
    private String version;                 //Version number(vn)
    private String Reserved;
    private String crc;                     //Cyclic Redundancy Check


    public String getActivityTime() {
        return activityTime;
    }
    public void setActivityTime(String activityTime) {
        this.activityTime = activityTime;
    }
    public String getWarningCode() {
        return warningCode;
    }
    public void setWarningCode(String warningCode) {
        this.warningCode = warningCode;
    }
    public String getVolcanoName() {
        return volcanoName;
    }
    public void setVolcanoName(String volcanoName) {
        this.volcanoName = volcanoName;
    }
    public String getLocalGovernmentRegion1() {
        return localGovernmentRegion1;
    }
    public void setLocalGovernmentRegion1(String localGovernmentRegion1) {
        this.localGovernmentRegion1 = localGovernmentRegion1;
    }
    public String getLocalGovernmentRegion2() {
        return localGovernmentRegion2;
    }
    public void setLocalGovernmentRegion2(String localGovernmentRegion2) {
        this.localGovernmentRegion2 = localGovernmentRegion2;
    }
    public String getLocalGovernmentRegion3() {
        return localGovernmentRegion3;
    }
    public void setLocalGovernmentRegion3(String localGovernmentRegion3) {
        this.localGovernmentRegion3 = localGovernmentRegion3;
    }
    public String getLocalGovernmentRegion4() {
        return localGovernmentRegion4;
    }
    public void setLocalGovernmentRegion4(String localGovernmentRegion4) {
        this.localGovernmentRegion4 = localGovernmentRegion4;
    }
    public String getLocalGovernmentRegion5() {
        return localGovernmentRegion5;
    }
    public void setLocalGovernmentRegion5(String localGovernmentRegion5) {
        this.localGovernmentRegion5 = localGovernmentRegion5;
    }
    public String getSpare2() {
        return spare2;
    }
    public void setSpare2(String spare2) {
        this.spare2 = spare2;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getReserved() {
        return Reserved;
    }
    public void setReserved(String reserved) {
        Reserved = reserved;
    }
    public String getCrc() {
        return crc;
    }
    public void setCrc(String crc) {
        this.crc = crc;
    }
}
