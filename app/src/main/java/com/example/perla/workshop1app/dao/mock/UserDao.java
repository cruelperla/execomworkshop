package com.example.perla.workshop1app.dao.mock;

import com.example.perla.workshop1app.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Perla on 29.4.2017.
 */

public class UserDao {
    public static List<User> fetchUsers() {
        final List<User> users = new ArrayList<>();

        for (int i = 0; i < 42; i++) {
            users.add(new User("Aco", "De", "https://developer.android.com/design/material/images/card_travel.png"));
    }
        return users;
    }
}
