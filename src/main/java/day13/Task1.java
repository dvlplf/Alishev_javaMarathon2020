package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");

        MessageDatabase.sendMessage(user1, user2, "Hello user2!");
        MessageDatabase.sendMessage(user1, user2, "How are you?");
        MessageDatabase.sendMessage(user2, user1, "Hi user1!");
        MessageDatabase.sendMessage(user2, user1, "Im fine");
        MessageDatabase.sendMessage(user2, user1, "Are you?");
        MessageDatabase.sendMessage(user3, user1, "Hi buster!");
        MessageDatabase.sendMessage(user3, user1, "Hi buster!");
        MessageDatabase.sendMessage(user3, user1, "Hi buster!");
        MessageDatabase.sendMessage(user1, user3, "Go go");
        MessageDatabase.sendMessage(user1, user3, "Go go");
        MessageDatabase.sendMessage(user1, user3, "Go go");
        MessageDatabase.sendMessage(user3, user1, "end you");

        MessageDatabase.showDialog(user1, user3);

    }
}
