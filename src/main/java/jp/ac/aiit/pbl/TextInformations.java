package jp.ac.aiit.pbl;

public class TextInformations {
    private String text;
    private String textInformationCharacter1;
    private String textInformationCharacter2;
    private String textInformationCharacter3;
    private String textInformationCharacter4;
    private String textInformationCharacter5;
    private String textInformationCharacter6;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTextInformationCharacters(
            String textInformationCharacter1,
            String textInformationCharacter2,
            String textInformationCharacter3,
            String textInformationCharacter4,
            String textInformationCharacter5,
            String textInformationCharacter6
            ) {
        this.textInformationCharacter1 = textInformationCharacter1;
        this.textInformationCharacter2 = textInformationCharacter2;
        this.textInformationCharacter3 = textInformationCharacter3;
        this.textInformationCharacter4 = textInformationCharacter4;
        this.textInformationCharacter5 = textInformationCharacter5;
        this.textInformationCharacter6 = textInformationCharacter6;
        this.setText( "" +
                textInformationCharacter1 +
                textInformationCharacter2 +
                textInformationCharacter3 +
                textInformationCharacter4 +
                textInformationCharacter5 +
                textInformationCharacter6 +
                ""
        );
    }

    @Override
    public String toString() {
        return "TextInformations{" +
                "text='" + text + '\'' +
                ", textInformationCharacter1=" + textInformationCharacter1 +
                ", textInformationCharacter2=" + textInformationCharacter2 +
                ", textInformationCharacter3=" + textInformationCharacter3 +
                ", textInformationCharacter4=" + textInformationCharacter4 +
                ", textInformationCharacter5=" + textInformationCharacter5 +
                ", textInformationCharacter6=" + textInformationCharacter6 +
                '}';
    }
}