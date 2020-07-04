package jp.ac.aiit.pbl;

import java.time.LocalDateTime;

public class HypocenterParser {
    
    public Hypocenter parse(String qzMessage){
        Hypocenter hypocenter = new Hypocenter();
        
        PrefixParser prefixParser = new PrefixParser();
        hypocenter.setPrefix(prefixParser.parse(qzMessage));
        
        hypocenter.setOccurrenceTime(toOccurrenceTime(qzMessage.substring(81, 96)));
        
        return hypocenter;
    }
    
    private LocalDateTime toOccurrenceTime(String message){
        int day = Integer.parseInt(message.substring(0, 4),2);
        int hour = Integer.parseInt(message.substring(4, 9),2);
        int minute  = Integer.parseInt(message.substring(9, 15),2);
        return LocalDateTime.of(LocalDateTime.now().getYear(),LocalDateTime.now().getMonth(),day,hour,minute);
    }

}
