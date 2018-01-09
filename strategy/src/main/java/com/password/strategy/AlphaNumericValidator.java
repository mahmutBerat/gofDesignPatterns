package com.password.strategy;

import com.password.entity.TextType;

/**
 * Created by Mahmut on 1/7/2018.
 */
public class AlphaNumericValidator implements ValidationStrategy {
    public boolean validate(TextType value) {
        return false;
    }
}
