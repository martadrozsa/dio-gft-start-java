package com.denisczwicz.chalenge.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Mentorship extends Content{

    private LocalDate date;

    @Override
    public double calculateXP() {
        return DEFAULT_XP + 20d;
    }

    @Override
    public String toString() {
        return "Mentorship: " +
                "tile: " + getTitle() +
                "description: " + getDescription() +
                "date: " + date +
                '}';
    }
}
