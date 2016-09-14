package lesson4.polymorphism;

public class ManagerEmployee extends Employee {


    public ManagerEmployee(int salary, int age, String name) {
        super(salary, age, name);
    }

    void paySalary() {
        int k = 2;
        setBalance(getBalance() + getSalary() * k);
    }

    int getBonuses() {
        return 1500;
    }
}
