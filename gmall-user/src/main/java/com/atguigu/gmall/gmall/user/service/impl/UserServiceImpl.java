package com.atguigu.gmall.gmall.user.service.impl;


import com.atguigu.gmall.gmall.user.bean.UmsMember;
import com.atguigu.gmall.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAllUser();
    }
}
