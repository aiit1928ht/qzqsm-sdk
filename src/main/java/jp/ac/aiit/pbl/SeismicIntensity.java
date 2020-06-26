package jp.ac.aiit.pbl;
import java.time.LocalDateTime;

public class SeismicIntensity {
    // Preamble
    //private String preamble;
    // Message Type
    //private String messageTypeID;
    // 通報区分
    //private String reportClassification;
    // 災害種別コード
    //private String disasterCategory;
    // 発表時刻
    //private LocalDateTime reportTimeMonth;
    // 発表時刻
    //private LocalDateTime reportTimeDay;
    // 発表時刻
    //private LocalDateTime reportTimeHour;
    // 発表時刻
    //private LocalDateTime reportTimeMinute;
    // 情報形態
    //private String informationType;
    // 予備１
    //private String spare1;
    // 地震の発生時刻
    //private LocalDateTime occurrenceTimeOfEarthquakeDay;
    // 地震の発生時刻
    //private LocalDateTime occurrenceTimeOfEarthquakeHour;
    // 地震の発生時刻
    //private LocalDateTime occurrenceTimeOfEarthquakeMinute;
    
    private LocalDateTime occurrenceTime;
    
    // 震度(地点1)
    private SeismicIntensityWarningCode seismicIntensityRegion1;
    // 都道府県(地点1)
    private SeismicIntensityRegion prefectureRegion1;
    // 震度(地点2)
    private SeismicIntensityWarningCode seismicIntensityRegion2;
    // 都道府県(地点2)
    private SeismicIntensityRegion prefectureRegion2;
    // 震度(地点3)
    private SeismicIntensityWarningCode seismicIntensityRegion3;
    // 都道府県(地点3)
    private SeismicIntensityRegion prefectureRegion3;
    // 震度(地点4)
    private SeismicIntensityWarningCode seismicIntensityRegion4;
    // 都道府県(地点4)
    private SeismicIntensityRegion prefectureRegion4;
    // 震度(地点5)
    private SeismicIntensityWarningCode seismicIntensityRegion5;
    // 都道府県(地点5)
    private SeismicIntensityRegion prefectureRegion5;
    // 震度(地点6)
    private SeismicIntensityWarningCode seismicIntensityRegion6;
    // 都道府県(地点6)
    private SeismicIntensityRegion prefectureRegion6;
    // 震度(地点7)
    private SeismicIntensityWarningCode seismicIntensityRegion7;
    // 都道府県(地点7)
    private SeismicIntensityRegion prefectureRegion7;
    // 震度(地点8)
    private SeismicIntensityWarningCode seismicIntensityRegion8;
    // 都道府県(地点8)
    private SeismicIntensityRegion prefectureRegion8;
    // 震度(地点9)
    private SeismicIntensityWarningCode seismicIntensityRegion9;
    // 都道府県(地点9)
    private SeismicIntensityRegion prefectureRegion9;
    // 震度(地点10)
    private SeismicIntensityWarningCode seismicIntensityRegion10;
    // 都道府県(地点10)
    private SeismicIntensityRegion prefectureRegion10;
    // 震度(地点11)
    private SeismicIntensityWarningCode seismicIntensityRegion11;
    // 都道府県(地点11)
    private SeismicIntensityRegion prefectureRegion11;
    // 震度(地点12)
    private SeismicIntensityWarningCode seismicIntensityRegion12;
    // 都道府県(地点12)
    private SeismicIntensityRegion prefectureRegion12;
    // 震度(地点13)
    private SeismicIntensityWarningCode seismicIntensityRegion13;
    // 都道府県(地点13)
    private SeismicIntensityRegion prefectureRegion13;
    // 震度(地点14)
    private SeismicIntensityWarningCode seismicIntensityRegion14;
    // 都道府県(地点14)
    private SeismicIntensityRegion prefectureRegion14;
    // 震度(地点15)
    private SeismicIntensityWarningCode seismicIntensityRegion15;
    // 都道府県(地点15)
    private SeismicIntensityRegion prefectureRegion15;
    // 震度(地点16)
    private SeismicIntensityWarningCode seismicIntensityRegion16;
    // 都道府県(地点16)
    private SeismicIntensityRegion prefectureRegion16;
    // 予備2
    //private String spare2;
    // バージョン番号
    //private String versionNumber;
    // 予約領域
    //private String reserved;
    // Cyclic Redundancy Check
    //private String crc;
    
