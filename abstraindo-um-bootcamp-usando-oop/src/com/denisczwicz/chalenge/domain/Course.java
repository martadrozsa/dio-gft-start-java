package com.denisczwicz.chalenge.domain;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Course extends Content{

    private  int totalHours;

    @Override
    public double calculateXP() {
        return DEFAULT_XP * totalHours;
    }

    @Override
    public String toString() {
        return "Course: " +
                "tile: " + getTitle() +
                "description: " + getDescription() +
                "total hours: " + totalHours +
                '}';
    }
}
