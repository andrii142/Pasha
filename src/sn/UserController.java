package sn;

import java.util.ArrayList;
import java.util.List;

public class UserController {

    //emulates db
    List<User> users = new ArrayList<>();

    User register(User user) {
        //dbConnection.save(user)
        users.add(user);
        return user;
    }

    //HOMEWORK
    //TODO add to friend method
    //void addToFriend(User fromUser, User toUser)

    //for test
    public List<User> getUsers() {
        return users;
    }
}
