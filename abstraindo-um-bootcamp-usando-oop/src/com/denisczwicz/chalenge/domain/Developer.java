package com.denisczwicz.chalenge.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

@Data
public class Developer {

    private String name;

    private Set<Content> enrolledContents = new LinkedHashSet<>();
    private Set<Content> completedContents = new LinkedHashSet<>();

    public void signUpForBootcamp(Bootcamp bootcamp) {
        this.enrolledContents.addAll(bootcamp.getContents());
        bootcamp.getEnrolledDevelopers().add(this);
    }

    public void progress() {
        Optional<Content> content = this.enrolledContents.stream().findFirst();
        if(content.isPresent()) {
            this.completedContents.add(content.get());
            this.enrolledContents.remove(content.get());
        } else {
            System.err.println("You are not enrolled in any content!");
        }
    }

    public double calculateTotalXP() {
        return this.completedContents.stream().mapToDouble(Content::calculateXP).sum();
    }

}
