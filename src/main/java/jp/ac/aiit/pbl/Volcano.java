package jp.ac.aiit.pbl;

//import java.time.LocalDate;

public class Volcano {

    private String preamble;                //Preample(PUB)
    private String messageType;             //Message Type(MT)
    private String reportClassification;    //Report Classification (rc) 2: Priority 3: Regular 7: Training/Test
    private String disasterCategory;        //Disaster Category (dc) 8: 防災気象情報(火山
    private String reportTimeMonth;         //Month(AtMo) The UTC time when JMA issued the information.(At)
    private String reportTimeDay;           //Day(AtD)
    private String reportTimeHour;          //Hour(AtH)
    private String reportTimeMinute;        //Minute(AtMi)
    //private LocalDate reportTime;
    private String informationType;         //Information Type 0: Issue: 発表 1: Correction: 訂正 2: Cancellation: 取消
    private String Spare1;                  //Spare1 Fix to "0" for spare
    private String activityTimeDay;         //Day(D1) Activity Time(Td)
    private String activityTimeHour;        //Hour(H1)
    private String activityTimeMinute;      //Minute(M1)
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

    // public void setDate(){
   //     this.reportTime= new LocalDate(2020,1,1,);
   // }
}
