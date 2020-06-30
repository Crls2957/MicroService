package com.crls.thrift.user.dto;

import java.io.Serializable;

public class UpDTO implements Serializable {
    private String intro;
    private int stars;

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "UpDTO{" +
                "intro='" + intro + '\'' +
                ", stars=" + stars +
                '}';
    }
}
