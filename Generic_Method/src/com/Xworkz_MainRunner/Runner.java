package com.Xworkz_MainRunner;

import com.Xworkz_Internal.Student;

public class Runner {
    public static void main(String[] args) {
        Student<String> student = new Student<>("School","Collage");
        System.out.println("Student: "+student);
    }

}
