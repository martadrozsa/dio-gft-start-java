package com.denisczwicz.chalenge.domain.program;

import com.denisczwicz.chalenge.domain.entities.*;

import java.time.LocalDate;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Course course1 = new Course("Java Course", "Object oriented programming java course", 15);
        Course course2 = new Course("Data structure", "Data structure introduction", 5);
        Course course3 = new Course("Flutter Course", "Flutter introduction", 10 );
        Course course4 = new Course("Dart Course", "Dart introduction", 8);

        Mentorship mentorship1 = new Mentorship("Java Course", "Java Course Mentorship", LocalDate.now());
        Mentorship mentorship2 = new Mentorship("Data structure Course", "Data structure Course Mentorship", LocalDate.now());
        Mentorship mentorship3 = new Mentorship("Flutter Course", "Flutter Course Mentorship", LocalDate.now());
        Mentorship mentorship4 = new Mentorship("Dart Course", "Dart Course Mentorship", LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp("Bootcamp Java Developer", "Java Bootcamp");
        bootcampJava.addContent(List.of(course1, course2, mentorship1));
        Bootcamp bootcampFlutter = new Bootcamp("Bootcamp Flutter Developer","Flutter Bootcamp");
        bootcampFlutter.addContent(List.of(course3, course4, mentorship3));

        Developer developer1 = new Developer("Marta Denisczwicz Rozsa");
        developer1.signUpForBootcamp(bootcampJava);

        printFormated(developer1);

        Developer developer2 = new Developer("Vitor Rozsa");
        developer2.signUpForBootcamp(bootcampFlutter);

        printFormated(developer2);
    }

    public static void printFormated(Developer developer) {
        System.out.println("\nDeveloper: " + developer.getName() + "\nEnrolled Contents: " + developer.getEnrolledContentsFormat() + "\n");
        developer.progress();
        System.out.println("\nEnrolled Contents: " + developer.getEnrolledContentsFormat() + "\n");
        System.out.println("Completed Contents: " + developer.getEnrolledContentsFormat());
        System.out.println("XP: " + developer.calculateTotalXP());
    }
}