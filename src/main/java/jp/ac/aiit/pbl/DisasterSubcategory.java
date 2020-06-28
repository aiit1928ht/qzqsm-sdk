package jp.ac.aiit.pbl;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum DisasterSubcategoryRegion {
    BLIZZARD_SPECIAL_ALERT(1, "暴風雪特別警報"),
    HEAVY_RAIN_SPECIAL_ALERT(2, "大雨特別警報"),
    STORM_SPECIAL_ALERT(3, "暴風特別警報"),
    HEAVY_SNOW_SPECIAL_ALERT(4, "大雪特別警報"),
    WAVE_SPECIAL_WARNING(5, "波浪特別警報"),
    HIGH_TIDE_SPECIAL_WARNING(6, "高潮特別警報"),
    ALL_SPECIAL_WEATHER_WARNINGS(7, "全ての気象特別警報"),
    RECORD_SHORTTIME_HEAVY_RAIN_INFORMATION(21, "記録的短時間大雨情報"),
    TORNADO_CAUTION_INFORMATION(22, "竜巻注意情報"),
    EARTH_AND_SAND_DISASTER_CAUTION_INFORMATION(23, "土砂災害警戒情報"),
    OTHERS(31, "その他の警報等情報要素");

    private final int id;
    private final String 

    DisasterSubcategoryRegion(final String id) {
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

