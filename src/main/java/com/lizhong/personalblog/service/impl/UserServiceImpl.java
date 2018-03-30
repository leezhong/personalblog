package com.lizhong.personalblog.service.impl;

import com.lizhong.personalblog.domain.User;
import com.lizhong.personalblog.mapper.UserMapper;
import com.lizhong.personalblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lizhong
 * @description
 * @date created in 2018/3/30 15:06
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getByid(int id) {

        return userMapper.selectByPrimaryKey(id);
    }

}
