package com.wsn.mybatis.task.controller;

import com.wsn.mybatis.task.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sharing
 * @version 1.0.0
 * @create 2018-01-02 下午7:47
 **/
@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("getUser")
    @GetMapping
    public void getUser() {
        userMapper.selectByPrimaryKey(1L);
    }
}
