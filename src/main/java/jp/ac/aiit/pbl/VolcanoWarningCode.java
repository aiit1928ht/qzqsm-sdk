package jp.ac.aiit.pbl;
import java.util.Arrays;

public enum VolcanoWarningCode {
    eruptionWarning(1,"噴火警報"),
    cratorWarining(2,"火口周辺警報"),
    eruptionWarningOceam(3, "噴火警報(周辺海域)"),
    eruptionForecastWarningRelease(4,"噴火予報：警報解除"),
    eruptionForecast(5,"噴火予報"),
    level1(11,"レベル 1(活火山であることに留意)"),
    level2(12,"レベル 2(火口周辺規制)"),
    level3(13,"レベル 3(入山規制)"),
    level4(14,"レベル 4(避難準備)"),
    level5(15,"レベル 5(避難)"),
    activeVolcano(21,"活火山であることに留意"),
    cratorInDanger(22,"火口周辺危険"),
    entryInDanger( 23,"入山危険"),
    mauntanDustCaution( 24,"山麓厳重警戒"),

    others(127,"その他の防災気象情報要素");
    //
//
//    25	居住地域厳重警戒
//    31	海上警報(噴火警報)
//    32	海上警報(噴火警報解除)
//    33	海上予報(噴火予報)
//    35	活火山であることに留意(海底火山)
//    36	周辺海域警戒
//    41	噴火警報：避難等
//    42	噴火警報：入山規制等
//    43	火口周辺警報：入山規制等
//    44	噴火警報(周辺海域)：周辺海域警戒
//    45	活火山であることに留意
//    46	噴火警報：当該居住地域厳重警戒
//    47	噴火警報：当該山麓厳重警戒
//    48	噴火警報：火口周辺警戒
//    49	火口周辺警報：火口周辺警戒
//    51	爆発
//    52	噴火
//    53	噴火開始
//    54	連続噴火継続
//    55	連続噴火停止
//    56	噴火多発
//    61	爆発したもよう
//    62	噴火したもよう
//    63	噴火開始したもよう
//    64	連続噴火が継続しているもよう
//    65	連続噴火は停止したもよう
//    91	不明
//    99	その他の現象
//    127	その他の防災気象情報要素
//    NNN*	防災気象情報要素(コード番号：NNN)


    private Integer id;
    private String warningCode;
    private VolcanoWarningCode(int id, String warningCode){
        this.id  = id;
        this.warningCode = warningCode;
    }

    public Integer getId(){
        return id;
    }

    public static VolcanoWarningCode getById(int id){
        return Arrays.stream(VolcanoWarningCode.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}

