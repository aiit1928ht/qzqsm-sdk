package jp.ac.aiit.pbl;

import java.util.Arrays;

public enum EpicenterAndHypocenter {
    
    HokkaidoRegion(11, "北海道地方"),
    TohokuRegion(12, "東北地方"),
    HokurikuRegion(13, "北陸地方"),
    KantoKoshinRegion(14, "関東甲信地方"),
    OgasawaraRegion(15, "小笠原地方"),
    TokaiRegion(16, "東海地方"),
    KinkiRegion(17, "近畿地方"),
    ChugokuRegion(18, "中国地方"),
    ShikokuRegion(19, "四国地方"),
    KyushuRegion(20, "九州地方"),
    OkinawaRegion(21, "沖縄地方");
    
    private int code;
    private String regionName;
    
    private EpicenterAndHypocenter(int code, String regionName){
        this.code = code;
        this.regionName = regionName;
    }
    
    public Integer getCode(){
        return this.code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }
    
    public String getRegionName() {
        return regionName;
    }
    
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
    
    public static EpicenterAndHypocenter getRegionName(int code){
        return Arrays.stream(EpicenterAndHypocenter.values())
                .filter(data -> data.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }
    
}
