package com.vialfinaz14.Chapter10_ObjekOrientedThinnking.Tugas;

public class Course2 {
    private String coursename;
    private String[] students = new String[1];
    private int numberOfStudent;

    public Course2(String coursename) {
        this.coursename = coursename;
    }

    public void addStudent(String student) {
        if (numberOfStudent == students.length) {
            String[] a = new String[students.length + 1];
            for (int i = 0; i < numberOfStudent; i++) {
                a[i] = students[i];
            }
            students = a;
        }
        students[numberOfStudent] = student;
        numberOfStudent++;
    }
    public String getCoursename() {
        return coursename;
    }
    public String[] getStudents() {
        return students;
    }
    public int getNumberOfStudent() {
        return numberOfStudent;
    }
    public void dropStudent(String student) {
        int index = findStudent(student);
        if (index >= 0) {
            dropStudent(index);
        } else {
            System.out.println(student + " is not in the course: " + coursename);
        }
    }

    private void dropStudent(int index) {
        String[] s = new String[students.length - 1];
        for (int i = 0, j = 0; i < s.length; i++, j++) {
            if (i == index) {
                j++;
            }
            s[i] = students[j];
        }
        this.students = s;
        numberOfStudent--;
    }
    public int findStudent(String student) {
        for (int i = 0; i < numberOfStudent; i++) {
            if (students[i].equals(student)) {
                return i;
            }
        }
        return  -1;
        }
}
