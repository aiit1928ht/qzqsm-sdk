package jp.ac.aiit.pbl;

public enum NorthSouthLatitude {
    NorthLatitude(0, "North Latitude"),
    SouthLatitude(1, "South Latitude");
    
    private final int code;
    private final String latitude;
    
    NorthSouthLatitude(int code, String latitude) {
        this.code = code;
        this.latitude = latitude;
    }
    
    public int getCode() {
        return code;
    }
    
    public String getLatitude() {
        return latitude;
    }
    
    public static NorthSouthLatitude getByCode(int code) {
        if(code == 0) {
            return NorthLatitude;
        } else {
            return SouthLatitude;
        }
    }
}
