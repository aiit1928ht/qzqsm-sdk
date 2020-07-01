package jp.ac.aiit.pbl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SeismicIntensityParser {
    
    public SeismicIntensity parse(String qzMessage){
        SeismicIntensity seismicIntensity = new SeismicIntensity();

        PrefixParser prefixParser = new PrefixParser();
        seismicIntensity.setPrefix(prefixParser.parse(qzMessage));
    
        List<SeismicIntensityRegion> region = new ArrayList<>();
        SeismicIntensityRegion regions = new SeismicIntensityRegion();
        
        SeismicIntensityRegion regionData1 = new SeismicIntensityRegion();
        SeismicIntensityRegion regionData2 = new SeismicIntensityRegion();
        SeismicIntensityRegion regionData3 = new SeismicIntensityRegion();
        SeismicIntensityRegion regionData4 = new SeismicIntensityRegion();
        SeismicIntensityRegion regionData5 = new SeismicIntensityRegion();
        SeismicIntensityRegion regionData6 = new SeismicIntensityRegion();
        SeismicIntensityRegion regionData7 = new SeismicIntensityRegion();
        SeismicIntensityRegion regionData8 = new SeismicIntensityRegion();
        SeismicIntensityRegion regionData9 = new SeismicIntensityRegion();
        SeismicIntensityRegion regionData10 = new SeismicIntensityRegion();
        SeismicIntensityRegion regionData11 = new SeismicIntensityRegion();
        SeismicIntensityRegion regionData12 = new SeismicIntensityRegion();
        SeismicIntensityRegion regionData13 = new SeismicIntensityRegion();
        SeismicIntensityRegion regionData14 = new SeismicIntensityRegion();
        SeismicIntensityRegion regionData15 = new SeismicIntensityRegion();
        SeismicIntensityRegion regionData16 = new SeismicIntensityRegion();
        
        List<Warning> warningList1 = new ArrayList<>();
        List<Warning> warningList2 = new ArrayList<>();
        List<Warning> warningList3 = new ArrayList<>();
        List<Warning> warningList4 = new ArrayList<>();
        List<Warning> warningList5 = new ArrayList<>();
        List<Warning> warningList6 = new ArrayList<>();
        List<Warning> warningList7 = new ArrayList<>();
        List<Warning> warningList8 = new ArrayList<>();
        List<Warning> warningList9 = new ArrayList<>();
        List<Warning> warningList10 = new ArrayList<>();
        List<Warning> warningList11 = new ArrayList<>();
        List<Warning> warningList12 = new ArrayList<>();
        List<Warning> warningList13 = new ArrayList<>();
        List<Warning> warningList14 = new ArrayList<>();
        List<Warning> warningList15 = new ArrayList<>();
        List<Warning> warningList16 = new ArrayList<>();
        
        
        warningList1.add(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(69, 72), 2)));
        regionData1.setWarningList(warningList1);
        
        warningList2.add(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(78, 81), 2)));
        regionData2.setWarningList(warningList2);
        
        warningList3.add(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(87, 90), 2)));
        regionData3.setWarningList(warningList3);
        
        warningList4.add(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(96, 99), 2)));
        regionData4.setWarningList(warningList4);
        
        warningList5.add(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(105, 108), 2)));
        regionData5.setWarningList(warningList5);
        
        warningList6.add(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(114, 117), 2)));
        regionData6.setWarningList(warningList6);
        
        warningList7.add(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(123, 126), 2)));
        regionData7.setWarningList(warningList7);
        
        warningList8.add(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(132, 135), 2)));
        regionData8.setWarningList(warningList8);
        
        warningList9.add(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(141, 144), 2)));
        regionData9.setWarningList(warningList9);
        
        warningList10.add(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(150, 153), 2)));
        regionData10.setWarningList(warningList10);
        
        warningList11.add(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(159, 162), 2)));
        regionData11.setWarningList(warningList11);
        
        warningList12.add(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(168, 171), 2)));
        regionData12.setWarningList(warningList12);
        
        warningList13.add(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(177, 180), 2)));
        regionData13.setWarningList(warningList13);
        
        warningList14.add(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(186, 189), 2)));
        regionData14.setWarningList(warningList14);
        
        warningList15.add(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(195, 198), 2)));
        regionData15.setWarningList(warningList15);
        
        warningList16.add(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(204, 207), 2)));
        regionData16.setWarningList(warningList16);
        
        
        List<Prefecture> prefectureList1 = new ArrayList<>();
        List<Prefecture> prefectureList2 = new ArrayList<>();
        List<Prefecture> prefectureList3 = new ArrayList<>();
        List<Prefecture> prefectureList4 = new ArrayList<>();
        List<Prefecture> prefectureList5 = new ArrayList<>();
        List<Prefecture> prefectureList6 = new ArrayList<>();
        List<Prefecture> prefectureList7 = new ArrayList<>();
        List<Prefecture> prefectureList8 = new ArrayList<>();
        List<Prefecture> prefectureList9 = new ArrayList<>();
        List<Prefecture> prefectureList10 = new ArrayList<>();
        List<Prefecture> prefectureList11 = new ArrayList<>();
        List<Prefecture> prefectureList12 = new ArrayList<>();
        List<Prefecture> prefectureList13 = new ArrayList<>();
        List<Prefecture> prefectureList14 = new ArrayList<>();
        List<Prefecture> prefectureList15 = new ArrayList<>();
        List<Prefecture> prefectureList16 = new ArrayList<>();
        
        prefectureList1.add(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(72, 78), 2)));
        regionData1.setPrefectureList(prefectureList1);
        
        prefectureList2.add(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(81, 87), 2)));
        regionData2.setPrefectureList(prefectureList2);
    
        prefectureList3.add(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(90, 96), 2)));
        regionData3.setPrefectureList(prefectureList3);
    
        prefectureList4.add(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(99, 105), 2)));
        regionData4.setPrefectureList(prefectureList4);
    
        prefectureList5.add(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(108, 114), 2)));
        regionData5.setPrefectureList(prefectureList5);
    
        prefectureList6.add(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(117, 123), 2)));
        regionData6.setPrefectureList(prefectureList6);
    
        prefectureList7.add(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(126, 132), 2)));
        regionData7.setPrefectureList(prefectureList7);
    
        prefectureList8.add(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(135, 141), 2)));
        regionData8.setPrefectureList(prefectureList8);
    
        prefectureList9.add(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(144, 150), 2)));
        regionData9.setPrefectureList(prefectureList9);
    
        prefectureList10.add(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(153, 159), 2)));
        regionData10.setPrefectureList(prefectureList10);
    
        prefectureList11.add(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(162, 168), 2)));
        regionData11.setPrefectureList(prefectureList11);
    
        prefectureList12.add(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(171, 177), 2)));
        regionData12.setPrefectureList(prefectureList12);
    
        prefectureList13.add(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(180, 186), 2)));
        regionData13.setPrefectureList(prefectureList13);
    
        prefectureList14.add(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(189, 195), 2)));
        regionData14.setPrefectureList(prefectureList14);
    
        prefectureList15.add(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(198, 204), 2)));
        regionData15.setPrefectureList(prefectureList15);
    
        prefectureList16.add(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(207, 213), 2)));
        regionData16.setPrefectureList(prefectureList16);
        
        region.add(regionData1);
        region.add(regionData2);
        region.add(regionData3);
        region.add(regionData4);
        region.add(regionData5);
        region.add(regionData6);
        region.add(regionData7);
        region.add(regionData8);
        region.add(regionData9);
        region.add(regionData10);
        region.add(regionData11);
        region.add(regionData12);
        region.add(regionData13);
        region.add(regionData14);
        region.add(regionData15);
        region.add(regionData16);
        
        seismicIntensity.setRegions(region);
        
        //SeismicIntensityRegion intensity = new SeismicIntensityRegion();
        //SeismicIntensityRegion prefecture = new SeismicIntensityRegion();
        //SeismicIntensityRegion region = new SeismicIntensityRegion();
        //warning.setIntensity(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(69, 72), 2)));
        

        //warnings.add(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(69, 72), 2)));
        //warnings.add(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(78, 81), 2)));
        
        //intensity.setWarningList(warnings);
        //seismicIntensity.setWarnings(warnings);
        
        //List<Prefecture> prefectures = new ArrayList<>();
        //prefectures.add(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(72, 78), 2)));
        //prefectures.add(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(81, 87), 2)));
        
        //prefecture.setPrefectureList(prefectures);
        //seismicIntensity.setPrefectures(prefectures);
        
        
        seismicIntensity.setOccurrenceTime(toOccurrenceTime(qzMessage.substring(53, 69)));
        
        //seismicIntensity.setSeismicIntensityRegion1(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(69, 72), 2)));
        //seismicIntensity.setPrefectureRegion1(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(72, 78), 2)));
        
        //seismicIntensity.setSeismicIntensityRegion2(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(78, 81), 2)));
        //seismicIntensity.setPrefectureRegion2(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(81, 87), 2)));
        
        //seismicIntensity.setSeismicIntensityRegion3(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(87, 90), 2)));
        //seismicIntensity.setPrefectureRegion3(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(90, 96), 2)));
        
        //seismicIntensity.setSeismicIntensityRegion4(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(96, 99), 2)));
        //seismicIntensity.setPrefectureRegion4(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(99, 105), 2)));
        
        //seismicIntensity.setSeismicIntensityRegion5(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(105, 108), 2)));
        //seismicIntensity.setPrefectureRegion5(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(108, 114), 2)));
        
        //seismicIntensity.setSeismicIntensityRegion6(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(114, 117), 2)));
        //seismicIntensity.setPrefectureRegion6(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(117, 123), 2)));

        //seismicIntensity.setSeismicIntensityRegion7(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(123, 126), 2)));
        //seismicIntensity.setPrefectureRegion7(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(126, 132), 2)));
        
        //seismicIntensity.setSeismicIntensityRegion8(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(132, 135), 2)));
        //seismicIntensity.setPrefectureRegion8(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(135, 141), 2)));
        
        //seismicIntensity.setSeismicIntensityRegion9(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(141, 144), 2)));
        //seismicIntensity.setPrefectureRegion9(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(144, 150), 2)));
        
        //seismicIntensity.setSeismicIntensityRegion10(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(150, 153), 2)));
        //seismicIntensity.setPrefectureRegion10(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(153, 159), 2)));
        
        //seismicIntensity.setSeismicIntensityRegion11(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(159, 162), 2)));
        //seismicIntensity.setPrefectureRegion11(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(162, 168), 2)));
        
        //seismicIntensity.setSeismicIntensityRegion12(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(168, 171), 2)));
        //seismicIntensity.setPrefectureRegion12(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(171, 177), 2)));
        
        //seismicIntensity.setSeismicIntensityRegion13(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(177, 180), 2)));
        //seismicIntensity.setPrefectureRegion13(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(180, 186), 2)));
        
        //seismicIntensity.setSeismicIntensityRegion14(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(186, 189), 2)));
        //seismicIntensity.setPrefectureRegion14(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(189, 195), 2)));
        
        //seismicIntensity.setSeismicIntensityRegion15(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(195, 198), 2)));
        //seismicIntensity.setPrefectureRegion15(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(198, 204), 2)));
        
        //seismicIntensity.setSeismicIntensityRegion16(Warning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(204, 207), 2)));
        //seismicIntensity.setPrefectureRegion16(Prefecture.getRegionName(Integer.parseInt(qzMessage.substring(207,213), 2)));
        
        return seismicIntensity;
    }
    
    private LocalDateTime toOccurrenceTime(String message){
        int day = Integer.parseInt(message.substring(0, 4),2);
        int hour = Integer.parseInt(message.substring(4, 9),2);
        int minute  = Integer.parseInt(message.substring(9, 15),2);
        return LocalDateTime.of(LocalDateTime.now().getYear(),LocalDateTime.now().getMonth(),day,hour,minute);
    }
    
}
