public class Student {
    // Object attributes
    String name;
    int age;
    String studentID;
    boolean validStudentID;
    int semesterNumber;
    double averageGrade;
    //Object behaviours
    public void sayHello() {
        System.out.println("Hello friends");
    }
    public void displayName() {
        System.out.println("My name is "+name);
    }
    public void displayAge() {
        System.out.println("My age: "+age);
    }
    
    public void displayInfo() {
        System.out.println("My name is "+name);
        System.out.println("Semester number: "+semesterNumber);
        System.out.println("Average grade: "+averageGrade);
    }
    public void changeStatus() {
        validStudentID =!validStudentID;
    }
    public void displayAll() {
        System.out.println("My name is "+name);
        System.out.println("My student ID is: "+studentID);
        System.out.println("My student card is "+validStudentID);
    }
    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "Małgorzata";
        student1.age = 20;
        student1.studentID = "221375";
        student1.validStudentID = true;
        student1.semesterNumber = 3;
        student1.averageGrade = 3.0;
        student1.displayInfo();
        student1.changeStatus();
        student1.displayAll();
    }
}