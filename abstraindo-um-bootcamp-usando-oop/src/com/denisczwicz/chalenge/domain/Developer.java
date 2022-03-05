package com.denisczwicz.chalenge.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
@AllArgsConstructor
public class Developer {

    private String name;

    private Set<Content> enrolledContents = new LinkedHashSet<>();
    private Set<Content> completedContents = new LinkedHashSet<>();

    public void signUpBootcamp(Bootcamp bootcamp) {
    }

    public void progress() {
    }

    public void calculateTotalXP() {
    }
}
