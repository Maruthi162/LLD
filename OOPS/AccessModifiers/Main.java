import package1.Student;
import package2.Department;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Guna");
        Department d= new Department();
        
        System.out.println(s.show());
        d.showStudentDetails();
    }
}