    //public LocalDateTime getReportTimeMonth() {
    //    return reportTimeMonth;
    //}
    
    //public void setReportTimeMonth(LocalDateTime reportTimeMonth) {
    //    this.reportTimeMonth = reportTimeMonth;
    //}
    
    //public LocalDateTime getReportTimeDay() {
    //    return reportTimeDay;
    //}
    
    //public void setReportTimeDay(LocalDateTime reportTimeDay) {
    //    this.reportTimeDay = reportTimeDay;
    //}
    
    //public LocalDateTime getReportTimeHour() {
    //    return reportTimeHour;
    //}
    
    //public void setReportTimeHour(LocalDateTime reportTimeHour) {
    //    this.reportTimeHour = reportTimeHour;
    //}
    
    //public LocalDateTime getReportTimeMinute() {
    //    return reportTimeMinute;
    //}
    
    //public void setReportTimeMinute(LocalDateTime reportTimeMinute) {
    //    this.reportTimeMinute = reportTimeMinute;
    //}
    
    //public String getInformationType() {
    //    return informationType;
    //}
    
    //public void setInformationType(String informationType) {
    //    this.informationType = informationType;
    //}
    
    //public String getSpare1() {
    //    return spare1;
    //}
    
    //public void setSpare1(String spare1) {
    //    this.spare1 = spare1;
    //}
    
    //public LocalDateTime getOccurrenceTimeOfEarthquakeDay() {
    //    return occurrenceTimeOfEarthquakeDay;
    //}
    
    //public void setOccurrenceTimeOfEarthquakeDay(LocalDateTime occurrenceTimeOfEarthquakeDay) {
    //    this.occurrenceTimeOfEarthquakeDay = occurrenceTimeOfEarthquakeDay;
    //}
    
    //public LocalDateTime getOccurrenceTimeOfEarthquakeHour() {
    //    return occurrenceTimeOfEarthquakeHour;
    //}
    
    //public void setOccurrenceTimeOfEarthquakeHour(LocalDateTime occurrenceTimeOfEarthquakeHour) {
    //    this.occurrenceTimeOfEarthquakeHour = occurrenceTimeOfEarthquakeHour;
    //}
    
    //public LocalDateTime getOccurrenceTimeOfEarthquakeMinute() {
    //    return occurrenceTimeOfEarthquakeMinute;
    //}
    
    //public void setOccurrenceTimeOfEarthquakeMinute(LocalDateTime occurrenceTimeOfEarthquakeMinute) {
    //    this.occurrenceTimeOfEarthquakeMinute = occurrenceTimeOfEarthquakeMinute;
    //}
    
    public void setOccurrenceTime(LocalDateTime occurrenceTime){
        this.occurrenceTime = occurrenceTime;
    }
    
    public SeismicIntensityWarningCode getSeismicIntensityRegion1() {
        return seismicIntensityRegion1;
    }
    
    public void setSeismicIntensityRegion1(SeismicIntensityWarningCode seismicIntensityRegion1) {
        this.seismicIntensityRegion1 = seismicIntensityRegion1;
    }
    
    public SeismicIntensityRegion getPrefectureRegion1() {
        return prefectureRegion1;
    }
    
    public void setPrefectureRegion1(SeismicIntensityRegion prefectureRegion1) {
        this.prefectureRegion1 = prefectureRegion1;
    }
    
    public SeismicIntensityWarningCode getSeismicIntensityRegion2() {
        return seismicIntensityRegion2;
    }
    
    public void setSeismicIntensityRegion2(SeismicIntensityWarningCode seismicIntensityRegion2) {
        this.seismicIntensityRegion2 = seismicIntensityRegion2;
    }
    
    public SeismicIntensityRegion getPrefectureRegion2() {
        return prefectureRegion2;
    }
    
    public void setPrefectureRegion2(SeismicIntensityRegion prefectureRegion2) {
        this.prefectureRegion2 = prefectureRegion2;
    }
    
