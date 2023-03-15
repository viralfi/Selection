package com.vialfinaz14.Chapter10_ObjekOrientedThinnking.Tugas;

public class Exercises9_TheCourse2 {
    public static void main(String[] args) {
        Course2 math101 = new Course2("math101");
        math101.addStudent("Mark");
        math101.addStudent("Tom");
        math101.addStudent("Joan");
        math101.dropStudent("Tom");

        System.out.println("\nThe strudent in the course " +
                math101.getCoursename() + ":");
        String[] studnt = math101.getStudents();
        for (int i = 0; i < math101.getNumberOfStudent(); i++) {
            System.out.print(studnt[i] + " ");
        }
        System.out.println();
    }
}
//*********************************************************************************
// * (The Course class) Revise the Course class as follows:                         *
// *                                                                                *
// * ■ The array size is fixed in Listing 10.6. Improve it to automatically         *
// *   increase the array size by creating a new larger array and copying the       *
// *   contents of the current array to it.                                         *
// * ■ Implement the dropStudent method.                                            *
// * ■ Add a new method named clear() that removes all students from the            *
// *   course.                                                                      *
// *                                                                                *
// * Write a test program that creates a course, adds three students, removes one,  *
// * and displays the students in the course.                                       *
// *********************************************************************************/