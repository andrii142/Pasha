package lesson3.OOP.example2Inheritance;

public class Course {
    String name;
    int hoursDuration;
    String teacherName;

    public Course(String name, String teacherName, int hoursDuration) {
        this.name = name;
        this.teacherName = teacherName;
        this.hoursDuration = hoursDuration;
    }
}
