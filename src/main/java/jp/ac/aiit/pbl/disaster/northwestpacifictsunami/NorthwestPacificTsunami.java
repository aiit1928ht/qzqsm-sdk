package jp.ac.aiit.pbl.disaster.northwestpacifictsunami;

import jp.ac.aiit.pbl.Disaster;
import jp.ac.aiit.pbl.DisasterCategory;
import jp.ac.aiit.pbl.MessageType;
import jp.ac.aiit.pbl.Prefix;

import java.util.List;

/**
 * Class for NorthwestPacificTsunami disaster.
 *
 * Based on "Northwest Pacific Tsunami Information" of JMA-A/N.
 */
public class NorthwestPacificTsunami implements Disaster {
    private Prefix prefix;

    private TsunamigenicPotential tsunamigenicPotential;
    private List<TsunamiInformation> tsunamiInformations;

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    public TsunamigenicPotential getTsunamigenicPotential() {
        return tsunamigenicPotential;
    }

    public void setTsunamigenicPotential(TsunamigenicPotential tsunamigenicPotential) {
        this.tsunamigenicPotential = tsunamigenicPotential;
    }

    public List<TsunamiInformation> getTsunamiInformations() {
        return tsunamiInformations;
    }

    public void setTsunamiInformations(List<TsunamiInformation> tsunamiInformations) {
        this.tsunamiInformations = tsunamiInformations;
    }

    @Override
    public String toString() {
        return "NorthwestPacificTsunami{" +
                "prefix=" + prefix +
                ", tsunamigenicPotential=" + tsunamigenicPotential +
                ", tsunamiInformations=" + tsunamiInformations +
                '}';
    }

    @Override
    public MessageType getMessageType() {
        return this.prefix.getMessageType();
    }

    @Override
    public DisasterCategory getDisasterCategory() {
        return this.prefix.getDisasterCategory();
    }
}
