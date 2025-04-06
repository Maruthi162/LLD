package package2;

import package1.Student;

public class Department {
    Student student = new Student("Maruthi");
    public void showStudentDetails(){
        System.err.println(student.show());
    }
}
