package com.slyashenko.service;

import com.slyashenko.model.User;

public interface UserService {

    User findUser(User user);

    User addUser(User user);
}
