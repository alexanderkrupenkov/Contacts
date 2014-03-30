package de.softan.contacts.app.db.dao;

import java.util.List;

import de.softan.contacts.app.db.entity.User;

public interface UsersI extends BaseServiceI {

    User setUser(User user);

    User getUserById(int id);

    User getUser(User user);

    List<User> getAllUsers();
}
