package jp.ac.aiit.pbl.disaster.northwestpacifictsunami;

/**
 * Class for TsunamiInformation.
 */
public class TsunamiInformation {
    private ExpectedTsunamiArrivalTime expectedTsunamiArrivalTime;
    private TsunamiHeight tsunamiHeight;
    private CoastalRegion coastalRegion;

    public TsunamiInformation(ExpectedTsunamiArrivalTime expectedTsunamiArrivalTime, TsunamiHeight tsunamiHeight, CoastalRegion coastalRegion) {
        this.expectedTsunamiArrivalTime = expectedTsunamiArrivalTime;
        this.tsunamiHeight = tsunamiHeight;
        this.coastalRegion = coastalRegion;
    }

    public ExpectedTsunamiArrivalTime getExpectedTsunamiArrivalTime() {
        return expectedTsunamiArrivalTime;
    }

    public void setExpectedTsunamiArrivalTime(ExpectedTsunamiArrivalTime expectedTsunamiArrivalTime) {
        this.expectedTsunamiArrivalTime = expectedTsunamiArrivalTime;
    }

    public TsunamiHeight getTsunamiHeight() {
        return tsunamiHeight;
    }

    public void setTsunamiHeight(TsunamiHeight tsunamiHeight) {
        this.tsunamiHeight = tsunamiHeight;
    }

    public CoastalRegion getCoastalRegion() {
        return coastalRegion;
    }

    public void setCoastalRegion(CoastalRegion coastalRegion) {
        this.coastalRegion = coastalRegion;
    }

    @Override
    public String toString() {
        return "TsunamiInformation{" +
                "expectedTsunamiArrivalTime=" + expectedTsunamiArrivalTime +
                ", tsunamiHeight=" + tsunamiHeight +
                ", coastalRegion=" + coastalRegion +
                '}';
    }
}
