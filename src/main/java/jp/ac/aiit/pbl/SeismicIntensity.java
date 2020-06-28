package jp.ac.aiit.pbl;
import java.time.LocalDateTime;

public class SeismicIntensity {
    // 地震の発生時刻
    //private LocalDateTime occurrenceTimeOfEarthquakeDay;
    // 地震の発生時刻
    //private LocalDateTime occurrenceTimeOfEarthquakeHour;
    // 地震の発生時刻
    //private LocalDateTime occurrenceTimeOfEarthquakeMinute;
    
    private LocalDateTime occurrenceTime;
    
    // 震度(地点1)
    private SeismicIntensityWarning seismicIntensityRegion1;
    // 都道府県(地点1)
    private SeismicIntensityPrefecture seismicIntensityPrefectureRegion1;
    // 震度(地点2)
    private SeismicIntensityWarning seismicIntensityRegion2;
    // 都道府県(地点2)
    private SeismicIntensityPrefecture seismicIntensityPrefectureRegion2;
    // 震度(地点3)
    private SeismicIntensityWarning seismicIntensityRegion3;
    // 都道府県(地点3)
    private SeismicIntensityPrefecture seismicIntensityPrefectureRegion3;
    // 震度(地点4)
    private SeismicIntensityWarning seismicIntensityRegion4;
    // 都道府県(地点4)
    private SeismicIntensityPrefecture seismicIntensityPrefectureRegion4;
    // 震度(地点5)
    private SeismicIntensityWarning seismicIntensityRegion5;
    // 都道府県(地点5)
    private SeismicIntensityPrefecture seismicIntensityPrefectureRegion5;
    // 震度(地点6)
    private SeismicIntensityWarning seismicIntensityRegion6;
    // 都道府県(地点6)
    private SeismicIntensityPrefecture seismicIntensityPrefectureRegion6;
    // 震度(地点7)
    private SeismicIntensityWarning seismicIntensityRegion7;
    // 都道府県(地点7)
    private SeismicIntensityPrefecture seismicIntensityPrefectureRegion7;
    // 震度(地点8)
    private SeismicIntensityWarning seismicIntensityRegion8;
    // 都道府県(地点8)
    private SeismicIntensityPrefecture seismicIntensityPrefectureRegion8;
    // 震度(地点9)
    private SeismicIntensityWarning seismicIntensityRegion9;
    // 都道府県(地点9)
    private SeismicIntensityPrefecture seismicIntensityPrefectureRegion9;
    // 震度(地点10)
    private SeismicIntensityWarning seismicIntensityRegion10;
    // 都道府県(地点10)
    private SeismicIntensityPrefecture seismicIntensityPrefectureRegion10;
    // 震度(地点11)
    private SeismicIntensityWarning seismicIntensityRegion11;
    // 都道府県(地点11)
    private SeismicIntensityPrefecture seismicIntensityPrefectureRegion11;
    // 震度(地点12)
    private SeismicIntensityWarning seismicIntensityRegion12;
    // 都道府県(地点12)
    private SeismicIntensityPrefecture seismicIntensityPrefectureRegion12;
    // 震度(地点13)
    private SeismicIntensityWarning seismicIntensityRegion13;
    // 都道府県(地点13)
    private SeismicIntensityPrefecture seismicIntensityPrefectureRegion13;
    // 震度(地点14)
    private SeismicIntensityWarning seismicIntensityRegion14;
    // 都道府県(地点14)
    private SeismicIntensityPrefecture seismicIntensityPrefectureRegion14;
    // 震度(地点15)
    private SeismicIntensityWarning seismicIntensityRegion15;
    // 都道府県(地点15)
    private SeismicIntensityPrefecture seismicIntensityPrefectureRegion15;
    // 震度(地点16)
    private SeismicIntensityWarning seismicIntensityRegion16;
    // 都道府県(地点16)
    private SeismicIntensityPrefecture seismicIntensityPrefectureRegion16;
    
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
    
    public LocalDateTime getOccurrenceTime() {
        return occurrenceTime;
    }
    
    public SeismicIntensityWarning getSeismicIntensityRegion1() {
        return seismicIntensityRegion1;
    }
    
    public void setSeismicIntensityRegion1(SeismicIntensityWarning seismicIntensityRegion1) {
        this.seismicIntensityRegion1 = seismicIntensityRegion1;
    }
    
    public SeismicIntensityPrefecture getSeismicIntensityPrefectureRegion1() {
        return seismicIntensityPrefectureRegion1;
    }
    
