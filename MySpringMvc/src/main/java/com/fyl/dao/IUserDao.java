package com.fyl.dao;

import com.fyl.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by 22106331qqcom on 2018/1/2.
 */


public interface IUserDao {
    public User findUserById(int id); //查询
    public void addUser(User user); //添加

}
