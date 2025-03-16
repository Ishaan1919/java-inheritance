class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}


class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}


class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}


public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alice Johnson", 35, "Mathematics");
        Student student = new Student("Bob Smith", 16, 10);
        Staff staff = new Staff("Charlie Davis", 40, "Administration");

        teacher.displayInfo();
        teacher.displayRole();

        student.displayInfo();
        student.displayRole();

        staff.displayInfo();
        staff.displayRole();

//        Name: Alice Johnson
//        Age: 35
//        Role: Teacher
//        Subject: Mathematics
//        Name: Bob Smith
//        Age: 16
//        Role: Student
//        Grade: 10
//        Name: Charlie Davis
//        Age: 40
//        Role: Staff
//        Department: Administration
    }
}
