package com.atguigu.gmall.gmall.user.controller;


import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("findUserById")
    @ResponseBody
    public  List<UmsMemberReceiveAddress> findById(String memberId){
        List<UmsMemberReceiveAddress> id = userService.getById(memberId);

        return id;
    }

    @RequestMapping("findUserAll")
    @ResponseBody
    public  List<UmsMember> findUserAll(){
        List<UmsMember> allUSer = userService.getAllUser();

        return allUSer;
    }

    @RequestMapping("index")
    @ResponseBody
    public String findIndex(){
        return "index";
    }
}
