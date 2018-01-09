package com.password.entity;

import com.password.strategy.ValidationStrategy;

/**
 * Created by Mahmut on 1/7/2018.
 */
public abstract class TextType {

    private long id;
    private String value;
    protected ValidationStrategy strategy;

    public abstract void validate();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ValidationStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public String toString() {
        return "TextType{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", strategy=" + strategy +
                '}';
    }
}
