package lesson3.OOP.example2Inheritance;

public class CollegeStudent extends Student {
    //private
    //default (package-private)
    //protected
    //public
    private String collegeName;
    private int collegesCount;


    public CollegeStudent(String name, Course[] courses, int age, int group, String collegeName) {
        super(name, courses, age, group);
        this.collegeName = collegeName;
        this.collegesCount = 0;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
        this.collegesCount++;
    }

    public int getCollegesCount() {
        return collegesCount;
    }

    public String objectToString() {
        return "object:[ collegeName: " + collegeName + ", collegesCount: " + collegesCount + " ]";
    }
}
