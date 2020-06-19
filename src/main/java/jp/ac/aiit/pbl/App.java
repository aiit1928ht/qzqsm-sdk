package jp.ac.aiit.pbl;

/**
 * あくまで呼び出し側として想定
 *
 */
public class App
{
    public static void main( String[] args ) {
        SeismicIntensityCreator sicreator = new SeismicIntensityCreator();
        
        //　本来は引数にDecord後の10進数を入れるが、便宜的に設定する
        //ただし、本コードではDecordの処理は考慮に入れていない。
        
        SeismicIntensity sirc = sicreator.seismicIntensityCreator("2");
        System.out.println(sirc.rcListReporter());
    }
}
