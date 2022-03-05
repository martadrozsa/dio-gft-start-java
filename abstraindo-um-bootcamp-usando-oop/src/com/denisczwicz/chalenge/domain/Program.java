package com.denisczwicz.chalenge.domain;

import java.time.LocalDate;

public class Program {

    public static void main(String[] args) {

        Course course1 = new Course();
        course1.setTitle("Java Course");
        course1.setDescription("Object oriented programming java course");
        course1.setTotalHours(8);

        Course course2 = new Course();
        course2.setTitle("Flutter Course");
        course2.setDescription("Flutter introduction");
        course2.setTotalHours(10);

        Mentorship mentorship1 = new Mentorship();
        mentorship1.setTitle("Java Course");
        mentorship1.setDescription("Java Course Mentorship");
        mentorship1.setDate(LocalDate.now());

        Mentorship mentorship2 = new Mentorship();
        mentorship2.setTitle("Flutter Course");
        mentorship2.setDescription("Flutter Course Mentorship");
        mentorship2.setDate(LocalDate.now());

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentorship1);
        System.out.println(mentorship2);

    }
}
