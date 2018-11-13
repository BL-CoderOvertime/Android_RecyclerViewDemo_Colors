package com.lambdaschool.recyclerview;

import java.util.ArrayList;

public class ColorDataFactory {
    public static ArrayList<ColorData> getColorDataList() {
        ArrayList<ColorData> colorDataArrayList = new ArrayList<>();
        for(int i = 0; i < PrebuiltData.COLOR_IDS.length; ++i) {
            colorDataArrayList.add(
                    new ColorData(
                            PrebuiltData.COLOR_IDS[i],
                            PrebuiltData.COLOR_NAMES[i].replaceAll("_", " ")));
        }
        return colorDataArrayList;
    }
}
