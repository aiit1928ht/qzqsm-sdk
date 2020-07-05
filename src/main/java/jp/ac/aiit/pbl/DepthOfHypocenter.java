package jp.ac.aiit.pbl;

public class DepthOfHypocenter {
    private int depthOfHypocenter;
    
    DepthOfHypocenter(int depthOfHypocenter){
        this.depthOfHypocenter = depthOfHypocenter;
    }
    
    public int getDepthOfHypocenter() {
        return depthOfHypocenter;
    }
    
    @Override
    public String toString() {
        return "{" +
                "depthOfHypocenter=" + depthOfHypocenter +
                '}';
    }
}
