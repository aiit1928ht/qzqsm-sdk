package jp.ac.aiit.pbl;

public enum PrefectureCode {

    北海道(1, "北海道"),
    青森県(2, "青森県"),
    岩手県(3, "岩手県"),
    宮城県(4, "宮城県"),
    秋田県(5, "秋田県"),
    山形県(6, "山形県"),
    福島県(7, "福島県"),
    茨城県(8, "茨城県"),
    栃木県(9, "栃木県"),
    群馬県(10, "群馬県");
    
    private int prefectureCode;
    private String regionName;
    
    private PrefectureCode(int prefectureCode, String regionName){
        this.prefectureCode = prefectureCode;
        this.regionName = regionName;
    }
    
    public int getPrefectureCode(){
        return this.prefectureCode;
    }
    public static PrefectureCode getRegion(int prefectureCode){
        switch (prefectureCode){
            case 1:
                return 北海道;
            case 2:
                return 青森県;
            case 3:
                return 岩手県;
            case 4:
                return 宮城県;
            case 5:
                return 秋田県;
            case 6:
                return 山形県;
            case 7:
                return 福島県;
            case 8:
                return 茨城県;
            case 9:
                return 栃木県;
            case 10:
                return 群馬県;
        }
        return null;
    }
}
