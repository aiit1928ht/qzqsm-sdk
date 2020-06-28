package jp.ac.aiit.pbl;

import java.time.LocalDateTime;

public class SeismicIntensityParser {
    
    public SeismicIntensity parse(String qzMessage){
        SeismicIntensity seismicIntensity = new SeismicIntensity();
        //SeismicIntensityRegion region = new SeismicIntensityRegion();
        //region.setIntensity(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(69, 72), 2)));
        
        //seismicIntensity.setOccurrenceTimeOfEarthquakeDay(toOccurrenceTime(qzMessage.substring(53, 58)));
        //seismicIntensity.setOccurrenceTimeOfEarthquakeHour(toOccurrenceTime(qzMessage.substring(58, 63)));
        //seismicIntensity.setOccurrenceTimeOfEarthquakeMinute(toOccurrenceTime(qzMessage.substring(63, 69)));
        
        seismicIntensity.setOccurrenceTime(toOccurrenceTime(qzMessage.substring(53, 69)));
        
        seismicIntensity.setSeismicIntensityRegion1(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(69, 72), 2)));
        seismicIntensity.setPrefectureRegion1(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(72, 78), 2)));
        
        seismicIntensity.setSeismicIntensityRegion2(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(78, 81), 2)));
        seismicIntensity.setPrefectureRegion2(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(81, 87), 2)));
        
        seismicIntensity.setSeismicIntensityRegion3(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(87, 90), 2)));
        seismicIntensity.setPrefectureRegion3(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(90, 96), 2)));
        
        seismicIntensity.setSeismicIntensityRegion4(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(96, 99), 2)));
        seismicIntensity.setPrefectureRegion4(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(99, 105), 2)));
        
        seismicIntensity.setSeismicIntensityRegion5(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(105, 108), 2)));
        seismicIntensity.setPrefectureRegion5(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(108, 114), 2)));
        
        seismicIntensity.setSeismicIntensityRegion6(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(114, 117), 2)));
        seismicIntensity.setPrefectureRegion6(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(117, 123), 2)));

        seismicIntensity.setSeismicIntensityRegion7(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(123, 126), 2)));
        seismicIntensity.setPrefectureRegion7(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(126, 132), 2)));
        
        seismicIntensity.setSeismicIntensityRegion8(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(132, 135), 2)));
        seismicIntensity.setPrefectureRegion8(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(135, 141), 2)));
        
        seismicIntensity.setSeismicIntensityRegion9(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(141, 144), 2)));
        seismicIntensity.setPrefectureRegion9(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(144, 150), 2)));
        
        seismicIntensity.setSeismicIntensityRegion10(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(150, 153), 2)));
        seismicIntensity.setPrefectureRegion10(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(153, 159), 2)));
        
        seismicIntensity.setSeismicIntensityRegion11(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(159, 162), 2)));
        seismicIntensity.setPrefectureRegion11(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(162, 168), 2)));
        
        seismicIntensity.setSeismicIntensityRegion12(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(168, 171), 2)));
        seismicIntensity.setPrefectureRegion12(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(171, 177), 2)));
        
        seismicIntensity.setSeismicIntensityRegion13(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(177, 180), 2)));
        seismicIntensity.setPrefectureRegion13(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(180, 186), 2)));
        
        seismicIntensity.setSeismicIntensityRegion14(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(186, 189), 2)));
        seismicIntensity.setPrefectureRegion14(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(189, 195), 2)));
        
        seismicIntensity.setSeismicIntensityRegion15(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(195, 198), 2)));
        seismicIntensity.setPrefectureRegion15(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(198, 204), 2)));
        
        seismicIntensity.setSeismicIntensityRegion16(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(204, 207), 2)));
        seismicIntensity.setPrefectureRegion16(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(207,213), 2)));
        
        return seismicIntensity;
    }
    
    private LocalDateTime toOccurrenceTime(String message){
        int day = Integer.parseInt(message.substring(0, 4),2);
        int hour = Integer.parseInt(message.substring(4, 9),2);
        int minute  = Integer.parseInt(message.substring(9, 15),2);
        return LocalDateTime.of(LocalDateTime.now().getYear(),LocalDateTime.now().getMonth(),day,hour,minute);
    }
}
