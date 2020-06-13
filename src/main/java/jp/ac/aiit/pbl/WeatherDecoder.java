package jp.ac.aiit.pbl;

import java.math.BigInteger;

public class WeatherDecoder {

    private String qzqsm;
    private String commonData;

    public WeatherDecoder(String qzqsm) {
        this.qzqsm = qzqsm;
        this.commonData = qzqsm;
    }

    public WeatherDecoder(String qzqsm, int radix) {
        this.qzqsm = radix == 16 ? hexToBin(qzqsm) : qzqsm;
        this.commonData = qzqsm;
    }

    public String hexToBin(String hexData) {
        /**
         * CRCを除いた16進数のQZQMSデータを2進数へ変換する.
         */
        return new BigInteger(hexData, 16).toString(2);
    }

    public HashMap dcDecord() {
        /**
         * CRCを除いたQZQMSデータの内, PABからInfomation Typeまでを2進数からデコードする.
         * @param hexData CRCを除いたQXQMS
         * @return dcCommonInfo DCReportと残りのデータ
         */

        return dcCommonInfo;
    }
}
