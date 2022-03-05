package com.denisczwicz.chalenge.domain;

import lombok.Data;

@Data
public abstract class Content {

    protected static final double DEFAULT_XP = 10d;

    private String title;
    private String description;

    public abstract double calculateXP();
}
