package package1;

public class Student{
    private String rollNo;
    private String name;

    public Student(String name){
        this.name = name;
    }

    private String getStudentInfo(){
        return "Name: "+this.name +"Roll: "+this.rollNo; 
    }

    public String show(){
        return getStudentInfo();
    }
}