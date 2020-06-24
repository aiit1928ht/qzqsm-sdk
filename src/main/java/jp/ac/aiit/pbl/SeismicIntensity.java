package jp.ac.aiit.pbl;

public class SeismicIntensity {
    // Preamble
    private String preamble;
    // Message Type
    private String messageTypeID;
    // 通報区分
    private String reportClassification;
    // 災害種別コード
    private String disasterCategory;
    // 発表時刻
    private String reportTimeMonth;
    // 発表時刻
    private String reportTimeDay;
    // 発表時刻
    private String reportTimeHour;
    // 発表時刻
    private String reportTimeMinute;
    // 情報形態
    private String informationType;
    // 予備１
    private String spare1;
    // 地震の発生時刻
    private String occurrenceTimeOfEarthquakeDay;
    // 地震の発生時刻
    private String occurrenceTimeOfEarthquakeHour;
    // 地震の発生時刻
    private String occurrenceTimeOfEarthquakeMinute;
    // 震度(地点1)
    private SeismicIntensityMessage seismicIntensityRegion1;
    // 都道府県(地点1)
    private PrefectureCode prefectureRegion1;
    // 震度(地点2)
    private SeismicIntensityMessage seismicIntensityRegion2;
    // 都道府県(地点2)
    private PrefectureCode prefectureRegion2;
    // 震度(地点3)
    private SeismicIntensityMessage seismicIntensityRegion3;
    // 都道府県(地点3)
    private PrefectureCode prefectureRegion3;
    // 震度(地点4)
    private SeismicIntensityMessage seismicIntensityRegion4;
    // 都道府県(地点4)
    private PrefectureCode prefectureRegion4;
    // 震度(地点5)
    private SeismicIntensityMessage seismicIntensityRegion5;
    // 都道府県(地点5)
    private PrefectureCode prefectureRegion5;
    // 震度(地点6)
    private SeismicIntensityMessage seismicIntensityRegion6;
    // 都道府県(地点6)
    private PrefectureCode prefectureRegion6;
    // 震度(地点7)
    private SeismicIntensityMessage seismicIntensityRegion7;
    // 都道府県(地点7)
    private PrefectureCode prefectureRegion7;
    // 震度(地点8)
    private SeismicIntensityMessage seismicIntensityRegion8;
    // 都道府県(地点8)
    private PrefectureCode prefectureRegion8;
    // 震度(地点9)
    private SeismicIntensityMessage seismicIntensityRegion9;
    // 都道府県(地点9)
    private PrefectureCode prefectureRegion9;
    // 震度(地点10)
    private SeismicIntensityMessage seismicIntensityRegion10;
    // 都道府県(地点10)
    private PrefectureCode prefectureRegion10;
    // 震度(地点11)
    private SeismicIntensityMessage seismicIntensityRegion11;
    // 都道府県(地点11)
    private PrefectureCode prefectureRegion11;
    // 震度(地点12)
    private SeismicIntensityMessage seismicIntensityRegion12;
    // 都道府県(地点12)
    private PrefectureCode prefectureRegion12;
    // 震度(地点13)
    private SeismicIntensityMessage seismicIntensityRegion13;
    // 都道府県(地点13)
    private PrefectureCode prefectureRegion13;
    // 震度(地点14)
    private SeismicIntensityMessage seismicIntensityRegion14;
    // 都道府県(地点14)
    private PrefectureCode prefectureRegion14;
    // 震度(地点15)
    private SeismicIntensityMessage seismicIntensityRegion15;
    // 都道府県(地点15)
    private PrefectureCode prefectureRegion15;
    // 震度(地点16)
    private SeismicIntensityMessage seismicIntensityRegion16;
    // 都道府県(地点16)
    private PrefectureCode prefectureRegion16;
    // 予備2
    private String spare2;
    // バージョン番号
    private String versionNumber;
    // 予約領域
    private String reserved;
    // Cyclic Redundancy Check
    private String crc;
    
    public void setPreamble(String preamble) {
        this.preamble = preamble;
    }
    
    public void setMessageTypeID(String messageTypeID) {
        this.messageTypeID = messageTypeID;
    }
    
