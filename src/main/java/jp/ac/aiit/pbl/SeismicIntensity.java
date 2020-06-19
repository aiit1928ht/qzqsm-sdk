package jp.ac.aiit.pbl;

import java.util.ArrayList;
import java.util.List;

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
    private String seismicIntensityRegion1;
    // 都道府県(地点1)
    private String prefectureRegion1;
    // 震度(地点2)
    private String seismicIntensityRegion2;
    // 都道府県(地点2)
    private String prefectureRegion2;
    // 震度(地点3)
    private String seismicIntensityRegion3;
    // 都道府県(地点3)
    private String prefectureRegion3;
    // 震度(地点4)
    private String seismicIntensityRegion4;
    // 都道府県(地点4)
    private String prefectureRegion4;
    // 震度(地点5)
    private String seismicIntensityRegion5;
    // 都道府県(地点5)
    private String prefectureRegion5;
    // 震度(地点6)
    private String seismicIntensityRegion6;
    // 都道府県(地点6)
    private String prefectureRegion6;
    // 震度(地点7)
    private String seismicIntensityRegion7;
    // 都道府県(地点7)
    private String prefectureRegion7;
    // 震度(地点8)
    private String seismicIntensityRegion8;
    // 都道府県(地点8)
    private String prefectureRegion8;
    // 震度(地点9)
    private String seismicIntensityRegion9;
    // 都道府県(地点9)
    private String prefectureRegion9;
    // 震度(地点10)
    private String seismicIntensityRegion10;
    // 都道府県(地点10)
    private String prefectureRegion10;
    // 震度(地点11)
    private String seismicIntensityRegion11;
    // 都道府県(地点11)
    private String prefectureRegion11;
    // 震度(地点12)
    private String seismicIntensityRegion12;
    // 都道府県(地点12)
    private String prefectureRegion12;
    // 震度(地点13)
    private String seismicIntensityRegion13;
    // 都道府県(地点13)
    private String prefectureRegion13;
    // 震度(地点14)
    private String seismicIntensityRegion14;
    // 都道府県(地点14)
    private String prefectureRegion14;
    // 震度(地点15)
    private String seismicIntensityRegion15;
    // 都道府県(地点15)
    private String prefectureRegion15;
    // 震度(地点16)
    private String seismicIntensityRegion16;
    // 都道府県(地点16)
    private String prefectureRegion16;
    // 予備2
    private String spare2;
    // バージョン番号
    private String versionNumber;
    // 予約領域
    private String reserved;
    // Cyclic Redundancy Check
    private String crc;
    
    public SeismicIntensity(String reportClassification){
        this.reportClassification = reportClassification;
    }
    
    List<String> siList = new ArrayList<>();
    
    // Mapから値を取得し、リストに格納。リストからrcの値をreturnする
    public String rcListReporter(){
        SeismicIntensityMap simap = new SeismicIntensityMap();
        siList.add(simap.getRcMap(this.reportClassification));
        return siList.get(0);
    }
    
}
