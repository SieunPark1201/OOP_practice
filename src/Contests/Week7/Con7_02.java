package Contests.Week7;

public class Con7_02 {

    public static void main(String[] args) {

        // create a classroom of capacity 5 (students)
        Classroom classroom = new Classroom(5);

        Student student1 = new Student("John", false);
        Student student2 = new Student("Jane", false);
        Student student3 = new Student("Mike", false);

        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);

        classroom.markAttendance("John", true);  // John attended
        classroom.markAttendance("Jane", false); // Jane did not attend
        classroom.markAttendance("Mike", true);  // Mike attended

        Student[] studentArray = classroom.getStudents();

        for (int i = 0; i < studentArray.length; i++) {
            Student student = studentArray[i];
            if (student != null) {
                System.out.println(student);
            }
        }
    }
}

class Student {
    private String name;
    private boolean attended;

    public Student(String name, boolean attended){
        this.name = name;
        this.attended = attended;
    }

    public String getName() {
        return name;
    }

    public void setAttended(boolean newAttend) {
        attended = newAttend;
    }

    public String toString(){
        return "[Student] name("+name+") attended("+attended+")";
    }
}

class Classroom {
    private Student[] students;
    private int studentCount = 0;

    public Classroom(int num) {
        students = new Student[num];
    }

    public void addStudent(Student newStudent){
            students[studentCount] = newStudent;
            studentCount++;
    }

    public void markAttendance(String name, boolean attend) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name)) {
                students[i].setAttended(attend);
                break;
            }
        }
    }

    public Student[] getStudents() {
        Student[] allStudent = new Student[students.length];
        for (int i = 0; i < students.length ; i++) {
            allStudent[i] = students[i];
        }
        return allStudent;
    }

}