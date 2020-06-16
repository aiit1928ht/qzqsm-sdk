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
    
    
    public SeismicIntensityParser parser(String hexCode){
        return new SeismicIntensityParser(hexToBinaryDecorder(hexCode));
    }
    
    public List<String> hexToBinaryDecorder(String hexCode){
        //受け取った16進数を2進数に変換
        Integer bin = Integer.parseInt(hexCode, 16);
        String binaryCode = Integer.toBinaryString(bin);
    
        List<String> seismicIntensityRcordList = new ArrayList<>();
        //入力された文字列をスライスし切り出しリストに格納
        this.preamble = binaryCode.substring(0, 8); //8bits
        seismicIntensityRcordList.add(preamble);
        this.messageTypeID = binaryCode.substring(8, 14); //6bits
        seismicIntensityRcordList.add(messageTypeID);
        this.reportClassification = binaryCode.substring(14, 17); //3bits
        seismicIntensityRcordList.add(reportClassification);
        this.disasterCategory = binaryCode.substring(17, 21); //4bits
        seismicIntensityRcordList.add(disasterCategory);
        this.reportTimeMonth = binaryCode.substring(21, 25); //4bits
        seismicIntensityRcordList.add(reportTimeMonth);
        this.reportTimeDay = binaryCode.substring(25, 30); //5bits
        seismicIntensityRcordList.add(reportTimeDay);
        this.reportTimeHour = binaryCode.substring(30, 35); //5bits
        seismicIntensityRcordList.add(reportTimeHour);
        this.reportTimeMinute = binaryCode.substring(35, 41); //6bits
        seismicIntensityRcordList.add(reportTimeMinute);
        this.informationType = binaryCode.substring(41, 43); //2bits
        seismicIntensityRcordList.add(informationType);
        this.spare1 = binaryCode.substring(43, 53); //10bits
        seismicIntensityRcordList.add(spare1);
        this.occurrenceTimeOfEarthquakeDay = binaryCode.substring(53, 58); //5bits
        seismicIntensityRcordList.add(occurrenceTimeOfEarthquakeDay);
        this.occurrenceTimeOfEarthquakeHour = binaryCode.substring(58, 63); //5bits
        seismicIntensityRcordList.add(occurrenceTimeOfEarthquakeHour);
        this.occurrenceTimeOfEarthquakeMinute = binaryCode.substring(63, 69); //6bits
        seismicIntensityRcordList.add(occurrenceTimeOfEarthquakeMinute);
        this.seismicIntensityRegion1 = binaryCode.substring(69, 72); //3bits
        seismicIntensityRcordList.add(seismicIntensityRegion1);
        this.prefectureRegion1 = binaryCode.substring(72, 78); //6bits
        seismicIntensityRcordList.add(prefectureRegion1);
        this.seismicIntensityRegion2 = binaryCode.substring(78, 81); //3bits
        seismicIntensityRcordList.add(seismicIntensityRegion2);
        this.prefectureRegion2 = binaryCode.substring(81, 87); //6bits
        seismicIntensityRcordList.add(prefectureRegion2);
        this.seismicIntensityRegion3 = binaryCode.substring(87, 90); //3bits
        seismicIntensityRcordList.add(seismicIntensityRegion3);
        this.prefectureRegion3 = binaryCode.substring(90, 96); //6bits
        seismicIntensityRcordList.add(prefectureRegion3);
        this.seismicIntensityRegion4 = binaryCode.substring(96, 99); //3bits
        seismicIntensityRcordList.add(seismicIntensityRegion4);
        this.prefectureRegion4 = binaryCode.substring(99, 105); //6bits
        seismicIntensityRcordList.add(prefectureRegion4);
        this.seismicIntensityRegion5 = binaryCode.substring(105, 108); //3bits
        seismicIntensityRcordList.add(seismicIntensityRegion5);
        this.prefectureRegion5 = binaryCode.substring(108, 114); //6bits
        seismicIntensityRcordList.add(prefectureRegion5);
        this.seismicIntensityRegion6 = binaryCode.substring(114, 117); //3bits
        seismicIntensityRcordList.add(seismicIntensityRegion6);
        this.prefectureRegion6 = binaryCode.substring(117, 123); //6bits
        seismicIntensityRcordList.add(prefectureRegion6);
        this.seismicIntensityRegion7 = binaryCode.substring(123, 126); //3bits
        seismicIntensityRcordList.add(seismicIntensityRegion7);
        this.prefectureRegion7 = binaryCode.substring(126, 132); //6bits
        seismicIntensityRcordList.add(prefectureRegion7);
        this.seismicIntensityRegion8 = binaryCode.substring(132, 135); //3bits
        seismicIntensityRcordList.add(seismicIntensityRegion8);
        this.prefectureRegion8 = binaryCode.substring(135, 141); //6bits
        seismicIntensityRcordList.add(prefectureRegion8);
        this.seismicIntensityRegion9 = binaryCode.substring(141, 144); //3bits
        seismicIntensityRcordList.add(seismicIntensityRegion9);
        this.prefectureRegion9 = binaryCode.substring(144, 150); //6bits
        seismicIntensityRcordList.add(prefectureRegion9);
        this.seismicIntensityRegion10 = binaryCode.substring(150, 153); //3bits
        seismicIntensityRcordList.add(seismicIntensityRegion10);
        this.prefectureRegion10 = binaryCode.substring(153, 159); //6bits
        seismicIntensityRcordList.add(prefectureRegion10);
        this.seismicIntensityRegion11 = binaryCode.substring(159, 162); //3bits
        seismicIntensityRcordList.add(seismicIntensityRegion11);
        this.prefectureRegion11 = binaryCode.substring(162, 168); //6bits
        seismicIntensityRcordList.add(prefectureRegion11);
        this.seismicIntensityRegion12 = binaryCode.substring(168, 171); //3bits
        seismicIntensityRcordList.add(seismicIntensityRegion12);
        this.prefectureRegion12 = binaryCode.substring(171, 177); //6bits
        seismicIntensityRcordList.add(prefectureRegion12);
        this.seismicIntensityRegion13 = binaryCode.substring(177, 180); //3bits
        seismicIntensityRcordList.add(seismicIntensityRegion13);
        this.prefectureRegion13 = binaryCode.substring(180, 186); //6bits
        seismicIntensityRcordList.add(prefectureRegion13);
        this.seismicIntensityRegion14 = binaryCode.substring(186, 189); //3bits
        seismicIntensityRcordList.add(seismicIntensityRegion14);
        this.prefectureRegion14 = binaryCode.substring(189, 195); //6bits
        seismicIntensityRcordList.add(prefectureRegion14);
        this.seismicIntensityRegion15 = binaryCode.substring(195, 198); //3bits
        seismicIntensityRcordList.add(seismicIntensityRegion15);
        this.prefectureRegion15 = binaryCode.substring(198, 204); //6bits
        seismicIntensityRcordList.add(prefectureRegion15);
        this.seismicIntensityRegion16 = binaryCode.substring(204, 207); //3bits
        seismicIntensityRcordList.add(seismicIntensityRegion16);
        this.prefectureRegion16 = binaryCode.substring(207, 213); //6bits
        seismicIntensityRcordList.add(prefectureRegion16);
        this.spare2 = binaryCode.substring(213, 214); //1bits
        seismicIntensityRcordList.add(spare2);
        this.versionNumber = binaryCode.substring(214, 220); //6bits
        seismicIntensityRcordList.add(versionNumber);
        this.reserved = binaryCode.substring(220, 226); //6bits
        seismicIntensityRcordList.add(reserved);
        this.crc = binaryCode.substring(226, 250); //24bits
        seismicIntensityRcordList.add(crc);
        
        return seismicIntensityRcordList;
    }
}
