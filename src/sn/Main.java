package sn;


public class Main {
    public static void main(String[] args) {
        UserController controller = new UserController();

        User user = new User("Roman", Gender.MALE, "123", "Kiev");
        User user1 = new User("Dima", Gender.MALE, "123", "Kiev");

        controller.register(user);
        controller.register(user1);

        //TODO fix duplicates
        controller.register(user);
        controller.register(user1);


        System.out.println(controller.getUsers());


    }
}
