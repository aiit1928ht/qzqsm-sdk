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
    
        ExpectedTsunamiArrivalTime expectedTsunamiArrivalTimeRegion1 =
                new ExpectedTsunamiArrivalTime(
                        tsunamiIssueTime(qzMessage.substring(21, 41)),
                        Integer.parseInt(qzMessage.substring(84, 85), 2),
                        Integer.parseInt(qzMessage.substring(85, 90),2),
                        Integer.parseInt(qzMessage.substring(90, 96), 2));
        
        
        ExpectedTsunamiArrivalTime expectedTsunamiArrivalTimeRegion2 =
                new ExpectedTsunamiArrivalTime(
                        tsunamiIssueTime(qzMessage.substring(21, 41)),
                        Integer.parseInt(qzMessage.substring(110, 111),2),
                        Integer.parseInt(qzMessage.substring(111, 116),2),
                        Integer.parseInt(qzMessage.substring(116, 122), 2));
    
        ExpectedTsunamiArrivalTime expectedTsunamiArrivalTimeRegion3 =
                new ExpectedTsunamiArrivalTime(
                        tsunamiIssueTime(qzMessage.substring(21, 41)),
                        Integer.parseInt(qzMessage.substring(136, 137),2),
                        Integer.parseInt(qzMessage.substring(137, 142),2),
                        Integer.parseInt(qzMessage.substring(142, 148),2));
    
    
        ExpectedTsunamiArrivalTime expectedTsunamiArrivalTimeRegion4 =
                new ExpectedTsunamiArrivalTime(
                        tsunamiIssueTime(qzMessage.substring(21, 41)),
                        Integer.parseInt(qzMessage.substring(162, 163),2),
                        Integer.parseInt(qzMessage.substring(163, 168), 2),
                        Integer.parseInt(qzMessage.substring(168, 174), 2));
    
        ExpectedTsunamiArrivalTime expectedTsunamiArrivalTimeRegion5 =
                new ExpectedTsunamiArrivalTime(
                        tsunamiIssueTime(qzMessage.substring(21, 41)),
                        Integer.parseInt(qzMessage.substring(188, 189),2),
                        Integer.parseInt(qzMessage.substring(189, 194),2),
                        Integer.parseInt(qzMessage.substring(194, 200),2));
        
        List<TsunamiRegion> tsunamiRegions = new ArrayList<>();

        tsunamiRegions.add(new TsunamiRegion(
                expectedTsunamiArrivalTimeRegion1.getHasseibi(),
                Integer.parseInt(qzMessage.substring(96, 100), 2),
                Integer.parseInt(qzMessage.substring(100, 110),2)));
        tsunamiRegions.add(new TsunamiRegion(
                expectedTsunamiArrivalTimeRegion2.getHasseibi(),
                Integer.parseInt(qzMessage.substring(122, 126),2),
                Integer.parseInt(qzMessage.substring(126, 136), 2)));
        tsunamiRegions.add(new TsunamiRegion(
                expectedTsunamiArrivalTimeRegion3.getHasseibi(),
                Integer.parseInt(qzMessage.substring(149, 152), 2),
                Integer.parseInt(qzMessage.substring(152, 162), 2)));
        tsunamiRegions.add(new TsunamiRegion(
                expectedTsunamiArrivalTimeRegion4.getHasseibi(),
                Integer.parseInt(qzMessage.substring(174, 178), 2),
                Integer.parseInt(qzMessage.substring(178, 188), 2)));
        tsunamiRegions.add(new TsunamiRegion(
                expectedTsunamiArrivalTimeRegion5.getHasseibi(),
                Integer.parseInt(qzMessage.substring(200, 204), 2),
                Integer.parseInt(qzMessage.substring(204, 214), 2)));
        tsunami.setTsunamiRegions(tsunamiRegions);
        
        return tsunami;
    }
    
    //private LocalDateTime expectedTsunamiArrivalTime(String message){
    //    int day = Integer.parseInt(message.substring(0, 1),2); //0or1
    //    int hour = Integer.parseInt(message.substring(1, 5),2);
    //    int minute  = Integer.parseInt(message.substring(5, 10),2);
    //    return LocalDateTime.of(LocalDateTime.now().getYear(),LocalDateTime.now().getMonth(),day,hour,minute);
    //}
    private LocalDateTime tsunamiIssueTime(String message){
        int month = Integer.parseInt(message.substring(0,4),2);
        int day = Integer.parseInt(message.substring(4,9),2);
        int hour = Integer.parseInt(message.substring(9,14),2);
        int minute  = Integer.parseInt(message.substring(14,19),2);
        return LocalDateTime.of(LocalDateTime.now().getYear(),month,day,hour,minute);
    }
    
}
