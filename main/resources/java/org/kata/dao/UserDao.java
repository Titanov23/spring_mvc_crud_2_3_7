package org.kata.dao;



import org.kata.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void updateUser(User updateUser);

    void removeUserById(Long id);

    List<User> getAllUsers();

    User getUserById(Long id);

}
