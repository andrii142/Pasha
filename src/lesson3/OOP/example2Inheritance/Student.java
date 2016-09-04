package lesson3.OOP.example2Inheritance;

public class Student {
    private String name;
    private int group;
    private int age;
    private Course[] courses;

    public Student() {
    }

    public Student(String name, Course[] courses, int age, int group) {
        this.name = name;
        this.courses = courses;
        this.age = age;
        this.group = group;
    }

    //
    //
    //
    //
    //
    //
    //

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
