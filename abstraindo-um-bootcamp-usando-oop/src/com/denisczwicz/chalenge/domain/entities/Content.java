package com.denisczwicz.chalenge.domain.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Data
public abstract class Content {

    protected static final double DEFAULT_XP = 10d;

    private String title;
    private String description;

    public Content(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public abstract double calculateXP();
}
