package lesson6;

//outer class
public class Company {
    private long id;
    private final String name;

    private static String country;

    //inner class
    static class City {

    }

    static {
        country = "USA";

        //any logic

        System.out.println("block is invoked");
    }

    static void init() {
        country = "USA";
    }

    public Company(long id, String name) {
        this.id = id;
        this.name = name;
    }

    void nameEditor() {
        System.out.println("Company name is " + name);
    }

    static void countyEditor() {
        country = "Empty";
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
