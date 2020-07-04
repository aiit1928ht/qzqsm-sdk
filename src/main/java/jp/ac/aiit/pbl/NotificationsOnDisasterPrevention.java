package jp.ac.aiit.pbl;

import java.util.Arrays;

public enum NotificationsOnDisasterPrevention {
    
    Notification0(0, "なし"),
    Notification101(101, "今後若干の海面変動があるかもしれません。"),
    Notification102(102, "今後若干の海面変動があるかもしれませんが、被害の心配はありません。"),
    Notification103(103, "今後もしばらく海面変動が続くと思われます。"),
    Notification104(104, "今後もしばらく海面変動が続くと思われますので、海水浴や磯釣り等を行う際は注意してください。"),
    Notification105(105, "今後もしばらく海面変動が続くと思われますので、磯釣り等を行う際は注意してください。"),
    Notification107(107, "現在、大津波警報・津波警報・津波注意報を発表している沿岸はありません。"),
    Notification109(109, "津波と満潮が重なると、津波はより高くなりますので一層厳重な警戒が必要です。"),
    Notification110(110, "津波と満潮が重なると、津波はより高くなりますので十分な注意が必要です。");
    
    
    private int code;
    private String notificationContent;
    
    
    private NotificationsOnDisasterPrevention(int code, String notificationContent){
        this.code = code;
        this.notificationContent = notificationContent;
    }
    
    public Integer getCode() {
        return code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }
    
    public String getNotificationContent() {
        return notificationContent;
    }
    
    public void setNotificationContent(String notificationContent) {
        this.notificationContent = notificationContent;
    }
    
    public static NotificationsOnDisasterPrevention getNotificationContent(int code){
        return Arrays.stream(NotificationsOnDisasterPrevention.values())
                .filter(data -> data.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }
}
