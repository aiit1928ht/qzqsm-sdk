package jp.ac.aiit.pbl.disaster.NankaiTroughEarthquake;

import jp.ac.aiit.pbl.PrefixParser;

public class NankaiTroughEarthquakeParser {
    public NankaiTroughEarthquake parse(String qzqms) {
        NankaiTroughEarthquake nankaiTroughEarthquake = new NankaiTroughEarthquake();
        PrefixParser preParser = new PrefixParser();
        StringBuilder text = new StringBuilder();

        nankaiTroughEarthquake.setPrefix(preParser.parse(qzqms));

        for (int bit = 57; bit < 201; bit += (8 + 8 + 8)) {
            if (!qzqms.startsWith("00000000", bit)) {
                text.append(new String(
                        new byte[]{
                                (byte) Integer.parseUnsignedInt(qzqms.substring(bit, bit + 8), 2),
                                (byte) Integer.parseUnsignedInt(qzqms.substring(bit + 8, bit + 8 + 8), 2),
                                (byte) Integer.parseUnsignedInt(qzqms.substring(bit + 8 + 8, bit + 8 + 8 + 8), 2)
                        }
                        )
                );
            } else {
                break;
            }
        }

        nankaiTroughEarthquake.setText(text.toString());
        nankaiTroughEarthquake.setPageNumber(Integer.valueOf((String) qzqms.subSequence(201,201 + 6),2));
        nankaiTroughEarthquake.setTotalPage(Integer.valueOf((String) qzqms.subSequence(207,207 + 6),2));
        // Speare2 1bit 213, 213 + 1

        return nankaiTroughEarthquake;
    }
}
