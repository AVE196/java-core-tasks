package ru.ave.javacore.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashCodeAndEquals {

    public static void main(String[] args) {

        User user1 = new User("user1", 100);
        User user2 = new User("user2", 100);

        Set<User> set = new HashSet<>();
        set.add(user1);
        set.add(user2);
        System.out.println(set.size());

        Map<User, String> map = new HashMap<>();

        map.put(user1, "user1");
        System.out.println(map.get(user2));

        user1.setId(200);
        System.out.println(map.get(user2));


    }

}

class User {

    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return 31 * id >>> 25;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != getClass()) return false;
        User user = (User) obj;
        return user.getId() == id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}