package com.collections;

import java.util.*;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    public static void main(String[] args) {
        HashMap<String, Integer> grades = new HashMap<>();

        // Add grades
        grades.put("Student1", 90);
        grades.put("Student2", 85);
        grades.put("Student3", 92);

        // Update grade
        grades.put("Student2", 88);

        //student exists
        System.out.println("Student3 exists? " + grades.containsKey("Student3"));

        //exists
        System.out.println("student scored 90? " + grades.containsValue(90));

        // Iterate 
        System.out.println("Student Grades:");
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }

        // grade
        System.out.println("Grade for Student1: " + grades.get("Student1"));

        // Remove student
        grades.remove("Student3");

        // size 
        System.out.println("Total students: " + grades.size());
        
        //clear
        grades.clear();
        System.out.println("All grades cleared? " + grades.isEmpty());
    }
}

