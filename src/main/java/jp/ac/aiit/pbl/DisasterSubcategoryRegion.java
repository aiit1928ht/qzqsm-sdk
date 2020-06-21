package jp.ac.aiit.pbl;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DisasterSubcategoryRegion {
    public enum Definition {
        暴風雪特別警報("1"),
        大雨特別警報("2"),
        暴風特別警報("3"),
        大雪特別警報("4"),
        波浪特別警報("5"),
        高潮特別警報("6"),
        全ての気象特別警報("7"),
        記録的短時間大雨情報("21"),
        竜巻注意情報("22"),
        土砂災害警戒情報("23"),
        その他の警報等情報要素("31");

        private final String id;

        Definition(final String id) {
            this.id = id;
        }

        public String getInt() {
            return this.id;
        }
    }

    public final Map<String, String> definition;

    public DisasterSubcategoryRegion() {
        Map<String, String> definition = new HashMap<String, String>();
        Arrays.stream(Definition.values()).forEach(value -> definition.put(Definition.valueOf(value.toString()).getInt(), value.toString()));
        this.definition = Collections.unmodifiableMap(definition);
    }
}
