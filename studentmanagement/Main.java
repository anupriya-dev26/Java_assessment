package studentmanagement;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Anu";
        s1.rollNo = 101;
        s1.mark = 90;

        Student s2 = new Student();
        s2.name = "Priya";
        s2.rollNo = 102;
        s2.mark = 85;

        s1.displayDetails();
        s2.displayDetails();
    }
}