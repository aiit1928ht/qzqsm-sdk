package jp.ac.aiit.pbl;
import java.time.LocalDateTime;
import java.util.List;

public class Volcano {
    private Prefix prefix;
    private LocalDateTime activityTime;                     //Activity Time(Td)Day(D1)  Hour(H1) Minute(M1)
    private WarningCode warningCode;                 //Warning Code(Dw)
    private VolcanoName volcanoName;                        //Volcano Name(Vo)
    private List<LocalGovernment> localGovernments;

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

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

    public List<LocalGovernment> getLocalGovernments() {
        return localGovernments;
    }

    public void setLocalGovernments(List<LocalGovernment> localGovernments) {
        this.localGovernments = localGovernments;
    }

    @Override
    public String toString() {
        return "Volcano{" +
                "prefix=" + prefix +
                ", activityTime=" + activityTime +
                ", warningCode=" + warningCode +
                ", volcanoName=" + volcanoName +
                ", localGovernments=" + localGovernments +
                '}';
    }
}



//   private String preamble;                //Preample(PUB)
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