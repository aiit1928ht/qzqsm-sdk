package jp.ac.aiit.pbl;

import java.util.Arrays;
import java.util.List;

public class QZQSMDecoder {

    public void decode(String QZDCMessage){


    }


    private String toBinaryString(String QZDCMessage){
        StringBuilder binaryString = new StringBuilder();
        List<String> messages = Arrays.asList(QZDCMessage.split(""));
        for(int i =0; i < messages.size();i++){
            binaryString.append(String.format("%4s",Integer.toBinaryString(Integer.parseInt(messages.get(i),16))).replace(" ","0"));
        }
        return binaryString.toString();
    }
}
