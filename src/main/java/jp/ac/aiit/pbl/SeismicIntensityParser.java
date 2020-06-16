package jp.ac.aiit.pbl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeismicIntensityParser {
    
    public  SeismicIntensityParser(List<String> seismicIntensityRcordList){
        Map<String, String> seismicIntensityMap = new HashMap<>();
        seismicIntensityMap.put(seismicIntensityRcordList.get(2), "××");
    
    }
}
