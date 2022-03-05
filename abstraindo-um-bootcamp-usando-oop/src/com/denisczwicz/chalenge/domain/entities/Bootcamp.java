package com.denisczwicz.chalenge.domain.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@RequiredArgsConstructor
public class Bootcamp {

    private final String name;
    private final String description;
    private final Set<Content> contents = new LinkedHashSet<>();

    private LocalDate initialDate = LocalDate.now();
    private LocalDate finalDate = initialDate.plusDays(45);

    private Set<Developer> enrolledDevelopers = new HashSet<>();

    public void addContent(Collection<Content> values) {
        this.contents.addAll(values);
    }
}

