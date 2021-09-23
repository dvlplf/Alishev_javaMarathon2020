package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    List <User> subscription;

    public User(String name) {
        this.name = name;
        this.subscription = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<User> getSubscriptions() {
        return subscription;
    }

    public void subscribe(User user) {
        subscription.add(user);
    }

    public boolean isSubscribed(User user) {
        return subscription.contains(user);
    }

    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this, user, text);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
