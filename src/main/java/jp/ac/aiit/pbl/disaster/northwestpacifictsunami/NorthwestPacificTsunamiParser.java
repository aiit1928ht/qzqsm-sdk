package jp.ac.aiit.pbl.disaster.northwestpacifictsunami;

import jp.ac.aiit.pbl.PrefixParser;

/**
 * Class for NorthwestPacificTsunamiParser.
 * Return NorthwestPacificTsunami Class.
 */
public class NorthwestPacificTsunamiParser {
    public NorthwestPacificTsunami parse(String qzqms) {
        NorthwestPacificTsunami northwestPacificTsunami = new NorthwestPacificTsunami();
        PrefixParser preParser = new PrefixParser();

        northwestPacificTsunami.setPrefix(preParser.parse(qzqms));
        // Speare2 18bit 197, 197 + 18

        return northwestPacificTsunami;
    }
}
