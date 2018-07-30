package com.lh.springboottest.dao;

import com.lh.springboottest.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: springboottest
 * @description: usermapper
 * @author: Mr.Liu
 * @create: 2018-07-20 17:20
 **/
@Mapper
@Repository
public interface UserMapper {

    List<User> findUserByName(String name);

    public List<User> ListUser();

    public int addUser(User user);

    public int updateUser(User user);

    public int deleteUser(int id);
}
