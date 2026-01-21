package com.generics.coursemanagementsystem;
import java.util.List;
public class CourseManager {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c:courses) {
            System.out.println("Evaluation Method: " + c.evaluationMethod());
        }
    }
}