    public SeismicIntensityWarningCode getSeismicIntensityRegion3() {
        return seismicIntensityRegion3;
    }
    
    public void setSeismicIntensityRegion3(SeismicIntensityWarningCode seismicIntensityRegion3) {
        this.seismicIntensityRegion3 = seismicIntensityRegion3;
    }
    
    public SeismicIntensityRegion getPrefectureRegion3() {
        return prefectureRegion3;
    }
    
    public void setPrefectureRegion3(SeismicIntensityRegion prefectureRegion3) {
        this.prefectureRegion3 = prefectureRegion3;
    }
    
    public SeismicIntensityWarningCode getSeismicIntensityRegion4() {
        return seismicIntensityRegion4;
    }
    
    public void setSeismicIntensityRegion4(SeismicIntensityWarningCode seismicIntensityRegion4) {
        this.seismicIntensityRegion4 = seismicIntensityRegion4;
    }
    
    public SeismicIntensityRegion getPrefectureRegion4() {
        return prefectureRegion4;
    }
    
    public void setPrefectureRegion4(SeismicIntensityRegion prefectureRegion4) {
        this.prefectureRegion4 = prefectureRegion4;
    }
    
    public SeismicIntensityWarningCode getSeismicIntensityRegion5() {
        return seismicIntensityRegion5;
    }
    
    public void setSeismicIntensityRegion5(SeismicIntensityWarningCode seismicIntensityRegion5) {
        this.seismicIntensityRegion5 = seismicIntensityRegion5;
    }
    
    public SeismicIntensityRegion getPrefectureRegion5() {
        return prefectureRegion5;
    }
    
    public void setPrefectureRegion5(SeismicIntensityRegion prefectureRegion5) {
        this.prefectureRegion5 = prefectureRegion5;
    }
    
    public SeismicIntensityWarningCode getSeismicIntensityRegion6() {
        return seismicIntensityRegion6;
    }
    
    public void setSeismicIntensityRegion6(SeismicIntensityWarningCode seismicIntensityRegion6) {
        this.seismicIntensityRegion6 = seismicIntensityRegion6;
    }
    
    public SeismicIntensityRegion getPrefectureRegion6() {
        return prefectureRegion6;
    }
    
    public void setPrefectureRegion6(SeismicIntensityRegion prefectureRegion6) {
        this.prefectureRegion6 = prefectureRegion6;
    }
    
    public SeismicIntensityWarningCode getSeismicIntensityRegion7() {
        return seismicIntensityRegion7;
    }
    
    public void setSeismicIntensityRegion7(SeismicIntensityWarningCode seismicIntensityRegion7) {
        this.seismicIntensityRegion7 = seismicIntensityRegion7;
    }
    
    public SeismicIntensityRegion getPrefectureRegion7() {
        return prefectureRegion7;
    }
    
    public void setPrefectureRegion7(SeismicIntensityRegion prefectureRegion7) {
        this.prefectureRegion7 = prefectureRegion7;
    }
    
    public SeismicIntensityWarningCode getSeismicIntensityRegion8() {
        return seismicIntensityRegion8;
    }
    
    public void setSeismicIntensityRegion8(SeismicIntensityWarningCode seismicIntensityRegion8) {
        this.seismicIntensityRegion8 = seismicIntensityRegion8;
    }
    
    public SeismicIntensityRegion getPrefectureRegion8() {
        return prefectureRegion8;
    }
    
    public void setPrefectureRegion8(SeismicIntensityRegion prefectureRegion8) {
        this.prefectureRegion8 = prefectureRegion8;
    }
    
    public SeismicIntensityWarningCode getSeismicIntensityRegion9() {
        return seismicIntensityRegion9;
    }
    
    public void setSeismicIntensityRegion9(SeismicIntensityWarningCode seismicIntensityRegion9) {
        this.seismicIntensityRegion9 = seismicIntensityRegion9;
    }
    
    public SeismicIntensityRegion getPrefectureRegion9() {
        return prefectureRegion9;
    }
    
    public void setPrefectureRegion9(SeismicIntensityRegion prefectureRegion9) {
        this.prefectureRegion9 = prefectureRegion9;
    }
    
