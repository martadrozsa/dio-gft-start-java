package com.denisczwicz.chalenge.domain.entities;

import lombok.Data;

public class Course extends Content {

    private final int totalHours;

    public Course(String title, String description, int totalHours) {
        super(title, description);
        this.totalHours = totalHours;
    }

    @Override
    public double calculateXP() {
        return DEFAULT_XP * totalHours;
    }

    @Override
    public String toString() {
        return "\n- COURSE - " +
                "\nTitle: " + getTitle() +
                "\nDescription: " + getDescription() +
                "\nTotal hours: " + totalHours
                ;
    }
}
