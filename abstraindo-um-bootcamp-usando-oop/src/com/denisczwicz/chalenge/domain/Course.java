package com.denisczwicz.chalenge.domain;


import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Course extends Content{

    private  int totalHours;

    @Override
    public double calculateXP() {
        return DEFAULT_XP * totalHours;
    }

    @Override
    public String toString() {
        return "Course " +
                "\nTile: " + getTitle() +
                "\nDescription: " + getDescription() +
                "\nTotal hours: " + totalHours +
                '}';
    }
}
