package employeemanagement;

class Developer extends Employee {
    String programmingLanguage;

    void displayDeveloper() {
        displayEmployee();
        System.out.println("Programming Language: " + programmingLanguage);
    }

    public static void main(String[] args) {
        Developer d = new Developer();

        d.name = "Anu";
        d.id = 101;
        d.salary = 35000;
        d.programmingLanguage = "Java";

        d.displayDeveloper();
    }
}
