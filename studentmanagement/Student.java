package studentmanagement;

class Student {
    String name;
    int rollNo;
    int mark;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Mark: " + mark);
        System.out.println("----------------");
    }
}
