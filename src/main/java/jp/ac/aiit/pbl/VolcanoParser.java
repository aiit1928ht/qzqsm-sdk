package jp.ac.aiit.pbl;
import java.time.LocalDateTime;

public class VolcanoParser {

    public Volcano parse(String qzMessage){
        Volcano volcano = new Volcano();
        volcano.setActivityTime(toActivityTime(qzMessage.substring(53,69)));
        volcano.setWarningCode(WarningCode.getById(Integer.parseInt(qzMessage.substring(69,76))));
        volcano.setVolcanoName(VolcanoName.getById(Integer.parseInt(qzMessage.substring(76,88))));
        volcano.setLocalGovernmentRegion1(LocalGovernment.getById(Integer.parseInt(qzMessage.substring(88,111))));
        volcano.setLocalGovernmentRegion2(LocalGovernment.getById(Integer.parseInt(qzMessage.substring(111,134))));
        volcano.setLocalGovernmentRegion3(LocalGovernment.getById(Integer.parseInt(qzMessage.substring(134,157))));
        volcano.setLocalGovernmentRegion4(LocalGovernment.getById(Integer.parseInt(qzMessage.substring(157,180))));
        volcano.setLocalGovernmentRegion5(LocalGovernment.getById(Integer.parseInt(qzMessage.substring(180,203))));
        return volcano;

    }

    private LocalDateTime toActivityTime(String message){
            int day = Integer.parseInt(message.substring(0,4),2);
            int hour = Integer.parseInt(message.substring(4,9),2);
            int minute  = Integer.parseInt(message.substring(9,15),2);
            return LocalDateTime.of(LocalDateTime.now().getYear(),LocalDateTime.now().getMonth(),day,hour,minute);
    }
}
