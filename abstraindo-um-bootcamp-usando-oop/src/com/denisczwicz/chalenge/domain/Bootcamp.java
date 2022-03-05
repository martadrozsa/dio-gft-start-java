package com.denisczwicz.chalenge.domain;

import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
public class Bootcamp {

    private String name;
    private String description;
    private LocalDate initialDate = LocalDate.now();
    private LocalDate finalDate = initialDate.plusDays(45);

    private Set<Developer> enrolledDevelopers = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

}

