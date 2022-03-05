package com.denisczwicz.chalenge.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Mentorship {

    private String title;
    private String description;
    private LocalDate date;
}
