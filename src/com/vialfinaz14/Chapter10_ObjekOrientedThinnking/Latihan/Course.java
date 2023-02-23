package com.vialfinaz14.Chapter10_ObjekOrientedThinnking.Latihan;

public class Course {
    private String coursename;
    private String[] students = new String[100];
    private int numberofstudent;
    public Course(String coursename) {
        this.coursename = coursename;
    }
    public void addStudent(String student) {
        students[numberofstudent] = student;
        numberofstudent++;
    }
    public String[] getStudent() {
        return students;
    }
    public int getNumberofstudent() {
        return numberofstudent;
    }
    public String getCoursename() {
        return coursename;
    }
    public void dropStudent(String student) {

    }
}
