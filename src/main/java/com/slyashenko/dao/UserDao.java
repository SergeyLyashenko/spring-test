package com.slyashenko.dao;

import com.slyashenko.model.User;

public interface UserDao {

    User findUser(User user);

    User addUser(User user);
}
