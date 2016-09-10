package lesson2;

public class User {
    long ID;
    String name;
    int salary;
    Company company;

    public User(long ID) {
        this.ID = ID;
    }

    public User(long ID, Company company, int salary, String name) {
        this.ID = ID;
        this.company = company;
        this.salary = salary;
        this.name = name;
    }

    void printCompany() {
        System.out.println(company.name);
    }

    void changeSalary(int delta, boolean isIncrease) {
        if (isIncrease) salary += delta;
        else salary -= delta;
    }
}