    public void setSeismicIntensityPrefectureRegion1(SeismicIntensityPrefecture seismicIntensityPrefectureRegion1) {
        this.seismicIntensityPrefectureRegion1 = seismicIntensityPrefectureRegion1;
    }
    
    public SeismicIntensityWarning getSeismicIntensityRegion2() {
        return seismicIntensityRegion2;
    }
    
    public void setSeismicIntensityRegion2(SeismicIntensityWarning seismicIntensityRegion2) {
        this.seismicIntensityRegion2 = seismicIntensityRegion2;
    }
    
    public SeismicIntensityPrefecture getSeismicIntensityPrefectureRegion2() {
        return seismicIntensityPrefectureRegion2;
    }
    
    public void setSeismicIntensityPrefectureRegion2(SeismicIntensityPrefecture seismicIntensityPrefectureRegion2) {
        this.seismicIntensityPrefectureRegion2 = seismicIntensityPrefectureRegion2;
    }
    
    public SeismicIntensityWarning getSeismicIntensityRegion3() {
        return seismicIntensityRegion3;
    }
    
    public void setSeismicIntensityRegion3(SeismicIntensityWarning seismicIntensityRegion3) {
        this.seismicIntensityRegion3 = seismicIntensityRegion3;
    }
    
    public SeismicIntensityPrefecture getSeismicIntensityPrefectureRegion3() {
        return seismicIntensityPrefectureRegion3;
    }
    
    public void setSeismicIntensityPrefectureRegion3(SeismicIntensityPrefecture seismicIntensityPrefectureRegion3) {
        this.seismicIntensityPrefectureRegion3 = seismicIntensityPrefectureRegion3;
    }
    
    public SeismicIntensityWarning getSeismicIntensityRegion4() {
        return seismicIntensityRegion4;
    }
    
    public void setSeismicIntensityRegion4(SeismicIntensityWarning seismicIntensityRegion4) {
        this.seismicIntensityRegion4 = seismicIntensityRegion4;
    }
    
    public SeismicIntensityPrefecture getSeismicIntensityPrefectureRegion4() {
        return seismicIntensityPrefectureRegion4;
    }
    
    public void setSeismicIntensityPrefectureRegion4(SeismicIntensityPrefecture seismicIntensityPrefectureRegion4) {
        this.seismicIntensityPrefectureRegion4 = seismicIntensityPrefectureRegion4;
    }
    
    public SeismicIntensityWarning getSeismicIntensityRegion5() {
        return seismicIntensityRegion5;
    }
    
    public void setSeismicIntensityRegion5(SeismicIntensityWarning seismicIntensityRegion5) {
        this.seismicIntensityRegion5 = seismicIntensityRegion5;
    }
    
    public SeismicIntensityPrefecture getSeismicIntensityPrefectureRegion5() {
        return seismicIntensityPrefectureRegion5;
    }
    
    public void setSeismicIntensityPrefectureRegion5(SeismicIntensityPrefecture seismicIntensityPrefectureRegion5) {
        this.seismicIntensityPrefectureRegion5 = seismicIntensityPrefectureRegion5;
    }
    
    public SeismicIntensityWarning getSeismicIntensityRegion6() {
        return seismicIntensityRegion6;
    }
    
    public void setSeismicIntensityRegion6(SeismicIntensityWarning seismicIntensityRegion6) {
        this.seismicIntensityRegion6 = seismicIntensityRegion6;
    }
    
    public SeismicIntensityPrefecture getSeismicIntensityPrefectureRegion6() {
        return seismicIntensityPrefectureRegion6;
    }
    
    public void setSeismicIntensityPrefectureRegion6(SeismicIntensityPrefecture seismicIntensityPrefectureRegion6) {
        this.seismicIntensityPrefectureRegion6 = seismicIntensityPrefectureRegion6;
    }
    
    public SeismicIntensityWarning getSeismicIntensityRegion7() {
        return seismicIntensityRegion7;
    }
    
    public void setSeismicIntensityRegion7(SeismicIntensityWarning seismicIntensityRegion7) {
        this.seismicIntensityRegion7 = seismicIntensityRegion7;
    }
    
    public SeismicIntensityPrefecture getSeismicIntensityPrefectureRegion7() {
        return seismicIntensityPrefectureRegion7;
    }
    
    public void setSeismicIntensityPrefectureRegion7(SeismicIntensityPrefecture seismicIntensityPrefectureRegion7) {
        this.seismicIntensityPrefectureRegion7 = seismicIntensityPrefectureRegion7;
    }
    
    public SeismicIntensityWarning getSeismicIntensityRegion8() {
        return seismicIntensityRegion8;
    }
    
