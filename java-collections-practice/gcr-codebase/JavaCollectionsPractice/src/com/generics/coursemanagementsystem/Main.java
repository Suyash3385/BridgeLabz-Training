package com.generics.coursemanagementsystem;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Course<ExamCourse> math =new Course<>("Mathematics", new ExamCourse());
        Course<AssignmentCourse> software=new Course<>("Software Engineering", new AssignmentCourse());
        Course<ResearchCourse>ai=new Course<>("AI Research", new ResearchCourse());
        math.showCourseDetails();
        software.showCourseDetails();
        ai.showCourseDetails();
        List<CourseType> courseTypes = new ArrayList<>();
        courseTypes.add(new ExamCourse());
        courseTypes.add(new AssignmentCourse());
        courseTypes.add(new ResearchCourse());

        CourseManager.displayCourses(courseTypes);
    }
}