    public SeismicIntensityWarningCode getSeismicIntensityRegion10() {
        return seismicIntensityRegion10;
    }
    
    public void setSeismicIntensityRegion10(SeismicIntensityWarningCode seismicIntensityRegion10) {
        this.seismicIntensityRegion10 = seismicIntensityRegion10;
    }
    
    public SeismicIntensityRegion getPrefectureRegion10() {
        return prefectureRegion10;
    }
    
    public void setPrefectureRegion10(SeismicIntensityRegion prefectureRegion10) {
        this.prefectureRegion10 = prefectureRegion10;
    }
    
    public SeismicIntensityWarningCode getSeismicIntensityRegion11() {
        return seismicIntensityRegion11;
    }
    
    public void setSeismicIntensityRegion11(SeismicIntensityWarningCode seismicIntensityRegion11) {
        this.seismicIntensityRegion11 = seismicIntensityRegion11;
    }
    
    public SeismicIntensityRegion getPrefectureRegion11() {
        return prefectureRegion11;
    }
    
    public void setPrefectureRegion11(SeismicIntensityRegion prefectureRegion11) {
        this.prefectureRegion11 = prefectureRegion11;
    }
    
    public SeismicIntensityWarningCode getSeismicIntensityRegion12() {
        return seismicIntensityRegion12;
    }
    
    public void setSeismicIntensityRegion12(SeismicIntensityWarningCode seismicIntensityRegion12) {
        this.seismicIntensityRegion12 = seismicIntensityRegion12;
    }
    
    public SeismicIntensityRegion getPrefectureRegion12() {
        return prefectureRegion12;
    }
    
    public void setPrefectureRegion12(SeismicIntensityRegion prefectureRegion12) {
        this.prefectureRegion12 = prefectureRegion12;
    }
    
    public SeismicIntensityWarningCode getSeismicIntensityRegion13() {
        return seismicIntensityRegion13;
    }
    
    public void setSeismicIntensityRegion13(SeismicIntensityWarningCode seismicIntensityRegion13) {
        this.seismicIntensityRegion13 = seismicIntensityRegion13;
    }
    
    public SeismicIntensityRegion getPrefectureRegion13() {
        return prefectureRegion13;
    }
    
    public void setPrefectureRegion13(SeismicIntensityRegion prefectureRegion13) {
        this.prefectureRegion13 = prefectureRegion13;
    }
    
    public SeismicIntensityWarningCode getSeismicIntensityRegion14() {
        return seismicIntensityRegion14;
    }
    
    public void setSeismicIntensityRegion14(SeismicIntensityWarningCode seismicIntensityRegion14) {
        this.seismicIntensityRegion14 = seismicIntensityRegion14;
    }
    
    public SeismicIntensityRegion getPrefectureRegion14() {
        return prefectureRegion14;
    }
    
    public void setPrefectureRegion14(SeismicIntensityRegion prefectureRegion14) {
        this.prefectureRegion14 = prefectureRegion14;
    }
    
    public SeismicIntensityWarningCode getSeismicIntensityRegion15() {
        return seismicIntensityRegion15;
    }
    
    public void setSeismicIntensityRegion15(SeismicIntensityWarningCode seismicIntensityRegion15) {
        this.seismicIntensityRegion15 = seismicIntensityRegion15;
    }
    
    public SeismicIntensityRegion getPrefectureRegion15() {
        return prefectureRegion15;
    }
    
    public void setPrefectureRegion15(SeismicIntensityRegion prefectureRegion15) {
        this.prefectureRegion15 = prefectureRegion15;
    }
    
    public SeismicIntensityWarningCode getSeismicIntensityRegion16() {
        return seismicIntensityRegion16;
    }
    
    public void setSeismicIntensityRegion16(SeismicIntensityWarningCode seismicIntensityRegion16) {
        this.seismicIntensityRegion16 = seismicIntensityRegion16;
    }
    
    public SeismicIntensityRegion getPrefectureRegion16() {
        return prefectureRegion16;
    }
    
    public void setPrefectureRegion16(SeismicIntensityRegion prefectureRegion16) {
        this.prefectureRegion16 = prefectureRegion16;
    }
}
