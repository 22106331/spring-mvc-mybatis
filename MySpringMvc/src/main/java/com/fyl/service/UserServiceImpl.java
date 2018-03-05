package com.fyl.service;

import com.fyl.dao.IUserDao;
import com.fyl.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 22106331qqcom on 2018/1/2.
 */
@Service
public class UserServiceImpl implements IUserService{

    @Resource
    private IUserDao userDao;

    public UserServiceImpl() {
//        userDao = new UserDaoImpl();
    }
    @Override
    public User findUserById(int id) {
        return userDao.findUserById(id);
    }
    @Override
    public void addUser(User user){
        userDao.addUser(user);
    }



}