    public void setSeismicIntensityRegion8(SeismicIntensityWarning seismicIntensityRegion8) {
        this.seismicIntensityRegion8 = seismicIntensityRegion8;
    }
    
    public SeismicIntensityPrefecture getSeismicIntensityPrefectureRegion8() {
        return seismicIntensityPrefectureRegion8;
    }
    
    public void setSeismicIntensityPrefectureRegion8(SeismicIntensityPrefecture seismicIntensityPrefectureRegion8) {
        this.seismicIntensityPrefectureRegion8 = seismicIntensityPrefectureRegion8;
    }
    
    public SeismicIntensityWarning getSeismicIntensityRegion9() {
        return seismicIntensityRegion9;
    }
    
    public void setSeismicIntensityRegion9(SeismicIntensityWarning seismicIntensityRegion9) {
        this.seismicIntensityRegion9 = seismicIntensityRegion9;
    }
    
    public SeismicIntensityPrefecture getSeismicIntensityPrefectureRegion9() {
        return seismicIntensityPrefectureRegion9;
    }
    
    public void setSeismicIntensityPrefectureRegion9(SeismicIntensityPrefecture seismicIntensityPrefectureRegion9) {
        this.seismicIntensityPrefectureRegion9 = seismicIntensityPrefectureRegion9;
    }
    
    public SeismicIntensityWarning getSeismicIntensityRegion10() {
        return seismicIntensityRegion10;
    }
    
    public void setSeismicIntensityRegion10(SeismicIntensityWarning seismicIntensityRegion10) {
        this.seismicIntensityRegion10 = seismicIntensityRegion10;
    }
    
    public SeismicIntensityPrefecture getSeismicIntensityPrefectureRegion10() {
        return seismicIntensityPrefectureRegion10;
    }
    
    public void setSeismicIntensityPrefectureRegion10(SeismicIntensityPrefecture seismicIntensityPrefectureRegion10) {
        this.seismicIntensityPrefectureRegion10 = seismicIntensityPrefectureRegion10;
    }
    
    public SeismicIntensityWarning getSeismicIntensityRegion11() {
        return seismicIntensityRegion11;
    }
    
    public void setSeismicIntensityRegion11(SeismicIntensityWarning seismicIntensityRegion11) {
        this.seismicIntensityRegion11 = seismicIntensityRegion11;
    }
    
    public SeismicIntensityPrefecture getSeismicIntensityPrefectureRegion11() {
        return seismicIntensityPrefectureRegion11;
    }
    
    public void setSeismicIntensityPrefectureRegion11(SeismicIntensityPrefecture seismicIntensityPrefectureRegion11) {
        this.seismicIntensityPrefectureRegion11 = seismicIntensityPrefectureRegion11;
    }
    
    public SeismicIntensityWarning getSeismicIntensityRegion12() {
        return seismicIntensityRegion12;
    }
    
    public void setSeismicIntensityRegion12(SeismicIntensityWarning seismicIntensityRegion12) {
        this.seismicIntensityRegion12 = seismicIntensityRegion12;
    }
    
    public SeismicIntensityPrefecture getSeismicIntensityPrefectureRegion12() {
        return seismicIntensityPrefectureRegion12;
    }
    
    public void setSeismicIntensityPrefectureRegion12(SeismicIntensityPrefecture seismicIntensityPrefectureRegion12) {
        this.seismicIntensityPrefectureRegion12 = seismicIntensityPrefectureRegion12;
    }
    
    public SeismicIntensityWarning getSeismicIntensityRegion13() {
        return seismicIntensityRegion13;
    }
    
    public void setSeismicIntensityRegion13(SeismicIntensityWarning seismicIntensityRegion13) {
        this.seismicIntensityRegion13 = seismicIntensityRegion13;
    }
    
    public SeismicIntensityPrefecture getSeismicIntensityPrefectureRegion13() {
        return seismicIntensityPrefectureRegion13;
    }
    
    public void setSeismicIntensityPrefectureRegion13(SeismicIntensityPrefecture seismicIntensityPrefectureRegion13) {
        this.seismicIntensityPrefectureRegion13 = seismicIntensityPrefectureRegion13;
    }
    
    public SeismicIntensityWarning getSeismicIntensityRegion14() {
        return seismicIntensityRegion14;
    }
    
    public void setSeismicIntensityRegion14(SeismicIntensityWarning seismicIntensityRegion14) {
        this.seismicIntensityRegion14 = seismicIntensityRegion14;
    }
    
    public SeismicIntensityPrefecture getSeismicIntensityPrefectureRegion14() {
        return seismicIntensityPrefectureRegion14;
    }
    
