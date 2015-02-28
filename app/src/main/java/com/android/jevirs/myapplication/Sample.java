package com.android.jevirs.myapplication;

/**
 * Created by jevirs on 2015/2/28.
 */
public class Sample {
    private String text;
    private int imageViewId;

    public Sample(String text,int imageViewId){
        this.text=text;
        this.imageViewId=imageViewId;
    }
    public String getText() {
        return text;
    }

    public int getImageViewId() {
        return imageViewId;
    }
}
