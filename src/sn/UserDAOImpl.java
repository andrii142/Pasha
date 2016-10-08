package sn;

import java.util.HashSet;
import java.util.Set;

public class UserDAOImpl implements UserDAO {
    //emulates db
    Set<User> users = new HashSet<>();

    @Override
    public User save(User user) {
        users.add(user);
        return user;
    }

    public Set<User> getUsers() {
        return users;
    }
}
