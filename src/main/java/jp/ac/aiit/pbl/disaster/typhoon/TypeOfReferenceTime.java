package jp.ac.aiit.pbl.disaster.typhoon;

import java.util.Arrays;

/**
 * Enumeration for TypeOfReferenceTime.
 * CASE1 getById:Return typeOfReferenceTime {Live or Estimate or Forecast}.
 * CASE2 getId:Return Id.
 */
public enum TypeOfReferenceTime {
    typeOfReferenceTimeLive(1, "実況"),
    typeOfReferenceTimeEstimate(2, "推定"),
    typeOfReferenceTimeForecast(3, "予報");

    private int id;
    private String typeOfReference;

    TypeOfReferenceTime(int id, String typeOfReference){
        this.id = id;
        this.typeOfReference = typeOfReference;
    }

    public Integer getId(){
        return id;
    }

    public static TypeOfReferenceTime getById(int id) {
        return Arrays.stream(TypeOfReferenceTime.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}