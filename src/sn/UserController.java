package sn;


public class UserController {

    UserDAO userDAO = new UserDAOImpl();

    User register(User user) {
        //dbConnection.save(user)
        userDAO.save(user);
        return user;
    }

    //HOMEWORK
    //TODO add to friend method
    //void addToFriend(User fromUser, User toUser)
    void addToFriend(User fromUser, User toUser) {
        fromUser.getFriends().add(toUser);
        toUser.getFriends().add(fromUser);
    }
}
