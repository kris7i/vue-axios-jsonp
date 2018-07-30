package com.lh.springboottest.controller;

import com.lh.springboottest.model.User;
import com.lh.springboottest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: springboottest
 * @description: controlle
 * @author: Mr.Liu
 * @create: 2018-07-20 17:36
 **/
@Controller
@RequestMapping(value = "user",method = {RequestMethod.GET,RequestMethod.POST})
public class UserContrller {
    @Autowired
    private UserService userService;

    @RequestMapping("")
    public String index(Model model){
        return "admin/index";
    }
    
    

    @RequestMapping(value = "/findByName")
    @ResponseBody
    public List<User> findByName(String name){
        return userService.findByName(name);
    }

    @RequestMapping(value = "/list")
    @ResponseBody
    public List<User> findAll(){
        return  userService.ListUser();
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addUser(User user){
        int result= userService.addUser(user);
        if (result>=1){
            return "新增成功";
        }else {
            return "新增失败";
        }
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String updateUser(User user){
        int result= userService.Update(user);
        if (result>=1){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(int id) {
        int result = userService.delete(id);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }
}
