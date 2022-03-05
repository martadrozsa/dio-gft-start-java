package com.denisczwicz.chalenge.domain.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

@Data
@RequiredArgsConstructor
public class Developer {

    private final String name;

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

   public String getEnrolledContentsFormat() {
        String result = "";

        for (Content content : enrolledContents) {
            result += content.toString();
        }
        return result;
   }

    public String getCompletedContentsFormat() {
        String result = "";

        for (Content content : completedContents) {
            result += content.toString();
        }
        return result;
    }
}
