package sn;


import java.util.List;

public interface MessageDAO {

    Message save(Message message);

    List<Message> getByUserId(long id);

    List<Message> getByUser(User user);
}
