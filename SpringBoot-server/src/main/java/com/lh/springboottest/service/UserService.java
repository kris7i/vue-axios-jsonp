package com.lh.springboottest.service;

import com.lh.springboottest.dao.UserMapper;
import com.lh.springboottest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springboottest
 * @description:
 * @author: Mr.Liu
 * @create: 2018-07-20 17:25
 **/
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> findByName(String name) {
        return userMapper.findUserByName(name);
    }

    public User insertUser(User user) {
        userMapper.addUser(user);
        return user;
    }
    public List<User> ListUser(){
        return	userMapper.ListUser();
    }

    public int Update(User user){
        return userMapper.updateUser(user);
    }

    public  int addUser(User user){
        return userMapper.addUser(user);
    }
    public int delete(int id){
        return userMapper.deleteUser(id);
    }
}
