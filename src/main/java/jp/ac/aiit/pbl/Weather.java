package jp.ac.aiit.pbl;

import org.json.JSONObject;

import java.time.LocalDateTime;

public class Weather {
    public Weather(String qzqsm) {
        this.rowData = new JSONObject();
        this.rowData.put("pab", qzqsm.substring(0,9));
        this.rowData.put("messageType", qzqsm.substring(8,14));
        this.rowData.put("reportClassification", qzqsm.substring(14, 17));
        this.rowData.put("disasterCategory", qzqsm.substring(17, 21));
        this.rowData.put("reportTime", qzqsm.substring(21, 41));
        this.rowData.put("infoType", qzqsm.substring(41, 43));
        this.rowData.put("spare1", qzqsm.substring(43, 53));
        this.rowData.put("warningState", qzqsm.substring(53, 56));
        this.rowData.put("DisasterSubCategoryRegion1", qzqsm.substring(56, 61));
        this.rowData.put("PrefecturalForecastRegionRegion1", qzqsm.substring(61, 80));
        this.rowData.put("DisasterSubCategoryRegion2", qzqsm.substring(80, 85));
        this.rowData.put("PrefecturalForecastRegionRegion2", qzqsm.substring(85, 104));
        this.rowData.put("DisasterSubCategoryRegion3", qzqsm.substring(104, 109));
        this.rowData.put("PrefecturalForecastRegionRegion3", qzqsm.substring(109, 128));
        this.rowData.put("DisasterSubCategoryRegion4", qzqsm.substring(128, 133));
        this.rowData.put("PrefecturalForecastRegionRegion4", qzqsm.substring(133, 152));
        this.rowData.put("DisasterSubCategoryRegion5", qzqsm.substring(152, 157));
        this.rowData.put("PrefecturalForecastRegionRegion5", qzqsm.substring(157, 176));
        this.rowData.put("DisasterSubCategoryRegion6", qzqsm.substring(176, 181));
        this.rowData.put("PrefecturalForecastRegionRegion6", qzqsm.substring(181, 200));
        this.rowData.put("spare2", qzqsm.substring(200, 214));
        this.rowData.put("versionNumber", qzqsm.substring(214, 220));
        this.rowData.put("reserved", qzqsm.substring(220, 226));
        this.rowData.put("crc", qzqsm.substring(226, 250));

        this.decodedData = new JSONObject();
        this.decodedData.put("pab", Integer.parseInt((String) this.rowData.get("pab"), 2));
        this.decodedData.put("messageType", Integer.parseInt((String) this.rowData.get("messageType"), 2));
        this.decodedData.put("reportClassification", Integer.parseInt((String) this.rowData.get("reportClassification"), 2));
        this.decodedData.put("disasterCategory", Integer.parseInt((String) this.rowData.get("disasterCategory"), 2));
        this.decodedData.put("reportTime", Integer.parseInt((String) this.rowData.get("reportTime"), 2));
        this.decodedData.put("infoType", Integer.parseInt((String) this.rowData.get("infoType"), 2));
        this.decodedData.put("warningState", Integer.parseInt((String) this.rowData.get("warningState"), 2));
        this.decodedData.put("DisasterSubCategoryRegion1", Integer.parseInt((String) this.rowData.get("DisasterSubCategoryRegion1"), 2));
        this.decodedData.put("PrefecturalForecastRegionRegion1", Integer.parseInt((String) this.rowData.get("PrefecturalForecastRegionRegion1"), 2));
        this.decodedData.put("DisasterSubCategoryRegion2", Integer.parseInt((String) this.rowData.get("DisasterSubCategoryRegion2"), 2));
        this.decodedData.put("PrefecturalForecastRegionRegion2", Integer.parseInt((String) this.rowData.get("PrefecturalForecastRegionRegion2"), 2));
        this.decodedData.put("DisasterSubCategoryRegion3", Integer.parseInt((String) this.rowData.get("DisasterSubCategoryRegion3"), 2));
        this.decodedData.put("PrefecturalForecastRegionRegion3", Integer.parseInt((String) this.rowData.get("PrefecturalForecastRegionRegion3"), 2));
        this.decodedData.put("DisasterSubCategoryRegion4", Integer.parseInt((String) this.rowData.get("DisasterSubCategoryRegion4"), 2));
        this.decodedData.put("PrefecturalForecastRegionRegion4", Integer.parseInt((String) this.rowData.get("PrefecturalForecastRegionRegion4"), 2));
        this.decodedData.put("DisasterSubCategoryRegion5", Integer.parseInt((String) this.rowData.get("DisasterSubCategoryRegion5"), 2));
        this.decodedData.put("PrefecturalForecastRegionRegion5", Integer.parseInt((String) this.rowData.get("PrefecturalForecastRegionRegion5"), 2));
        this.decodedData.put("DisasterSubCategoryRegion6", Integer.parseInt((String) this.rowData.get("DisasterSubCategoryRegion6"), 2));
        this.decodedData.put("PrefecturalForecastRegionRegion6", Integer.parseInt((String) this.rowData.get("PrefecturalForecastRegionRegion6"), 2));
        
        
    }

