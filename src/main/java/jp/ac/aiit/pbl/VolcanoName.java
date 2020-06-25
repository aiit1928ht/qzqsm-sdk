package jp.ac.aiit.pbl;

import java.util.Arrays;

public enum VolcanoName {
    ShiretokoiouZan(101,"知床硫黄山"),
    Rausudake(102,"羅臼岳"),
    Mashuu(103,"摩周"),
    Atosanupuri(104,"アトサヌプリ"),
    Meakandake(105,"雌阿寒岳"),
    Maruyama(106,"丸山"),
    Daisetsuzan(107,"2大雪山"),
    Tokachidake(108,"十勝岳"),
    Tarumaeyama(109,"樽前山"),
    Eniwadake(110,"恵庭岳"),
    Kuttara(111,"倶多楽"),
    Usuzan(112,"有珠山"),
    HokkaidoKomagadake(113,"北海道駒ヶ岳"),
    Esan(114,"恵山"),
    OshimaOhshima(115,"渡島大島"),
    Rishirizan(116,"利尻山"),
    Youteizan(117,"羊蹄山"),
    Niseko(118,"ニセコ"),
    Naruko(211,"鳴子"),
    Zaouzan(212,"蔵王山"),
    Azumayama(213,"吾妻山"),
    others(4000,"その他の火山");


    //214	安達太良山
    //215	磐梯山
    //216	燧ヶ岳
    //217	肘折
    //218	沼沢
    //301	那須岳
    //302	日光白根山
    //303	赤城山
    //304	榛名山
    //305	草津白根山
    //306	浅間山
    //307	新潟焼山
    //308	妙高山
    //309	弥陀ヶ原
    //310	焼岳
    //335	アカンダナ山
    //336	利島
    //337	御蔵島
    //338	孀婦岩
    //339	海形海山
    //340	南日吉海山
    //341	日光海山
    //342	男体山
    //350	草津白根山(白根山(湯釜付近))
    //351	草津白根山(本白根山)
    //401	三瓶山
    //502	九重山
    //503	阿蘇山
    //504	雲仙岳
    //505	霧島山
    //506	桜島
    //507	開聞岳
    //508	薩摩硫黄島
    //509	口永良部島
    //510	中之島
    //511	諏訪之瀬島
    //512	阿武火山群
    //513	鶴見岳・伽藍岳
    //514	由布岳
    //515	福江火山群
    //516	米丸・住吉池
    //517	若尊
    //518	池田・山川
    //519	口之島
    //550	霧島山(御鉢)
    //551	霧島山(新燃岳)
    //552	霧島山(えびの高原(硫黄山)周辺)
    //601	硫黄鳥島
    //602	西表島北北東海底火山
    //900	全国の活火山
    //901	その他の活火山
    //902	新たな活火山
    //4000	その他の火山
    //NNNN*	火山(コード番号：NNNN)

    private Integer id;
    private String volcanoName;
    private VolcanoName(int id, String volcanoName){
        this.id  = id;
        this.volcanoName = volcanoName;
    }

    public Integer getId(){
        return id;
    }

    public static VolcanoName getById(int id){
        return Arrays.stream(VolcanoName.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