    public void setReportClassification(String reportClassification) {
        this.reportClassification = reportClassification;
    }
    
    public void setDisasterCategory(String disasterCategory) {
        this.disasterCategory = disasterCategory;
    }
    
    public void setReportTimeMonth(String reportTimeMonth) {
        this.reportTimeMonth = reportTimeMonth;
    }
    
    public void setReportTimeDay(String reportTimeDay) {
        this.reportTimeDay = reportTimeDay;
    }
    
    public void setReportTimeHour(String reportTimeHour) {
        this.reportTimeHour = reportTimeHour;
    }
    
    public void setReportTimeMinute(String reportTimeMinute) {
        this.reportTimeMinute = reportTimeMinute;
    }
    
    public void setInformationType(String informationType) {
        this.informationType = informationType;
    }
    
    public void setSpare1(String spare1) {
        this.spare1 = spare1;
    }
    
    public void setOccurrenceTimeOfEarthquakeDay(String occurrenceTimeOfEarthquakeDay) {
        this.occurrenceTimeOfEarthquakeDay = occurrenceTimeOfEarthquakeDay;
    }
    
    public void setOccurrenceTimeOfEarthquakeHour(String occurrenceTimeOfEarthquakeHour) {
        this.occurrenceTimeOfEarthquakeHour = occurrenceTimeOfEarthquakeHour;
    }
    
    public void setOccurrenceTimeOfEarthquakeMinute(String occurrenceTimeOfEarthquakeMinute) {
        this.occurrenceTimeOfEarthquakeMinute = occurrenceTimeOfEarthquakeMinute;
    }
    
    public void setSeismicIntensityRegion1(SeismicIntensityMessage seismicIntensityRegion1) {
        this.seismicIntensityRegion1 = seismicIntensityRegion1;
    }
    
    public void setPrefectureRegion1(PrefectureCode prefectureRegion1) {
        this.prefectureRegion1 = prefectureRegion1;
    }
    
    public void setSeismicIntensityRegion2(SeismicIntensityMessage seismicIntensityRegion2) {
        this.seismicIntensityRegion2 = seismicIntensityRegion2;
    }
    
    public void setPrefectureRegion2(PrefectureCode prefectureRegion2) {
        this.prefectureRegion2 = prefectureRegion2;
    }
    
    public void setSeismicIntensityRegion3(SeismicIntensityMessage seismicIntensityRegion3) {
        this.seismicIntensityRegion3 = seismicIntensityRegion3;
    }
    
    public void setPrefectureRegion3(PrefectureCode prefectureRegion3) {
        this.prefectureRegion3 = prefectureRegion3;
    }
    
    public void setSeismicIntensityRegion4(SeismicIntensityMessage seismicIntensityRegion4) {
        this.seismicIntensityRegion4 = seismicIntensityRegion4;
    }
    
    public void setPrefectureRegion4(PrefectureCode prefectureRegion4) {
        this.prefectureRegion4 = prefectureRegion4;
    }
    
    public void setSeismicIntensityRegion5(SeismicIntensityMessage seismicIntensityRegion5) {
        this.seismicIntensityRegion5 = seismicIntensityRegion5;
    }
    
    public void setPrefectureRegion5(PrefectureCode prefectureRegion5) {
        this.prefectureRegion5 = prefectureRegion5;
    }
    
    public void setSeismicIntensityRegion6(SeismicIntensityMessage seismicIntensityRegion6) {
        this.seismicIntensityRegion6 = seismicIntensityRegion6;
    }
    
    public void setPrefectureRegion6(PrefectureCode prefectureRegion6) {
        this.prefectureRegion6 = prefectureRegion6;
    }
    
    public void setSeismicIntensityRegion7(SeismicIntensityMessage seismicIntensityRegion7) {
        this.seismicIntensityRegion7 = seismicIntensityRegion7;
    }
    
    public void setPrefectureRegion7(PrefectureCode prefectureRegion7) {
        this.prefectureRegion7 = prefectureRegion7;
    }
    
