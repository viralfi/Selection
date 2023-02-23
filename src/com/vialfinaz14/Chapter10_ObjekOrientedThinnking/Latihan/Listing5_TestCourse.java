package com.vialfinaz14.Chapter10_ObjekOrientedThinnking.Latihan;

public class Listing5_TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structure");
        Course course2 = new Course("Database System");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of student in cousel: " +
                course1.getNumberofstudent());
        String[] student = course1.getStudent();
        for (int i = 0; i < course1.getNumberofstudent(); i++)
            System.out.print(student[i] + ", ");

        System.out.println();
        System.out.println("Number of student in course2: " +
                course2.getNumberofstudent());
    }

}
