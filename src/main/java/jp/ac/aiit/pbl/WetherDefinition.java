package jp.ac.aiit.pbl;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class WetherDefinition {
    public enum Definition {
        WARNING_STATE("1:発表", "2:解除"),
        DISASTER_SUBCATEGORY_REGION("1:暴風雪特別警報", "2:大雨特別警報", "3:暴風特別警報", "4:大雪特別警報", "5:波浪特別警報",
                "6:高潮特別警報", "7:全ての気象特別警報", "21:記録的短時間大雨情報", "22:竜巻注意情報", "23:土砂災害警戒情報",
                "31:その他の警報等情報要素"),
        PREFECTURAL_FORECAST_REGION("11000:宗谷地方", "12000:上川・留萌地方", "12010:上川地方", "12020:留萌地方", "13000:網走・北見・紋別地方",
                "14010:根室地方", "14020:釧路地方", "14030:十勝地方", "14100:釧路・根室地方", "15000:胆振・日高地方",
                "15010:胆振地方", "15020:日高地方", "16000:石狩・空知・後志地方", "16010:石狩地方", "16020:空知地方",
                "16030:後志地方", "16100:石狩・空知地方", "17000:渡島・檜山地方", "17010:渡島地方", "17020:檜山地方",
                "20000:青森県", "30000:岩手県", "40000:宮城県", "50000:秋田県", "60000:山形県",
                "70000:福島県", "80000:茨城県", "90000:栃木県", "100000:群馬県", "110000:埼玉県",
                "120000:千葉県", "130000:東京都", "130010:東京地方");

        private final Map<String, String> definition;

        Definition(String... keyValues) {
            String regex = ":";
            Map<String, String> definition = new HashMap<String, String>();
            Arrays.stream(keyValues).forEach(keyValue -> definition.put(keyValue.split(regex, 0)[0], keyValue.split(regex, 0)[1]));
            this.definition = Collections.unmodifiableMap(definition);
        }

        public String getValue(String key) {
            return this.definition.get(key);
        }
    }
}