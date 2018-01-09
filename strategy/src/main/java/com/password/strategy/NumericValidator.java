package com.password.strategy;

import com.password.entity.TextType;

/**
 * Created by Mahmut on 1/7/2018.
 */
public class NumericValidator implements ValidationStrategy {
    public boolean validate(TextType value) {
        System.out.println("Numeric Validator checking text type instance" + value.toString());
        return false;
    }
}
