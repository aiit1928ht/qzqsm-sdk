package jp.ac.aiit.pbl.disaster.northwestpacifictsunami;

import jp.ac.aiit.pbl.PrefixParser;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for NorthwestPacificTsunamiParser.
 * Return NorthwestPacificTsunami Class.
 */
public class NorthwestPacificTsunamiParser {
    public NorthwestPacificTsunami parse(String qzqms) {
        NorthwestPacificTsunami northwestPacificTsunami = new NorthwestPacificTsunami();
        PrefixParser preParser = new PrefixParser();

        northwestPacificTsunami.setPrefix(preParser.parse(qzqms));
        northwestPacificTsunami.setTsunamigenicPotential(
                TsunamigenicPotential.getById(Integer.parseInt(qzqms.substring(53, 53 + 3), 2))
        );
        northwestPacificTsunami.setTsunamiInformations(tsunamiInformationTransducer(qzqms.substring(56, 196)));
        // Speare2 18bit 197, 197 + 18

        return northwestPacificTsunami;
    }

    private List<TsunamiInformation> tsunamiInformationTransducer(String qzqmsPart) {
        List<TsunamiInformation> tsunamiInformationArrayList = new ArrayList<>();
        for (int bit = 0; bit < ((12 + 9 + 7) * 5); bit += (12 + 9 + 7)) {
            if (!qzqmsPart.startsWith("000000000000" + "000000000" + "0000000", bit)) {
                TsunamiInformation tsunamiInformation = new TsunamiInformation(
                        new ExpectedTsunamiArrivalTime(
                                qzqmsPart.substring(bit, bit + 12)
                        ), // TODO:
                        TsunamiHeight.getById(
                                Integer.parseInt(qzqmsPart.substring(bit + 12, bit + 12 + 9), 2)
                        ),
                        CoastalRegion.getById(
                                Integer.parseInt(qzqmsPart.substring(bit + 12 + 9, bit + 12 + 9 + 7), 2)
                        )
                );
                tsunamiInformationArrayList.add(tsunamiInformation);
            } else {
                break;
            }
        }
        return tsunamiInformationArrayList;
    }
}
