package jp.ac.aiit.pbl;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PrefecturalForecastRegion {

    public enum Definition {
        宗谷地方("11000"),
        上川・留萌地方("12000"),
        上川地方("12010"),
        留萌地方("12020"),
        網走・北見・紋別地方("13000"),
        根室地方("14010"),
        釧路地方("14020"),
        十勝地方("14030"),
        釧路・根室地方("14100"),
        胆振・日高地方("15000"),
        胆振地方("15010"),
        日高地方("15020"),
        石狩・空知・後志地方("16000"),
        石狩地方("16010"),
        空知地方("16020"),
        後志地方("16030"),
        石狩・空知地方("16100"),
        渡島・檜山地方("17000"),
        渡島地方("17010"),
        檜山地方("17020"),
        青森県("20000"),
        岩手県("30000"),
        宮城県("40000"),
        秋田県("50000"),
        山形県("60000"),
        福島県("70000"),
        茨城県("80000"),
        栃木県("90000"),
        群馬県("100000"),
        埼玉県("110000"),
        千葉県("120000"),
        東京都("130000"),
        東京地方("130010"),
        伊豆諸島北部("130020"),
        伊豆諸島南部("130030"),
        神奈川県("140000"),
        新潟県("150000"),
        富山県("160000"),
        石川県("170000"),
        福井県("180000"),
        山梨県("190000"),
        長野県("200000"),
        岐阜県("210000"),
        静岡県("220000"),
        愛知県("230000"),
        三重県("240000"),
        滋賀県("250000"),
        京都府("260000"),
        大阪府("270000"),
        兵庫県("280000"),
        奈良県("290000"),
        和歌山県("300000"),
        鳥取県("310000"),
        島根県("320000"),
        岡山県("330000"),
        広島県("340000"),
        山口県("350000"),
        徳島県("360000"),
        香川県("370000"),
        愛媛県("380000"),
        高知県("390000"),
        福岡県("400000"),
        佐賀県("410000"),
        長崎県("420000"),
        熊本県("430000"),
        大分県("440000"),
        宮崎県("450000"),
        鹿児島県("460000"),
        奄美地方("460040"),
        鹿児島県（奄美地方除く）("460100"),
        沖縄本島地方("471000"),
        大東島地方("472000"),
        宮古島地方("473000"),
        八重山地方("474000"),
        その他の府県予報区("500000");

        private final String id;

        Definition(final String id) {
            this.id = id;
        }

        public String getInt() {
            return this.id;
        }
    }

    public final Map<String, String> definition;

    public PrefecturalForecastRegion() {
        Map<String, String> definition = new HashMap<String, String>();
        Arrays.stream(WarningState.Definition.values()).forEach(value -> definition.put(WarningState.Definition.valueOf(value.toString()).getInt(), value.toString()));
        this.definition = Collections.unmodifiableMap(definition);
    }
}
