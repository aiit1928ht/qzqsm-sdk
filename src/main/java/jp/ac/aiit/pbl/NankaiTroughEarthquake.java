package jp.ac.aiit.pbl;

public class NankaiTroughEarthquake {
    private Prefix prefix;
    private TextInformations textInformations;
    private int pageNumber;
    private int totalPage;

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    public TextInformations getTextInformations() {
        return textInformations;
    }

    public void setTextInformations(TextInformations textInformations) {
        this.textInformations = textInformations;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    @Override
    public String toString() {
        return "NankaiTroughEarthquake{" +
                "prefix=" + prefix +
                ", textInformations=" + textInformations +
                ", pageNumber=" + pageNumber +
                ", totalPage=" + totalPage +
                '}';
    }
}
