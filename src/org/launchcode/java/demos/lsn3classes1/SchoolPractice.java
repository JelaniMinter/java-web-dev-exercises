package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;

public class SchoolPractice {
    public static void main(String[] args) {
        HashMap<String, String> schoolCourse = new HashMap<>();
        schoolCourse.put("Math", "Algebra");
        schoolCourse.put("Social Studies", "History");
        schoolCourse.put("Science", "Chemistry");

        Student newStudent = new Student("Rick", 12345, 1, 3.8);
    }
}
