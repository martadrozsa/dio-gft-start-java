package com.denisczwicz.chalenge.domain;

import java.time.LocalDate;

public class Program {

    public static void main(String[] args) {

        Course course1 = new Course();
        course1.setTitle("Java Course");
        course1.setDescription("Object oriented programming java course");
        course1.setTotalHours(15);

        Course course2 = new Course();
        course2.setTitle("Data structure");
        course2.setDescription("Data structure introduction");
        course2.setTotalHours(5);

        Course course3 = new Course();
        course3.setTitle("Flutter Course");
        course3.setDescription("Flutter introduction");
        course3.setTotalHours(10);

        Course course4= new Course();
        course4.setTitle("Dart Course");
        course4.setDescription("Dart introduction");
        course4.setTotalHours(8);

        Mentorship mentorship1 = new Mentorship();
        mentorship1.setTitle("Java Course");
        mentorship1.setDescription("Java Course Mentorship");
        mentorship1.setDate(LocalDate.now());

        Mentorship mentorship2 = new Mentorship();
        mentorship2.setTitle("Data structure Course");
        mentorship2.setDescription("Data structure Course Mentorship");
        mentorship2.setDate(LocalDate.now());

        Mentorship mentorship3= new Mentorship();
        mentorship3.setTitle("Flutter Course");
        mentorship3.setDescription("Flutter Course Mentorship");
        mentorship3.setDate(LocalDate.now());

        Mentorship mentorship4= new Mentorship();
        mentorship4.setTitle("Dart Course");
        mentorship4.setDescription("Dart Course Mentorship");
        mentorship4.setDate(LocalDate.now());

//        System.out.println(course1 + "\n");
//        System.out.println(course2 + "\n");
//        System.out.println(course3 + "\n");
//        System.out.println(course4 + "\n");
//        System.out.println(mentorship1 + "\n");
//        System.out.println(mentorship2 + "\n");
//        System.out.println(mentorship3 + "\n");
//        System.out.println(mentorship4);

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setName("Bootcamp Java Developer");
        bootcampJava.setDescription("Java Bootcamp");
        bootcampJava.getContents().add(course1);
        bootcampJava.getContents().add(course2);
        bootcampJava.getContents().add(mentorship1);

        Bootcamp bootcampFlutter = new Bootcamp();
        bootcampFlutter.setName("Bootcamp Flutter Developer");
        bootcampFlutter.setDescription("Flutter Bootcamp");
        bootcampFlutter.getContents().add(course3);
        bootcampFlutter.getContents().add(course4);
        bootcampFlutter.getContents().add(mentorship3);

        Developer developer1 = new Developer();
        developer1.setName("Marta Denisczwicz Rozsa");
        developer1.signUpForBootcamp(bootcampJava);

        System.out.println("\nEnrolled Contents: " + developer1.getName() + developer1.getEnrolledContents() + "\n");
        developer1.progress();
        System.out.println("----");
        System.out.println("\nEnrolled Contents: " + developer1.getName() + developer1.getEnrolledContents() + "\n");
        System.out.println("Completed Contents: " + developer1.getName() + developer1.getCompletedContents());
        System.out.println("XP: " + developer1.calculateTotalXP() + "\n");

        System.out.println("____________________\n");

        Developer developer2 = new Developer();
        developer2.setName("Vitor Rozsa");
        developer2.signUpForBootcamp(bootcampFlutter);
        System.out.println("Enrolled Contents: " + developer2.getName() + developer2.getEnrolledContents() + "\n");
        developer2.progress();
        System.out.println("----");
        System.out.println("Enrolled Contents: " + developer2.getName() + developer2.getEnrolledContents() + "\n");
        System.out.println("Completed Contents: " + developer2.getName() + developer2.getCompletedContents());
        System.out.println("XP: " + developer2.calculateTotalXP());
    }
}
