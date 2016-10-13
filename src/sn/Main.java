package sn;


public class Main {
    public static void main(String[] args) throws Exception {
        UserController controller = new UserController();
        MessagesController msgController = new MessagesController();

        User user = new User(1001, "Roman", Gender.MALE, "123", "Kiev");
        User user1 = new User(1002, "Dima", Gender.MALE, "123pp", "Odessa");
        User user2 = new User(1003, "Rita", Gender.FEMALE, "1", "Odessa");

        controller.register(user);
        controller.register(user1);


        controller.addToFriend(user, user1);

        msgController.sendMessage(user, user1, "Привет !!!");
        msgController.sendMessage(user1, user, "Пока! ");


        //msgController.getMessageDAO().getByUserId(user.getId());

        //make at least 3 tests
    }
}
