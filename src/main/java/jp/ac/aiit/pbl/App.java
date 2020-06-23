package jp.ac.aiit.pbl;

/**
 * あくまで呼び出し側として想定
 *
 */
public class App
{
    public static void main( String[] args ) {
        SeismicIntensity pc = new SeismicIntensity();
        pc.setPrefectureRegion1(PrefectureCode.getRegion(1));
        System.out.println(pc.getPrefectureRegion1());
    }
}

