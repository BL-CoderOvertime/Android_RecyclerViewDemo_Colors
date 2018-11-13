package com.lambdaschool.recyclerview;

public class ColorData {
    private int colorId;
    private String colorName;

    public ColorData(int colorId, String colorName) {
        this.colorId = colorId;
        this.colorName = colorName;
    }

    public int getColorId() {
        return colorId;
    }

    public String getColorName() {
        return colorName;
    }
}
