package com.denisczwicz.chalenge.domain.entities;

import java.time.LocalDate;

public class Mentorship extends Content {

    private final LocalDate date;

    public Mentorship(String title, String description, LocalDate date) {
        super(title, description);
        this.date = date;
    }

    @Override
    public double calculateXP() {
        return DEFAULT_XP + 20d;
    }

    @Override
    public String toString() {
        return "\n- MENTORSHIP - " +
                "\nTitle: " + getTitle() +
                "\nDescription: " + getDescription() +
                "\nDate: " + date
                ;
    }
}
