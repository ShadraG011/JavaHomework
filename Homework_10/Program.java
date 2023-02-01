package Java.JavaHomework.Homework_10;
class Program {
    public static void main(String[] args) {
        Admin ad = new Admin();

        User user1 = new User("Shadrag", "DwaUUHUHii3323", "Vlad", ad);
        User user2 = new User("qwerty", "12323434556#", "Vika", ad);
        User user3 = new User("wertyuiop", "qazwsxedcvfrbgtnhy#", "Maksim", ad);

        ad.craeteAccount(user1);
        ad.craeteAccount(user2);
        ad.craeteAccount(user3);

        user1.inChatroom("Hello!");
        System.out.println();
        user2.inChatroom("Hello!");
        System.out.println();
        user3.inChatroom("Hello!");
    }
}
