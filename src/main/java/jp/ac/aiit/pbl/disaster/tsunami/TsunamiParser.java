package jp.ac.aiit.pbl.disaster.tsunami;

import jp.ac.aiit.pbl.DisasterParser;
import jp.ac.aiit.pbl.Notification;
import jp.ac.aiit.pbl.PrefixParser;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TsunamiParser implements DisasterParser{
    
    public Tsunami parse(String qzMessage){
        Tsunami tsunami = new Tsunami();
        PrefixParser prefixParser = new PrefixParser();
        tsunami.setPrefix(prefixParser.parse(qzMessage));
    
        List<Notification> notifications = new ArrayList<>();
        notifications.add(Notification.getNotificationContent(Integer.parseInt(qzMessage.substring(53, 62),2)));
        notifications.add(Notification.getNotificationContent(Integer.parseInt(qzMessage.substring(62, 71),2)));
        notifications.add(Notification.getNotificationContent(Integer.parseInt(qzMessage.substring(71, 80),2)));
        tsunami.setNotifications(notifications);
        
        tsunami.setWarningCode(WarningCode.getTsunamiAlarmType(Integer.parseInt(qzMessage.substring(80, 84),2)));
        
        List<TsunamiRegion> tsunamiRegions = new ArrayList<>();
        tsunamiRegions.add(new TsunamiRegion(
                expectedTsunamiArrivalTime(qzMessage.substring(84, 96)),
                Integer.parseInt(qzMessage.substring(96, 100), 2),
                Integer.parseInt(qzMessage.substring(100, 110),2)));
        tsunamiRegions.add(new TsunamiRegion(
                expectedTsunamiArrivalTime(qzMessage.substring(110, 122)),
                Integer.parseInt(qzMessage.substring(122, 126),2),
                Integer.parseInt(qzMessage.substring(126, 136), 2)));
        tsunamiRegions.add(new TsunamiRegion(
                expectedTsunamiArrivalTime(qzMessage.substring(136, 148)),
                Integer.parseInt(qzMessage.substring(149, 152), 2),
                Integer.parseInt(qzMessage.substring(152, 162), 2)));
        tsunamiRegions.add(new TsunamiRegion(
                expectedTsunamiArrivalTime(qzMessage.substring(162, 174)),
                Integer.parseInt(qzMessage.substring(174, 178), 2),
                Integer.parseInt(qzMessage.substring(178, 188), 2)));
        tsunamiRegions.add(new TsunamiRegion(
                expectedTsunamiArrivalTime(qzMessage.substring(188, 200)),
                Integer.parseInt(qzMessage.substring(200, 204), 2),
                Integer.parseInt(qzMessage.substring(204, 214), 2)));
        
        return tsunami;
    }
    
    private LocalDateTime expectedTsunamiArrivalTime(String message){
        int day = Integer.parseInt(message.substring(0, 1),2);
        int hour = Integer.parseInt(message.substring(1, 6),2);
        int minute  = Integer.parseInt(message.substring(6, 12),2);
        return LocalDateTime.of(LocalDateTime.now().getYear(),LocalDateTime.now().getMonth(),day,hour,minute);
    }
}
