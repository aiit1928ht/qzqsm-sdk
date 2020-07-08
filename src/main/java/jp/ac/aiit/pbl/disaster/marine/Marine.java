package jp.ac.aiit.pbl.disaster.marine;

import jp.ac.aiit.pbl.Prefix;
import java.util.List;

public class Marine {
    private Prefix prefix;
    private List<WarningCodeMarineForecastRegion> warningCodeMarineForecastRegion;

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    public List<WarningCodeMarineForecastRegion> getWarningCodeMarineForecastRegion() {
        return warningCodeMarineForecastRegion;
    }

    public void setWarningCodeMarineForecastRegion(List<WarningCodeMarineForecastRegion> warningCodeMarineForecastRegion) {
        this.warningCodeMarineForecastRegion = warningCodeMarineForecastRegion;
    }

    @Override
    public String toString() {
        return "Marine{" +
                "prefix=" + prefix +
                ", warningCodeMarineForecastRegion=" + warningCodeMarineForecastRegion +
                '}';
    }
}
