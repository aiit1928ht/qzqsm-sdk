package jp.ac.aiit.pbl.diaster.marine;

import jp.ac.aiit.pbl.LocalGovernment;
import jp.ac.aiit.pbl.diaster.marine.WarningCode;

public class WarningCodeMarineForecastRegion {
    private WarningCode warningCode;
    private MarineForecastRegion marineForecastRegion;

    WarningCodeMarineForecastRegion(int warningCodeId, int marineForecastRegionId) {
        this.warningCode = WarningCode.getById(warningCodeId);
        this.marineForecastRegion = MarineForecastRegion.getById(marineForecastRegionId);
    }

    public WarningCode getWarningCode() {
        return warningCode;
    }

    public void setWarningCode(WarningCode warningCode) {
        this.warningCode = warningCode;
    }

    public MarineForecastRegion getMarineForecastRegion() {
        return marineForecastRegion;
    }

    public void setMarineForecastRegion(MarineForecastRegion marineForecastRegion) {
        this.marineForecastRegion = marineForecastRegion;
    }

    @Override
    public String toString() {
        return "WarningCodeMarineForecastRegion{" +
                "warningCode=" + warningCode +
                ", marineForecastRegion=" + marineForecastRegion +
                '}';
    }
}
