package jp.ac.aiit.pbl.disaster.typhoon;

import java.util.Arrays;

public enum ScaleCategory {
    scaleCategoryNone(0, "なし"),
    scaleCategoryLargeScale(1, "大型"),
    scaleCategorySuperScale(2, "超大型"),
    scaleCategoryOthers(15,"その他の大きさ階級分類");

    private int id;
    private String scaleCategory;

    ScaleCategory(int id, String scaleCategory){
        this.id = id;
        this.scaleCategory = scaleCategory;
    }

    public Integer getId(){
        return id;
    }

    public static ScaleCategory getById(int id) {
        return Arrays.stream(ScaleCategory.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
