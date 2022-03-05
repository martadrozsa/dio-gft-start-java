package com.denisczwicz.chalenge.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Course {

    private String title;
    private String description;
    private  int totalHours;
}
