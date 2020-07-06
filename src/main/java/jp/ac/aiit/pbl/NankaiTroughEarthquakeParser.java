package jp.ac.aiit.pbl;

public class NankaiTroughEarthquakeParser {

    public NankaiTroughEarthquake parse(String qzqms) {
        NankaiTroughEarthquake nankaiTroughEarthquake = new NankaiTroughEarthquake();
        PrefixParser preParser = new PrefixParser();
        nankaiTroughEarthquake.setPrefix(preParser.parse(qzqms));

        TextInformations textInformations = new TextInformations();
        TextInformationCharacters textInformationCharacters1 = new TextInformationCharacters();
        TextInformationCharacters textInformationCharacters2 = new TextInformationCharacters();
        TextInformationCharacters textInformationCharacters3 = new TextInformationCharacters();
        TextInformationCharacters textInformationCharacters4 = new TextInformationCharacters();
        TextInformationCharacters textInformationCharacters5 = new TextInformationCharacters();
        TextInformationCharacters textInformationCharacters6 = new TextInformationCharacters();

        textInformationCharacters1.setByteCodes(
                (byte)Integer.parseUnsignedInt(qzqms.substring(57, 57 + 8),2),
                (byte)Integer.parseUnsignedInt(qzqms.substring(57 + 8, 57 + 8 + 8),2),
                (byte)Integer.parseUnsignedInt(qzqms.substring(57 + 8 + 8, 57 + 8 + 8 +8),2)
        );

        textInformationCharacters2.setByteCodes(
                (byte)Integer.parseUnsignedInt(qzqms.substring(81, 81 + 8),2),
                (byte)Integer.parseUnsignedInt(qzqms.substring(81 + 8, 81 + 8 + 8),2),
                (byte)Integer.parseUnsignedInt(qzqms.substring(81 + 8 + 8, 81 + 8 + 8 + 8),2)
        );

        textInformationCharacters3.setByteCodes(
                (byte)Integer.parseUnsignedInt(qzqms.substring(105, 105 + 8),2),
                (byte)Integer.parseUnsignedInt(qzqms.substring(105 + 8, 105 + 8 + 8),2),
                (byte)Integer.parseUnsignedInt(qzqms.substring(105 + 8 + 8, 105 + 8 + 8 + 8),2)
        );

        textInformationCharacters4.setByteCodes(
                (byte)Integer.parseUnsignedInt(qzqms.substring(129, 129 + 8),2),
                (byte)Integer.parseUnsignedInt(qzqms.substring(129 + 8, 129 + 8 + 8),2),
                (byte)Integer.parseUnsignedInt(qzqms.substring(129 + 8 + 8, 129 + 8 + 8 + 8),2)
        );

        textInformationCharacters5.setByteCodes(
                (byte)Integer.parseUnsignedInt(qzqms.substring(153, 153 + 8),2),
                (byte)Integer.parseUnsignedInt(qzqms.substring(153 + 8, 153 + 8 + 8),2),
                (byte)Integer.parseUnsignedInt(qzqms.substring(153 + 8 + 8, 153 + 8 + 8 + 8),2)
        );

        textInformationCharacters6.setByteCodes(
                (byte)Integer.parseUnsignedInt(qzqms.substring(177, 177 + 8),2),
                (byte)Integer.parseUnsignedInt(qzqms.substring(177 + 8, 177 + 8 + 8),2),
                (byte)Integer.parseUnsignedInt(qzqms.substring(177 + 8 + 8, 177 + 8 + 8 + 8),2)
        );

        textInformations.setTextInformationCharacters(
                textInformationCharacters1.getCharacter(),
                textInformationCharacters2.getCharacter(),
                textInformationCharacters3.getCharacter(),
                textInformationCharacters4.getCharacter(),
                textInformationCharacters5.getCharacter(),
                textInformationCharacters6.getCharacter()
        );

        nankaiTroughEarthquake.setTextInformations(textInformations);
        nankaiTroughEarthquake.setPageNumber(Integer.valueOf((String) qzqms.subSequence(201,201 + 6),2));
        nankaiTroughEarthquake.setTotalPage(Integer.valueOf((String) qzqms.subSequence(207,207 + 6),2));
        // Speare2 1bit 213, 213 + 1

        return nankaiTroughEarthquake;
    }
}
