package com.fyl.service;

import com.fyl.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by 22106331qqcom on 2018/1/2.
 */
public interface IUserService {
    public User findUserById(int id);
    public void addUser(User user);

}
