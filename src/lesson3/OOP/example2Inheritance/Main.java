package lesson3.OOP.example2Inheritance;

public class Main {

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        Course courseJava = new Course("Java", "Jack", 100);
        Course courseC = new Course("C", "Steve", 60);
        Course[] courses = {courseJava, courseC};
        CollegeStudent student = new CollegeStudent("Pasha", courses, 17, 7, "Queen College");

        //printer(student);

        student.setCollegeName("York");
        student.setGroup(7000);

        //printer(student);

        System.out.println(student.objectToString());
    }

    private static void printer(CollegeStudent student) {
        System.out.println(student.getCollegeName());
        System.out.println(student.getCollegesCount());
        System.out.println(student.getGroup());
    }
}
