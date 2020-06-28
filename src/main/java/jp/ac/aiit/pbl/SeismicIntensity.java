package jp.ac.aiit.pbl;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SeismicIntensity {
    
    private Prefix prefix;
    
    // 地震の発生時刻
    //private LocalDateTime occurrenceTimeOfEarthquakeDay;
    // 地震の発生時刻
    //private LocalDateTime occurrenceTimeOfEarthquakeHour;
    // 地震の発生時刻
    //private LocalDateTime occurrenceTimeOfEarthquakeMinute;
    
    private LocalDateTime occurrenceTime;
    
    // 震度(地点1)
    private Warning seismicIntensityRegion1;
    // 都道府県(地点1)
    private Prefecture seismicIntensityPrefectureRegion1;
    // 震度(地点2)
    private Warning seismicIntensityRegion2;
    // 都道府県(地点2)
    private Prefecture seismicIntensityPrefectureRegion2;
    // 震度(地点3)
    private Warning seismicIntensityRegion3;
    // 都道府県(地点3)
    private Prefecture seismicIntensityPrefectureRegion3;
    // 震度(地点4)
    private Warning seismicIntensityRegion4;
    // 都道府県(地点4)
    private Prefecture seismicIntensityPrefectureRegion4;
    // 震度(地点5)
    private Warning seismicIntensityRegion5;
    // 都道府県(地点5)
    private Prefecture seismicIntensityPrefectureRegion5;
    // 震度(地点6)
    private Warning seismicIntensityRegion6;
    // 都道府県(地点6)
    private Prefecture seismicIntensityPrefectureRegion6;
    // 震度(地点7)
    private Warning seismicIntensityRegion7;
    // 都道府県(地点7)
    private Prefecture seismicIntensityPrefectureRegion7;
    // 震度(地点8)
    private Warning seismicIntensityRegion8;
    // 都道府県(地点8)
    private Prefecture seismicIntensityPrefectureRegion8;
    // 震度(地点9)
    private Warning seismicIntensityRegion9;
    // 都道府県(地点9)
    private Prefecture seismicIntensityPrefectureRegion9;
    // 震度(地点10)
    private Warning seismicIntensityRegion10;
    // 都道府県(地点10)
    private Prefecture seismicIntensityPrefectureRegion10;
    // 震度(地点11)
    private Warning seismicIntensityRegion11;
    // 都道府県(地点11)
    private Prefecture seismicIntensityPrefectureRegion11;
    // 震度(地点12)
    private Warning seismicIntensityRegion12;
    // 都道府県(地点12)
    private Prefecture seismicIntensityPrefectureRegion12;
    // 震度(地点13)
    private Warning seismicIntensityRegion13;
    // 都道府県(地点13)
    private Prefecture seismicIntensityPrefectureRegion13;
    // 震度(地点14)
    private Warning seismicIntensityRegion14;
    // 都道府県(地点14)
    private Prefecture seismicIntensityPrefectureRegion14;
    // 震度(地点15)
    private Warning seismicIntensityRegion15;
    // 都道府県(地点15)
    private Prefecture seismicIntensityPrefectureRegion15;
    // 震度(地点16)
    private Warning seismicIntensityRegion16;
    // 都道府県(地点16)
    private Prefecture seismicIntensityPrefectureRegion16;

    private List<SeismicIntensityRegion> regions;
    
    public List<SeismicIntensityRegion> getRegions() {
        return regions;
    }
    
    public void setRegions(List<SeismicIntensityRegion> regions) {
        this.regions = regions;
    }
    
    
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
    
    public Warning getSeismicIntensityRegion1() {
        return seismicIntensityRegion1;
    }
    
    public void setSeismicIntensityRegion1(Warning seismicIntensityRegion1) {
        this.seismicIntensityRegion1 = seismicIntensityRegion1;
    }
    
    public Prefecture getPrefectureRegion1() {
        return seismicIntensityPrefectureRegion1;
    }
    
    public void setPrefectureRegion1(Prefecture seismicIntensityPrefectureRegion1) {
        this.seismicIntensityPrefectureRegion1 = seismicIntensityPrefectureRegion1;
    }
    
    public Warning getSeismicIntensityRegion2() {
        return seismicIntensityRegion2;
    }
    
    public void setSeismicIntensityRegion2(Warning seismicIntensityRegion2) {
        this.seismicIntensityRegion2 = seismicIntensityRegion2;
    }
    
    public Prefecture getPrefectureRegion2() {
        return seismicIntensityPrefectureRegion2;
    }
    
    public void setPrefectureRegion2(Prefecture seismicIntensityPrefectureRegion2) {
        this.seismicIntensityPrefectureRegion2 = seismicIntensityPrefectureRegion2;
    }
    
    public Warning getSeismicIntensityRegion3() {
        return seismicIntensityRegion3;
    }
    
    public void setSeismicIntensityRegion3(Warning seismicIntensityRegion3) {
        this.seismicIntensityRegion3 = seismicIntensityRegion3;
    }
    
    public Prefecture getPrefectureRegion3() {
        return seismicIntensityPrefectureRegion3;
    }
    
    public void setPrefectureRegion3(Prefecture seismicIntensityPrefectureRegion3) {
        this.seismicIntensityPrefectureRegion3 = seismicIntensityPrefectureRegion3;
    }
    
    public Warning getSeismicIntensityRegion4() {
        return seismicIntensityRegion4;
    }
    
    public void setSeismicIntensityRegion4(Warning seismicIntensityRegion4) {
        this.seismicIntensityRegion4 = seismicIntensityRegion4;
    }
    
    public Prefecture getPrefectureRegion4() {
        return seismicIntensityPrefectureRegion4;
    }
    
    public void setPrefectureRegion4(Prefecture seismicIntensityPrefectureRegion4) {
        this.seismicIntensityPrefectureRegion4 = seismicIntensityPrefectureRegion4;
    }
    
    public Warning getSeismicIntensityRegion5() {
        return seismicIntensityRegion5;
    }
    
    public void setSeismicIntensityRegion5(Warning seismicIntensityRegion5) {
        this.seismicIntensityRegion5 = seismicIntensityRegion5;
    }
    
    public Prefecture getPrefectureRegion5() {
        return seismicIntensityPrefectureRegion5;
    }
    
    public void setPrefectureRegion5(Prefecture seismicIntensityPrefectureRegion5) {
        this.seismicIntensityPrefectureRegion5 = seismicIntensityPrefectureRegion5;
    }
    
    public Warning getSeismicIntensityRegion6() {
        return seismicIntensityRegion6;
    }
    
    public void setSeismicIntensityRegion6(Warning seismicIntensityRegion6) {
        this.seismicIntensityRegion6 = seismicIntensityRegion6;
    }
    
    public Prefecture getPrefectureRegion6() {
        return seismicIntensityPrefectureRegion6;
    }
    
    public void setPrefectureRegion6(Prefecture seismicIntensityPrefectureRegion6) {
        this.seismicIntensityPrefectureRegion6 = seismicIntensityPrefectureRegion6;
    }
    
    public Warning getSeismicIntensityRegion7() {
        return seismicIntensityRegion7;
    }
    
    public void setSeismicIntensityRegion7(Warning seismicIntensityRegion7) {
        this.seismicIntensityRegion7 = seismicIntensityRegion7;
    }
    
    public Prefecture getPrefectureRegion7() {
        return seismicIntensityPrefectureRegion7;
    }
    
    public void setPrefectureRegion7(Prefecture seismicIntensityPrefectureRegion7) {
        this.seismicIntensityPrefectureRegion7 = seismicIntensityPrefectureRegion7;
    }
    
    public Warning getSeismicIntensityRegion8() {
        return seismicIntensityRegion8;
    }
    
    public void setSeismicIntensityRegion8(Warning seismicIntensityRegion8) {
        this.seismicIntensityRegion8 = seismicIntensityRegion8;
    }
    
    public Prefecture getPrefectureRegion8() {
        return seismicIntensityPrefectureRegion8;
    }
    
    public void setPrefectureRegion8(Prefecture seismicIntensityPrefectureRegion8) {
        this.seismicIntensityPrefectureRegion8 = seismicIntensityPrefectureRegion8;
    }
    
    public Warning getSeismicIntensityRegion9() {
        return seismicIntensityRegion9;
    }
    
    public void setSeismicIntensityRegion9(Warning seismicIntensityRegion9) {
        this.seismicIntensityRegion9 = seismicIntensityRegion9;
    }
    
    public Prefecture getPrefectureRegion9() {
        return seismicIntensityPrefectureRegion9;
    }
    
    public void setPrefectureRegion9(Prefecture seismicIntensityPrefectureRegion9) {
        this.seismicIntensityPrefectureRegion9 = seismicIntensityPrefectureRegion9;
    }
    
    public Warning getSeismicIntensityRegion10() {
        return seismicIntensityRegion10;
    }
    
    public void setSeismicIntensityRegion10(Warning seismicIntensityRegion10) {
        this.seismicIntensityRegion10 = seismicIntensityRegion10;
    }
    
    public Prefecture getPrefectureRegion10() {
        return seismicIntensityPrefectureRegion10;
    }
    
    public void setPrefectureRegion10(Prefecture seismicIntensityPrefectureRegion10) {
        this.seismicIntensityPrefectureRegion10 = seismicIntensityPrefectureRegion10;
    }
    
    public Warning getSeismicIntensityRegion11() {
        return seismicIntensityRegion11;
    }
    
    public void setSeismicIntensityRegion11(Warning seismicIntensityRegion11) {
        this.seismicIntensityRegion11 = seismicIntensityRegion11;
    }
    
    public Prefecture getPrefectureRegion11() {
        return seismicIntensityPrefectureRegion11;
    }
    
    public void setPrefectureRegion11(Prefecture seismicIntensityPrefectureRegion11) {
        this.seismicIntensityPrefectureRegion11 = seismicIntensityPrefectureRegion11;
    }
    
    public Warning getSeismicIntensityRegion12() {
        return seismicIntensityRegion12;
    }
    
    public void setSeismicIntensityRegion12(Warning seismicIntensityRegion12) {
        this.seismicIntensityRegion12 = seismicIntensityRegion12;
    }
    
    public Prefecture getPrefectureRegion12() {
        return seismicIntensityPrefectureRegion12;
    }
    
    public void setPrefectureRegion12(Prefecture seismicIntensityPrefectureRegion12) {
        this.seismicIntensityPrefectureRegion12 = seismicIntensityPrefectureRegion12;
    }
    
    public Warning getSeismicIntensityRegion13() {
        return seismicIntensityRegion13;
    }
    
    public void setSeismicIntensityRegion13(Warning seismicIntensityRegion13) {
        this.seismicIntensityRegion13 = seismicIntensityRegion13;
    }
    
    public Prefecture getPrefectureRegion13() {
        return seismicIntensityPrefectureRegion13;
    }
    
    public void setPrefectureRegion13(Prefecture seismicIntensityPrefectureRegion13) {
        this.seismicIntensityPrefectureRegion13 = seismicIntensityPrefectureRegion13;
    }
    
    public Warning getSeismicIntensityRegion14() {
        return seismicIntensityRegion14;
    }
    
    public void setSeismicIntensityRegion14(Warning seismicIntensityRegion14) {
        this.seismicIntensityRegion14 = seismicIntensityRegion14;
    }
    
    public Prefecture getPrefectureRegion14() {
        return seismicIntensityPrefectureRegion14;
    }
    
    public void setPrefectureRegion14(Prefecture seismicIntensityPrefectureRegion14) {
        this.seismicIntensityPrefectureRegion14 = seismicIntensityPrefectureRegion14;
    }
    
    public Warning getSeismicIntensityRegion15() {
        return seismicIntensityRegion15;
    }
    
    public void setSeismicIntensityRegion15(Warning seismicIntensityRegion15) {
        this.seismicIntensityRegion15 = seismicIntensityRegion15;
    }
    
    public Prefecture getPrefectureRegion15() {
        return seismicIntensityPrefectureRegion15;
    }
    
    public void setPrefectureRegion15(Prefecture seismicIntensityPrefectureRegion15) {
        this.seismicIntensityPrefectureRegion15 = seismicIntensityPrefectureRegion15;
    }
    
    public Warning getSeismicIntensityRegion16() {
        return seismicIntensityRegion16;
    }
    
    public void setSeismicIntensityRegion16(Warning seismicIntensityRegion16) {
        this.seismicIntensityRegion16 = seismicIntensityRegion16;
    }
    
    public Prefecture getPrefectureRegion16() {
        return seismicIntensityPrefectureRegion16;
    }
    
    public void setPrefectureRegion16(Prefecture seismicIntensityPrefectureRegion16) {
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
                ", seismicIntensityPrefectureRegion10=" + seismicIntensityPrefectureRegion10 +
                ", seismicIntensityRegion11=" + seismicIntensityRegion11 +
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
