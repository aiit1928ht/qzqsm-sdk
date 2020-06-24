package jp.ac.aiit.pbl;
import java.io.StringBufferInputStream;
import java.time.LocalDateTime;

public class VolcanoParser {

    public Volcano parse(String qzMessage){
        Volcano volcano = new Volcano();
        volcano.setActivityTime(toActivityTime(qzMessage.substring(53,69)));
       // volcano.setWarningCode(WarningCode.getById(qzMessage.substring(69,76)));
       // volcano.setVolcanoName(VolcanoName.getById(qzMessage.substring(76,88)));
        //volcano.setLocalGovernmentRegion1(VolcanoLocalGovernment.getById(qzMessage.substring(88,111)));
        //volcano.setLocalGovernmentRegion2(VolcanoLocalGovernment.getById(qzMessage.substring(111,134)));
        //volcano.setLocalGovernmentRegion3(VolcanoLocalGovernment.getById(qzMessage.substring(134,157)));
        //volcano.setLocalGovernmentRegion4(VolcanoLocalGovernment.getById(qzMessage.substring(157,180)));
        //volcano.setLocalGovernmentRegion5(VolcanoLocalGovernment.getById(qzMessage.substring(180,203)));
        volcano.setSpare2(qzMessage.substring(203,214));
        volcano.setVersion(qzMessage.substring(214,220));
        volcano.setReserved(qzMessage.substring(220,226));
        volcano.setCrc(qzMessage.substring(226,250));
        return volcano;

    }

    private String toActivityTime(String message){
        String day =  Integer.toString(Integer.parseInt(message.substring(0,4),2));
        String hour =  Integer.toString(Integer.parseInt(message.substring(4,9),2));
        String minute  = Integer.toString(Integer.parseInt(message.substring(9,15),2));

        return day+"day"+hour+"hour"+minute+"minute";
    }
}
