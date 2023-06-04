package com.example.FashionAssistant;

import android.content.Intent;
import android.widget.ImageView;

public class TipsData {
    private String tip1;
    private Integer img1;

    public TipsData(String tip1, Integer img1) {
        this.tip1 = tip1;
        this.img1 = img1;
    }

    public String getTip1() {
        return tip1;
    }

    public void setTip1(String tip1) {
        this.tip1 = tip1;
    }

    public Integer getImg1() {
        return img1;
    }

    public void setImg1(Integer img1) {
        this.img1 = img1;
    }
}
