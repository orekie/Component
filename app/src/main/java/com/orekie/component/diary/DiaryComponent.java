package com.orekie.component.diary;

public class DiaryComponent {

    public static final int TYPE_TEXT = 1011;
    public static final int TYPE_IMAGE = 1012;
    public static final int TYPE_VOICE = 1013;

    private int type;

    public DiaryComponent(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}
