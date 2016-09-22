package lesson6;

public class StaticExample {
    public static void main(String[] args) {
        Company.init();

        Company company1 = new Company(1001, "IBM");
        Company company2 = new Company(1002, "UkrPoshta");

        company1.setCountry("Ukraine");
        company2.setCountry("Poland");

        Company company3 = new Company(1003, "Glassdoor");

        System.out.println(company1);
        System.out.println(company2);
        System.out.println(company3);

        Company.countyEditor();

        System.out.println(company1);

        //Math math = new Math();
        //Math.sqrt(4);
    }
}