    public void setSeismicIntensityPrefectureRegion14(SeismicIntensityPrefecture seismicIntensityPrefectureRegion14) {
        this.seismicIntensityPrefectureRegion14 = seismicIntensityPrefectureRegion14;
    }
    
    public SeismicIntensityWarning getSeismicIntensityRegion15() {
        return seismicIntensityRegion15;
    }
    
    public void setSeismicIntensityRegion15(SeismicIntensityWarning seismicIntensityRegion15) {
        this.seismicIntensityRegion15 = seismicIntensityRegion15;
    }
    
    public SeismicIntensityPrefecture getSeismicIntensityPrefectureRegion15() {
        return seismicIntensityPrefectureRegion15;
    }
    
    public void setSeismicIntensityPrefectureRegion15(SeismicIntensityPrefecture seismicIntensityPrefectureRegion15) {
        this.seismicIntensityPrefectureRegion15 = seismicIntensityPrefectureRegion15;
    }
    
    public SeismicIntensityWarning getSeismicIntensityRegion16() {
        return seismicIntensityRegion16;
    }
    
    public void setSeismicIntensityRegion16(SeismicIntensityWarning seismicIntensityRegion16) {
        this.seismicIntensityRegion16 = seismicIntensityRegion16;
    }
    
    public SeismicIntensityPrefecture getSeismicIntensityPrefectureRegion16() {
        return seismicIntensityPrefectureRegion16;
    }
    
    public void setSeismicIntensityPrefectureRegion16(SeismicIntensityPrefecture seismicIntensityPrefectureRegion16) {
        this.seismicIntensityPrefectureRegion16 = seismicIntensityPrefectureRegion16;
    }
    @Override
    public String toString() {
        return "SeismicIntensity{" +
                "occurrenceTime='" + occurrenceTime + '\'' +
                ", seismicIntensityRegion1=" + seismicIntensityRegion1 +
                ", seismicIntensityPrefectureRegion1=" + seismicIntensityPrefectureRegion1 +
                ", seismicIntensityRegion2=" + seismicIntensityRegion2 +
                ", seismicIntensityPrefectureRegion2=" + seismicIntensityPrefectureRegion2 +
                ", seismicIntensityRegion3=" + seismicIntensityRegion3 +
                ", seismicIntensityPrefectureRegion3=" + seismicIntensityPrefectureRegion3 +
                ", seismicIntensityRegion4=" + seismicIntensityRegion4 +
                ", seismicIntensityPrefectureRegion4=" + seismicIntensityPrefectureRegion4 +
                ", seismicIntensityRegion5=" + seismicIntensityRegion5 +
                ", seismicIntensityPrefectureRegion5=" + seismicIntensityPrefectureRegion5 +
                ", seismicIntensityRegion6=" + seismicIntensityRegion6 +
                ", seismicIntensityPrefectureRegion6=" + seismicIntensityPrefectureRegion6 +
                ", seismicIntensityRegion7=" + seismicIntensityRegion7 +
                ", seismicIntensityPrefectureRegion7=" + seismicIntensityPrefectureRegion7 +
                ", seismicIntensityRegion8=" + seismicIntensityRegion8 +
                ", seismicIntensityPrefectureRegion8=" + seismicIntensityPrefectureRegion8 +
                ", seismicIntensityRegion9=" + seismicIntensityRegion9 +
                ", seismicIntensityPrefectureRegion9=" + seismicIntensityPrefectureRegion9 +
                ", seismicIntensityRegion10=" + seismicIntensityRegion10 +
                ", seismicIntensityPrefectureRegion11=" + seismicIntensityPrefectureRegion11 +
                ", seismicIntensityRegion12=" + seismicIntensityRegion12 +
                ", seismicIntensityPrefectureRegion12=" + seismicIntensityPrefectureRegion12 +
                ", seismicIntensityRegion13=" + seismicIntensityRegion13 +
                ", seismicIntensityPrefectureRegion13=" + seismicIntensityPrefectureRegion13 +
                ", seismicIntensityRegion14=" + seismicIntensityRegion14 +
                ", seismicIntensityPrefectureRegion14=" + seismicIntensityPrefectureRegion14 +
                ", seismicIntensityRegion15=" + seismicIntensityRegion15 +
                ", seismicIntensityPrefectureRegion15=" + seismicIntensityPrefectureRegion15 +
                ", seismicIntensityRegion16=" + seismicIntensityRegion16 +
                ", seismicIntensityPrefectureRegion16=" + seismicIntensityPrefectureRegion16 +
                '}';
    }
    
}
