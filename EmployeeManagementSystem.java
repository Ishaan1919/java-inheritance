//Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
//        Tasks:
//Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
//Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager and programmingLanguage for Developer.
//        Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.

class Employee{
    String name;
    String id;
    int salary;

    Employee(String name, String id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println("Name -> " + this.name);
        System.out.println("Id -> " + this.id);
        System.out.println("Salary -> " + this.salary);
    }
}

class Manager extends Employee{
    int teamSize;
     Manager(int size, String name, String id, int salary){
         super(name,id,salary);
         this.teamSize = size;
     }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team size -> " + teamSize);
    }
}

class Intern extends Employee{
    String programingLanguage;
     Intern(String language, String name, String id, int salary){
         super(name,id,salary);
         this.programingLanguage = language;
     }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programing Language -> " + programingLanguage);
    }
}

class Developer extends Employee{
    String programingLanguage;
     Developer(String language, String name, String id, int salary){
         super(name,id,salary);
         this.programingLanguage = language;
     }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programing Language -> " + programingLanguage);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager manager = new Manager(10, "Ishaan", "19", 90000);
        manager.displayDetails();

        Developer developer = new Developer("Java", "Hitesh", "18", 100000);
        developer.displayDetails();

        Intern intern = new Intern("JavaScript", "Jain", "17", 120000);
        intern.displayDetails();

//        Name -> Ishaan
//        Id -> 19
//        Salary -> 90000
//        Team size -> 10

//        Name -> Hitesh
//        Id -> 18
//        Salary -> 100000
//        Programing Language -> Java

//        Name -> Jain
//        Id -> 17
//        Salary -> 120000
//        Programing Language -> JavaScript
    }
}