    private JSONObject rowData;
    private JSONObject decodedData;

    private String pab;
    private String messageType;
    private String reportClassification;
    private String disasterCategory;
    private LocalDateTime reportTime;
    private String infoType;
    private String warningState;
    private String DisasterSubCategoryRegion1;
    private String PrefecturalForecastRegionRegion1;
    private String DisasterSubCategoryRegion2;
    private String PrefecturalForecastRegionRegion2;
    private String DisasterSubCategoryRegion3;
    private String PrefecturalForecastRegionRegion3;
    private String DisasterSubCategoryRegion4;
    private String PrefecturalForecastRegionRegion4;
    private String DisasterSubCategoryRegion5;
    private String PrefecturalForecastRegionRegion5;
    private String DisasterSubCategoryRegion6;
    private String PrefecturalForecastRegionRegion6;

    public String getPab() {
        return pab;
    }

    public String getMessageType() {
        return messageType;
    }

    public String getReportClassification() {
        return reportClassification;
    }

    public String getDisasterCategory() {
        return disasterCategory;
    }

    public LocalDateTime getReportTime() {
        return reportTime;
    }

    public String getInfoType() {
        return infoType;
    }

    public String getWarningState() {
        return warningState;
    }

    public String getDisasterSubCategoryRegion1() {
        return DisasterSubCategoryRegion1;
    }

    public String getPrefecturalForecastRegionRegion1() {
        return PrefecturalForecastRegionRegion1;
    }

    public String getDisasterSubCategoryRegion2() {
        return DisasterSubCategoryRegion2;
    }

    public String getPrefecturalForecastRegionRegion2() {
        return PrefecturalForecastRegionRegion2;
    }

    public String getDisasterSubCategoryRegion3() {
        return DisasterSubCategoryRegion3;
    }

    public String getPrefecturalForecastRegionRegion3() {
        return PrefecturalForecastRegionRegion3;
    }

    public String getDisasterSubCategoryRegion4() {
        return DisasterSubCategoryRegion4;
    }

    public String getPrefecturalForecastRegionRegion4() {
        return PrefecturalForecastRegionRegion4;
    }

    public String getDisasterSubCategoryRegion5() {
        return DisasterSubCategoryRegion5;
    }

    public String getPrefecturalForecastRegionRegion5() {
        return PrefecturalForecastRegionRegion5;
    }

    public String getDisasterSubCategoryRegion6() {
        return DisasterSubCategoryRegion6;
    }

    public String getPrefecturalForecastRegionRegion6() {
        return PrefecturalForecastRegionRegion6;
    }

    
    enum Pab {
    }

    enum Mt {
        TestMode,
        MT43,
        MT44
    }

    enum Rc {

    }

    enum Dc {

    }

    enum At {

    }

    enum It {

    }

    enum Ar {

    }

    enum Ww {

    }

    enum Pl {

    }
}
