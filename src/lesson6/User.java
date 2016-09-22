package lesson6;

public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String companyName;

    public User(long id, String lastName, String firstName, String companyName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
