package jp.ac.aiit.pbl;

import java.time.LocalDateTime;

public class Hypocenter {
    private Prefix prefix;
    private LocalDateTime occurrenceTime;
    
    public Prefix getPrefix() {
        return prefix;
    }
    
    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }
    
    public void setOccurrenceTime(LocalDateTime occurrenceTime) {
        this.occurrenceTime = occurrenceTime;
    }
}
