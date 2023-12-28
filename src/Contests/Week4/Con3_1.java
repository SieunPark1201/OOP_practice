package Contests.Week4;

public class Con3_1 {
    public static void main(String[] args) {

        // student st1
        Student st1 = new Student();
        st1.setName("John");
        st1.setId(123);
        st1.setGrade(95.0);

        // gradebook gd1
        Gradebook gd1 = new Gradebook();
        gd1.setCourse("Math");
        gd1.setStudent(st1);

        System.out.print("Grade Book1: ");
        printDetails(gd1);

        // student st2
        Student st2 = new Student();
        st2.setName("Jenny");
        st2.setId(456);
        st2.setGrade(86.2);

        // gradebook gd2
        Gradebook gd2 = new Gradebook();
        gd2.setCourse("Eng");
        gd2.setStudent(st2);

        System.out.print("Grade Book2: ");
        printDetails(gd2);

        // student st3
        Student st3 = new Student();
        st3.setName("John");
        st3.setId(123);
        st3.setGrade(95.0);

        // gradebook gd3
        Gradebook gd3 = new Gradebook();
        gd3.setCourse("Math");
        gd3.setStudent(st1);

        System.out.print("Grade Book3: ");
        printDetails(gd3);

//         equal test
        System.out.println("gd1 == gd2 ? " + gd1.equals(gd2));
        System.out.println("gd1 == gd3 ? " + gd1.equals(gd3));
        System.out.println("st1 == st2 ? " + st1.equals(st2));
        System.out.println("st1 == st3 ? " + st1.equals(st3));
    }


    public static void printDetails(Gradebook gb) {
        System.out.print(gb.toString());

    }
}




class Student {
    private String name ="";
    private int id = 0;
    private double grade = 0;

    public String setName(String name){
        this.name = name;
        return name;
    }

    public int setId(int id){
        this.id = id;
        return id;
    }

    public double setGrade(double grade){
        this.grade = grade;
        return grade;
    }

    public boolean equals(Student st){
        if (st.toString().equals(this.toString())){
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return "[Student Name: " + name + ", ID: " + id + ", Grade: " + grade+"]";
    }
}






class Gradebook {
    private String course ="";
    private Student student = new Student();

    public void setCourse(String course) {
        this.course = course;
    }
    public void setStudent(Student student) {
        this.student = student;
    }

    public boolean equals(Gradebook gd){
        if ((this.course.toString().equals(gd.course)
                &&(this.student.equals(gd.student)))) {
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return "Course: " + course + ", Student: " + student.toString()+"\n";
    }
}



