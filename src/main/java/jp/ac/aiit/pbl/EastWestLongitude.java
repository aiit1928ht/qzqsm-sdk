package jp.ac.aiit.pbl;

public enum EastWestLongitude {
    EastLongitude(0, "East Longitude"),
    WestLongitude(1, "West Longitude");
    
    private final int code;
    private final String longitude;
    
    EastWestLongitude(int code, String longitude) {
        this.code = code;
        this.longitude = longitude;
    }
    
    public int getCode() {
        return code;
    }
    
    public String getLongitude() {
        return longitude;
    }
    
    public static EastWestLongitude getByCode(int code) {
        if(code == 0) {
            return EastLongitude;
        } else {
            return WestLongitude;
        }
    }
}
