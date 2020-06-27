package jp.ac.aiit.pbl;
import java.util.Arrays;

public enum LocalGovernment {
    HokkaidoSapporoShi(110000, "北海道札幌市"),
    HokkaidoHakodateShi(120200, "北海道函館市"),
    HokkaidoOtaruShi(120300, "北海道小樽市"),
    HokkaidoAsahikawaShi(120400, "北海道旭川市"),
    HokkaidoMuroranShi(120500, "北海道室蘭市"),
    HokkaidoKushiroShi(120600, "北海道釧路市"),
    HokkaidoObihiroShi(120700, "北海道帯広市"),
    HokkaidoKitamiShi(120800, "北海道北見市"),
    HokkaidoYubariShi(120900, "北海道夕張市"),
    HokkaidoIwamizawaShi(121000, "北海道岩見沢市"),
    HokkaidoAbashiriShi(121100, "北海道網走市"),
    HokkaidoRumoishiShi(121200, "北海道留萌市"),
    HokkaidoTomakomaiShi(121300, "北海道苫小牧市"),
    HokkaidoWakkanaiShi(121400, "北海道稚内市"),
    HokkaidoBibaiShi(121500, "北海道美唄市"),
    hokkaidoAshibetsuShi(121600, "北海道芦別市"),
    HokkaidoEbetsuShi(121700, "北海道江別市"),
    HokkaidoAkabiraShi(121800, "北海道赤平市"),
    HokkaioMonbetsuShi(121900, "北海道紋別市"),
    HokkaidoShibetsuShi(122000, "北海道士別市"),
    HokkaidoNayoroShi(122100, "北海道名寄市"),
    HokkaidoMikasaShi(122200, "北海道三笠市"),
    HokkaidoNemuroShi(122300, "北海道根室市"),
    HokkaidoChitoseShi(122400,"北海道千歳市"),
    HokkaidoTakigawaShi(122500,"北海道滝川市"),
    HokkaidoSunagawaShi(122600,"北海道砂川市"),
    HokkaidoUtashinaiShi(122700,"北海道歌志内市"),
    HokkaidoFukagawaShi(122800,"北海道深川市"),
    HokkaidoFuranoShi(122900,"北海道富良野市"),
    HokkaidoNoboribetsuShi(123000,"北海道登別市"),
    HokkaidoEniwaShi(123100,"北海道恵庭市"),
    HokkaidoDateShi(123300,"北海道伊達市"),
    HokkaidoKitahiroshimaShi(123400,"北海道北広島市"),
    HokkaisoIshikariShi(123500,"北海道石狩市"),
    HokkaidoHokutoShi(123600,"北海道北斗市"),
    HokkaidoToubetsuCho(130300,"北海道当別町"),
    HokkaidoShinshinotsuMura(130400,"北海道新篠津村"),
    HokkaidoMatsumaeCho(133100,"北海道松前町"),
    HokkaisoFukushimaCho(133200,"北海道福島町"),
    HokkaisoShiriuchiCho(133300,"北海道知内町"),
    HokkaidoKikonaiCho(133400,"北海道木古内町"),
    HokkaidonanaeCho(133700,"北海道七飯町"),
    HokkaidoShikabeCho(134300,"北海道鹿部町"),
    HokkaidoMorimachi(134500,"北海道森町"),
    HokkaidoYakumoCho(134600,"北海道八雲町"),
    HokkaidoOshamambeCho(134700,"北海道長万部町"),
    HokkaidoEsashiCho(136100,"北海道江差町"),
    HokkaidoKaminokuniCho(136200,"北海道上ノ国町"),
    HokkaidoAssabuCho(136300,"北海道厚沢部町"),
    HokkaidoOtobeCho(136400,"北海道乙部町"),
    HokkaidoOkushiriCho(136700,"北海道奥尻町"),
    HokkaidoImakaneCho(137000,"北海道今金町"),
    HokkaidoSetanaCho(137100,"北海道せたな町"),
    HokkaidoShimamakimura(139100,"北海道島牧村"),
    HokkaidoSuttsuCho(139200,"北海道寿都町"),
    HokkaidoKuromatsunaiCho(139300,"北海道黒松内町"),
    HokkaidoRankoshiCho(139400,"北海道蘭越町"),
    HokkaidoNisekoCho(139500,"北海道ニセコ町"),
    HokkaidoShinkarimura(139600,"北海道真狩村"),
////139700	北海道留寿都村
////139800	北海道喜茂別町
////139900	北海道京極町
////140000	北海道倶知安町
////140100	北海道共和町
////140200	北海道岩内町
////140300	北海道泊村
////140400	北海道神恵内村
////140500	北海道積丹町
////140600	北海道古平町
////140700	北海道仁木町
////140800	北海道余市町
////140900	北海道赤井川村
////142300	北海道南幌町
////142400	北海道奈井江町
////142500	北海道上砂川町
////142700	北海道由仁町
////142800	北海道長沼町
////142900	北海道栗山町
////143000	北海道月形町
////143100	北海道浦臼町
////143200	北海道新十津川町
////143300	北海道妹背牛町
////143400	北海道秩父別町
////143600	北海道雨竜町
////143700	北海道北竜町
////143800	北海道沼田町
////145200	北海道鷹栖町
////145300	北海道東神楽町
////145400	北海道当麻町
////145500	北海道比布町
////145600	北海道愛別町
////145700	北海道上川町
////145800	北海道東川町
////145900	北海道美瑛町
////146000	北海道上富良野町
////146100	北海道中富良野町
////146200	北海道南富良野町
////146300	北海道占冠村
////146400	北海道和寒町
////146500	北海道剣淵町
////146800	北海道下川町
////146900	北海道美深町
////147000	北海道音威子府村
////147100	北海道中川町
////147200	北海道幌加内町
////148100	北海道増毛町
////148200	北海道小平町
////148300	北海道苫前町
////148400	北海道羽幌町
////148500	北海道初山別村
////148600	北海道遠別町
////148700	北海道天塩町
////151100	北海道猿払村
////151200	北海道浜頓別町
////151300	北海道中頓別町
////151400	北海道枝幸町
////151600	北海道豊富町
////151700	北海道礼文町
////151800	北海道利尻町
////151900	北海道利尻富士町
////152000	北海道幌延町
////154300	北海道美幌町
////154400	北海道津別町
////154500	北海道斜里町
////154600	北海道清里町
////154700	北海道小清水町
////154900	北海道訓子府町
////155000	北海道置戸町
////155200	北海道佐呂間町
////155500	北海道遠軽町
////155900	北海道湧別町
////156000	北海道滝上町
////156100	北海道興部町
////156200	北海道西興部村
////156300	北海道雄武町
////156400	北海道大空町
////157100	北海道豊浦町
////157500	北海道壮瞥町
////157800	北海道白老町
////158100	北海道厚真町
////158400	北海道洞爺湖町
////158500	北海道安平町
////158600	北海道むかわ町
////160100	北海道日高町
////160200	北海道平取町
////160400	北海道新冠町
////160700	北海道浦河町
////160800	北海道様似町
////160900	北海道えりも町
////161000	北海道新ひだか町
////163100	北海道音更町
////163200	北海道士幌町
////163300	北海道上士幌町
////163400	北海道鹿追町
////163500	北海道新得町
////163600	北海道清水町
////163700	北海道芽室町
////163800	北海道中札内村
////163900	北海道更別村
////164100	北海道大樹町
////164200	北海道広尾町
////164300	北海道幕別町
////164400	北海道池田町
////164500	北海道豊頃町
////164600	北海道本別町
////164700	北海道足寄町
////164800	北海道陸別町
////164900	北海道浦幌町
////166100	北海道釧路町
////166200	北海道厚岸町
////166300	北海道浜中町
////166400	北海道標茶町
////166500	北海道弟子屈町
    HokkaidoTsuruimura(166700,	"北海道鶴居村"),
    HokkaidoShiranukacho(166800,"北海道白糠町"),
    HokkaidoKunashiriTou(169001,"北海道国後島"),
    HokkaidoEtorofuTou(169002,"北海道択捉島"),
    HokkaidoBetsukaiCho(169100,"北海道別海町"),
    HokkaidoNakashibetsuCho(169200,"北海道中標津町"),
    HokkaidoShibetsuCho(169300,"北海道標津町"),
    HokkaidoRausuCho(169400,"北海道羅臼町"),
    HokkidoShikotanMura(169500,"北海道色丹村"),
    HokkaidoOthers(199999,"北海道のその他の市町村");

    private Integer id;
    private String regionCode;
    private LocalGovernment(int id, String regionCode){
        this.id  = id;
        this.regionCode = regionCode;
    }

    public Integer getId(){
        return id;
    }

    public static LocalGovernment getById(int id){
        return Arrays.stream(LocalGovernment.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
