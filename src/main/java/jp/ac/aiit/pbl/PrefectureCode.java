package jp.ac.aiit.pbl;

public enum PrefectureCode {
    
    Hokkaido(1, "Hokkaido"),
    Aomori(2, "Aomori"),
    Iwate(3, "Iwate"),
    Miyagi(4, "Miyagi"),
    Akita(5, "Akita"),
    Yamagata(6, "Yamagata"),
    Fukushima(7, "Fukushima"),
    Ibaraki(8, "Ibaraki"),
    Tochigi(9, "Tochigi"),
    Gunma(10, "Gunma"),
    Saitama(11, "Saitama"),
    Chiba(12, "Chiba"),
    Tokyo(13, "Tokyo"),
    Kanagawa(14, "Kanagawa"),
    Niigata(15, "Niigata"),
    Toyama(16, "Toyama"),
    Ishikawa(17, "Ishikawa"),
    Fukui(18, "Fukui"),
    Yamanashi(19, "Yamanashi"),
    Nagano(20, "Nagano"),
    Gifu(21, "Gifu"),
    Shizuoka(22, "Shizuoka"),
    Aichi(23, "Aichi"),
    Mie(24, "Mie"),
    Shiga(25, "Shiga"),
    Kyoto(26, "Kyoto"),
    Osaka(27, "Osaka"),
    Hyogo(28, "Hyogo"),
    Nara(29, "Nara"),
    Wakayama(30, "Wakayama"),
    Tottori(31, "Tottori"),
    Shimane(32, "Shimane"),
    Okayama(33, "Okayama"),
    Hiroshima(34, "Hiroshima"),
    Yamaguchi(35, "Yamaguchi"),
    Tokushima(36, "Tokushima"),
    Kagawa(37, "Kagawa"),
    Ehime(38, "Ehime"),
    Kochi(39, "Kochi"),
    Fukuoka(40, "Fukuoka"),
    Saga(41, "Saga"),
    Nagasaki(42, "Nagasaki"),
    Kumamoto(43, "Kumamoto"),
    Oita(44, "Oita"),
    Miyazaki(45, "Miyazaki"),
    Kagoshima(46, "Kagoshima"),
    Okinawa(47, "Okinawa");
    
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
                return Hokkaido;
            case 2:
                return Aomori;
            case 3:
                return Iwate;
            case 4:
                return Miyagi;
            case 5:
                return Akita;
            case 6:
                return Yamagata;
            case 7:
                return Fukushima;
            case 8:
                return Ibaraki;
            case 9:
                return Tochigi;
            case 10:
                return Gunma;
            case 11:
                return Saitama;
            case 12:
                return Chiba;
            case 13:
                return Tokyo;
            case 14:
                return Kanagawa;
            case 15:
                return Niigata;
            case 16:
                return Toyama;
            case 17:
                return Ishikawa;
            case 18:
                return Fukui;
            case 19:
                return Yamanashi;
            case 20:
                return Nagano;
            case 21:
                return Gifu;
            case 22:
                return Shizuoka;
            case 23:
                return Aichi;
            case 24:
                return Mie;
            case 25:
                return Shiga;
            case 26:
                return Kyoto;
            case 27:
                return Osaka;
            case 28:
                return Hyogo;
            case 29:
                return Nara;
            case 30:
                return Wakayama;
            case 31:
                return Tottori;
            case 32:
                return Shimane;
            case 33:
                return Okayama;
            case 34:
                return Hiroshima;
            case 35:
                return Yamaguchi;
            case 36:
                return Tokushima;
            case 37:
                return Kagawa;
            case 38:
                return Ehime;
            case 39:
                return Kochi;
            case 40:
                return Fukuoka;
            case 41:
                return Saga;
            case 42:
                return Nagasaki;
            case 43:
                return Kumamoto;
            case 44:
                return Oita;
            case 45:
                return Miyazaki;
            case 46:
                return Kagoshima;
            case 47:
                return Okinawa;
        }
        return null;
    }
}
