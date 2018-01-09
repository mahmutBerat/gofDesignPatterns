package com.password.entity;

/**
 * Created by Mahmut on 1/7/2018.
 */
public class DateText extends TextType{

    private String specialAttr;

    public String getSpecialAttr() {
        return specialAttr;
    }

    public void setSpecialAttr(String specialAttr) {
        this.specialAttr = specialAttr;
    }

    public void validate() {
        strategy.validate(this);
    }
}
