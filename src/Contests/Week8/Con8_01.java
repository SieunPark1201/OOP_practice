package Contests.Week8;

import java.util.Arrays;

public class Con8_01 {
    public static void main(String[] args) {
        int[][] student1_grade = {{4, 3, 2}, {4, 4, 3, 3}};
        Student student1 = new Student("John", student1_grade);

        int[][] student2_grade = {{3, 2}, {4, 4, 4, 2, 1}};
        Student student2 = new Student("Jane", student2_grade);

        System.out.println("Student Name: "+student1.getStudent_name());
        System.out.println("GPA for semester 1: "+student1.getGPA(0));
        System.out.println("GPA for semester 2: "+student1.getGPA(1));

        System.out.println("Student Name: "+student2.getStudent_name());
        System.out.println("GPA for semester 1: "+student2.getGPA(0));
        System.out.println("GPA for semester 2: "+student2.getGPA(1));

    }
}

class Student {
    private String student_name;
    private int[][] grade = new int[2][5];

    Student(String student_name, int[][] grade){
        this.student_name = student_name;
        this.grade = grade;
    }

    public String getStudent_name() {
        return student_name;
    }

    public double getGPA(int semNum) {
        double sum = 0;
        for (int i = 0; i < grade[semNum].length; i++) {
            sum += grade[semNum][i];
        }
        double gpa = sum/(grade[semNum].length);
        return gpa;
    }

}
