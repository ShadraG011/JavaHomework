package Java.JavaHomework.Homework_10;
import java.util.ArrayList;

class Admin implements Chatroom{
    ArrayList<User> users = new ArrayList<>();

    public void craeteAccount(User user) {
        users.add(user);
    }

    @Override
    public void sendMessageInChatroom(String message, User me) {
        for (User user : users) {
            if (user.login != me.login) {
                System.out.printf("Сообщение от %s для %s: %s\n", me.username ,user.username, message);
            }
        }
    }
}
