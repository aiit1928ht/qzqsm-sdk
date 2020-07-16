package jp.ac.aiit.pbl.disaster.tsunami;

import jp.ac.aiit.pbl.*;
import jp.ac.aiit.pbl.disaster.seismicIntensity.Warning;

import java.util.List;

public class Tsunami implements Disaster {
    private Prefix prefix;
    private List<Notification> notifications;
    private WarningCode warningCode;
    private List<TsunamiRegion> tsunamiRegions;
    
    public Prefix getPrefix() {
        return prefix;
    }
    
    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }
    
    public List<Notification> getNotifications() {
        return notifications;
    }
    
    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }
    
    public WarningCode getWarningCode() {
        return warningCode;
    }
    
    public void setWarningCode(WarningCode warningCode) {
        this.warningCode = warningCode;
    }
    
    public List<TsunamiRegion> getTsunamiRegions() {
        return tsunamiRegions;
    }
    
    public void setTsunamiRegions(List<TsunamiRegion> tsunamiRegions) {
        this.tsunamiRegions = tsunamiRegions;
    }
    
    @Override
    public MessageType getMessageType() {
        return null;
    }
    
    @Override
    public DisasterCategory getDisasterCategory() {
        return null;
    }
}
