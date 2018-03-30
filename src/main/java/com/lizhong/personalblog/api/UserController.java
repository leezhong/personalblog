package com.lizhong.personalblog.api;

import com.lizhong.personalblog.domain.User;
import com.lizhong.personalblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizhong
 * @description
 * @date created in 2018/3/30 15:07
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getById")
    public User getUser(@RequestParam("id")Integer id){

      return userService.getByid(id);

    }
}
