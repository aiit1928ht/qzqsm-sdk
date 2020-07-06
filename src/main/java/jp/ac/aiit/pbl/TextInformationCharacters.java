package jp.ac.aiit.pbl;

public class TextInformationCharacters {
    private String character;
    private byte[] byteCode = new byte[3];

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public byte[] getByteCode() {
        return byteCode;
    }

    public void setByteCode(byte[] byteCode) {
        this.byteCode = byteCode;
    }

    public void setByteCodes(Byte head, Byte midd, Byte last) {
        this.byteCode[0] = head;
        this.byteCode[1] = midd;
        this.byteCode[2] = last;
        this.character = new String(byteCode);
    }
}
