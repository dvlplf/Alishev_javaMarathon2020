package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MessageDatabase {
    static List <Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {
        Message message = new Message(u1, u2, text);
        messages.add(message);
    }

    public static List <Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        StringBuilder result = new StringBuilder();
        for (Message message: messages) {
            if (message.getSender().name.equals(u1.name) && message.getReceiver().name.equals(u2.name)) {
                result.append(u1.name).append(": ").append(message.getText()).append("\n");
            } else if (message.getSender().name.equals(u2.name) && message.getReceiver().name.equals(u1.name)) {
                result.append(u2.name).append(": ").append(message.getText()).append("\n");
            }
        }
        System.out.println(result);
    }
}