    public void setSeismicIntensityRegion8(SeismicIntensityMessage seismicIntensityRegion8) {
        this.seismicIntensityRegion8 = seismicIntensityRegion8;
    }
    
    public void setPrefectureRegion8(PrefectureCode prefectureRegion8) {
        this.prefectureRegion8 = prefectureRegion8;
    }
    
    public void setSeismicIntensityRegion9(SeismicIntensityMessage seismicIntensityRegion9) {
        this.seismicIntensityRegion9 = seismicIntensityRegion9;
    }
    
    public void setPrefectureRegion9(PrefectureCode prefectureRegion9) {
        this.prefectureRegion9 = prefectureRegion9;
    }
    
    public void setSeismicIntensityRegion10(SeismicIntensityMessage seismicIntensityRegion10) {
        this.seismicIntensityRegion10 = seismicIntensityRegion10;
    }
    
    public void setPrefectureRegion10(PrefectureCode prefectureRegion10) {
        this.prefectureRegion10 = prefectureRegion10;
    }
    
    public void setSeismicIntensityRegion11(SeismicIntensityMessage seismicIntensityRegion11) {
        this.seismicIntensityRegion11 = seismicIntensityRegion11;
    }
    
    public void setPrefectureRegion11(PrefectureCode prefectureRegion11) {
        this.prefectureRegion11 = prefectureRegion11;
    }
    
    public void setSeismicIntensityRegion12(SeismicIntensityMessage seismicIntensityRegion12) {
        this.seismicIntensityRegion12 = seismicIntensityRegion12;
    }
    
    public void setPrefectureRegion12(PrefectureCode prefectureRegion12) {
        this.prefectureRegion12 = prefectureRegion12;
    }
    
    public void setSeismicIntensityRegion13(SeismicIntensityMessage seismicIntensityRegion13) {
        this.seismicIntensityRegion13 = seismicIntensityRegion13;
    }
    
    public void setPrefectureRegion13(PrefectureCode prefectureRegion13) {
        this.prefectureRegion13 = prefectureRegion13;
    }
    
    public void setSeismicIntensityRegion14(SeismicIntensityMessage seismicIntensityRegion14) {
        this.seismicIntensityRegion14 = seismicIntensityRegion14;
    }
    
    public void setPrefectureRegion14(PrefectureCode prefectureRegion14) {
        this.prefectureRegion14 = prefectureRegion14;
    }
    
    public void setSeismicIntensityRegion15(SeismicIntensityMessage seismicIntensityRegion15) {
        this.seismicIntensityRegion15 = seismicIntensityRegion15;
    }
    
    public void setPrefectureRegion15(PrefectureCode prefectureRegion15) {
        this.prefectureRegion15 = prefectureRegion15;
    }
    
    public void setSeismicIntensityRegion16(SeismicIntensityMessage seismicIntensityRegion16) {
        this.seismicIntensityRegion16 = seismicIntensityRegion16;
    }
    
    public void setPrefectureRegion16(PrefectureCode prefectureRegion16) {
        this.prefectureRegion16 = prefectureRegion16;
    }
    
