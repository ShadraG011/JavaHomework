package Java.JavaHomework.Homework_10;
class User{
    String username;
    String password;
    String login;
    private Chatroom chatroom;

    User(String login, String password, String username, Chatroom chatroom) {
        this.login = login;
        this.password = password;
        this.username = username;
        this.chatroom = chatroom;
    }

    public void inChatroom(String message) {
        chatroom.sendMessageInChatroom(message, this);
    }

}