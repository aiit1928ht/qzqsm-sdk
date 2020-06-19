package jp.ac.aiit.pbl;
import java.util.*;

public class SeismicIntensityMap {
    
    // reportClassificationを定数で設定
    private static Map<String, String> RC_MAP;

    // Mapの初期設定
    static {
        Map<String, String> sircmap = new LinkedHashMap<>();

        sircmap.put("2", "Priority");
        sircmap.put("7", "Training/Test");

        RC_MAP = Collections.unmodifiableMap(sircmap);
    }
    
    // reportClassificationの結果を返す為のメソッド
    //　入力値をkeyとしてvalueを返す処理を行う
    
    public static String getRcMap(String key) {
        switch (key) {
            case "2" :
                return RC_MAP.get("2");
            case "7" :
                return RC_MAP.get("7");
            default:
                return "該当なし";
        }
    }
}