    public void setSpare2(String spare2) {
        this.spare2 = spare2;
    }
    
    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }
    
    public void setReserved(String reserved) {
        this.reserved = reserved;
    }
    
    public void setCrc(String crc) {
        this.crc = crc;
    }
    
    public String getPreamble() {
        return preamble;
    }
    
    public String getMessageTypeID() {
        return messageTypeID;
    }
    
    public String getReportClassification() {
        return reportClassification;
    }
    
    public String getDisasterCategory() {
        return disasterCategory;
    }
    
    public String getReportTimeMonth() {
        return reportTimeMonth;
    }
    
    public String getReportTimeDay() {
        return reportTimeDay;
    }
    
    public String getReportTimeHour() {
        return reportTimeHour;
    }
    
    public String getReportTimeMinute() {
        return reportTimeMinute;
    }
    
    public String getInformationType() {
        return informationType;
    }
    
    public String getSpare1() {
        return spare1;
    }
    
    public String getOccurrenceTimeOfEarthquakeDay() {
        return occurrenceTimeOfEarthquakeDay;
    }
    
    public String getOccurrenceTimeOfEarthquakeHour() {
        return occurrenceTimeOfEarthquakeHour;
    }
    
    public String getOccurrenceTimeOfEarthquakeMinute() {
        return occurrenceTimeOfEarthquakeMinute;
    }
    
    public SeismicIntensityMessage getSeismicIntensityRegion1() {
        return seismicIntensityRegion1;
    }
    
    public PrefectureCode getPrefectureRegion1() {
        return prefectureRegion1;
    }
    
    public SeismicIntensityMessage getSeismicIntensityRegion2() {
        return seismicIntensityRegion2;
    }
    
    public PrefectureCode getPrefectureRegion2() {
        return prefectureRegion2;
    }
    
    public SeismicIntensityMessage getSeismicIntensityRegion3() {
        return seismicIntensityRegion3;
    }
    
    public PrefectureCode getPrefectureRegion3() {
        return prefectureRegion3;
    }
    
    public SeismicIntensityMessage getSeismicIntensityRegion4() {
        return seismicIntensityRegion4;
    }
    
    public PrefectureCode getPrefectureRegion4() {
        return prefectureRegion4;
    }
    
    public SeismicIntensityMessage getSeismicIntensityRegion5() {
        return seismicIntensityRegion5;
    }
    
    public PrefectureCode getPrefectureRegion5() {
        return prefectureRegion5;
    }
    
    public SeismicIntensityMessage getSeismicIntensityRegion6() {
        return seismicIntensityRegion6;
    }
    
    public PrefectureCode getPrefectureRegion6() {
        return prefectureRegion6;
    }
    
    public SeismicIntensityMessage getSeismicIntensityRegion7() {
        return seismicIntensityRegion7;
    }
    
    public PrefectureCode getPrefectureRegion7() {
        return prefectureRegion7;
    }
    
    public SeismicIntensityMessage getSeismicIntensityRegion8() {
        return seismicIntensityRegion8;
    }
    
    public PrefectureCode getPrefectureRegion8() {
        return prefectureRegion8;
    }
    
    public SeismicIntensityMessage getSeismicIntensityRegion9() {
        return seismicIntensityRegion9;
    }
    
    public PrefectureCode getPrefectureRegion9() {
        return prefectureRegion9;
    }
    
    public SeismicIntensityMessage getSeismicIntensityRegion10() {
        return seismicIntensityRegion10;
    }
    
    public PrefectureCode getPrefectureRegion10() {
        return prefectureRegion10;
    }
    
    public SeismicIntensityMessage getSeismicIntensityRegion11() {
        return seismicIntensityRegion11;
    }
    
    public PrefectureCode getPrefectureRegion11() {
        return prefectureRegion11;
    }
    
    public SeismicIntensityMessage getSeismicIntensityRegion12() {
        return seismicIntensityRegion12;
    }
    
    public PrefectureCode getPrefectureRegion12() {
        return prefectureRegion12;
    }
    
    public SeismicIntensityMessage getSeismicIntensityRegion13() {
        return seismicIntensityRegion13;
    }
    
    public PrefectureCode getPrefectureRegion13() {
        return prefectureRegion13;
    }
    
    public SeismicIntensityMessage getSeismicIntensityRegion14() {
        return seismicIntensityRegion14;
    }
    
    public PrefectureCode getPrefectureRegion14() {
        return prefectureRegion14;
    }
    
    public SeismicIntensityMessage getSeismicIntensityRegion15() {
        return seismicIntensityRegion15;
    }
    
    public PrefectureCode getPrefectureRegion15() {
        return prefectureRegion15;
    }
    
    public SeismicIntensityMessage getSeismicIntensityRegion16() {
        return seismicIntensityRegion16;
    }
    
    public PrefectureCode getPrefectureRegion16() {
        return prefectureRegion16;
    }
    
    public String getSpare2() {
        return spare2;
    }
    
    public String getVersionNumber() {
        return versionNumber;
    }
    
    public String getReserved() {
        return reserved;
    }
    
    public String getCrc() {
        return crc;
    }
}
