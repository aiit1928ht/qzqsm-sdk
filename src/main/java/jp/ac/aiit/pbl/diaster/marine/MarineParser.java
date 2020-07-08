package jp.ac.aiit.pbl.diaster.marine;

import jp.ac.aiit.pbl.Disaster;
import jp.ac.aiit.pbl.DisasterParser;
import jp.ac.aiit.pbl.PrefixParser;
import java.util.ArrayList;
import java.util.List;

public class MarineParser{

    public Marine parse(String qzMessage) {
        Marine marine = new Marine();

        PrefixParser prefixParser = new PrefixParser();
        marine.setPrefix(prefixParser.parse(qzMessage));

        List<WarningCodeMarineForecastRegion> warningCodeMarineForecastRegions = new ArrayList<>();
        warningCodeMarineForecastRegions.add(new WarningCodeMarineForecastRegion(
                Integer.parseInt(qzMessage.substring(53, 58), 2),
                Integer.parseInt(qzMessage.substring(58, 72), 2)));
        warningCodeMarineForecastRegions.add(new WarningCodeMarineForecastRegion(
                Integer.parseInt(qzMessage.substring(72, 77), 2),
                Integer.parseInt(qzMessage.substring(77, 91), 2)));
        warningCodeMarineForecastRegions.add(new WarningCodeMarineForecastRegion(
                Integer.parseInt(qzMessage.substring(91, 96), 2),
                Integer.parseInt(qzMessage.substring(96, 110), 2)));
        warningCodeMarineForecastRegions.add(new WarningCodeMarineForecastRegion(
                Integer.parseInt(qzMessage.substring(110, 115), 2),
                Integer.parseInt(qzMessage.substring(115, 129), 2)));
        warningCodeMarineForecastRegions.add(new WarningCodeMarineForecastRegion(
                Integer.parseInt(qzMessage.substring(129, 134), 2),
                Integer.parseInt(qzMessage.substring(134, 148), 2)));
        warningCodeMarineForecastRegions.add(new WarningCodeMarineForecastRegion(
                Integer.parseInt(qzMessage.substring(148, 153), 2),
                Integer.parseInt(qzMessage.substring(153, 167), 2)));
        warningCodeMarineForecastRegions.add(new WarningCodeMarineForecastRegion(
                Integer.parseInt(qzMessage.substring(167, 172), 2),
                Integer.parseInt(qzMessage.substring(172, 186), 2)));
        warningCodeMarineForecastRegions.add(new WarningCodeMarineForecastRegion(
                Integer.parseInt(qzMessage.substring(186, 191), 2),
                Integer.parseInt(qzMessage.substring(191, 205), 2)));
        marine.setWarningCodeMarineForecastRegion(warningCodeMarineForecastRegions);
        return marine;
    }
}
