class Course {
    protected String courseName;
    protected int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}


class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}


class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getDiscountedFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + getDiscountedFee());
    }
}


public class EducationalCourses {
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 6);
        OnlineCourse course2 = new OnlineCourse("Web Development", 8, "Udemy", true);
        PaidOnlineCourse course3 = new PaidOnlineCourse("Data Science", 10, "Coursera", true, 200, 20);

        course1.displayCourseInfo();
        course2.displayCourseInfo();
        course3.displayCourseInfo();

//        Course Name: Java Programming
//        Duration: 6 weeks
//        Course Name: Web Development
//        Duration: 8 weeks
//        Platform: Udemy
//        Recorded: Yes
//        Course Name: Data Science
//        Duration: 10 weeks
//        Platform: Coursera
//        Recorded: Yes
//        Fee: $200.0
//        Discount: 20.0%
//        Final Price: $160.0
    }
}
