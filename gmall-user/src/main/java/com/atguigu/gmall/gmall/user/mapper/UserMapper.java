package com.atguigu.gmall.gmall.user.mapper;

import com.atguigu.gmall.gmall.user.bean.UmsMember;

import java.util.List;

public interface UserMapper {

    List<UmsMember> selectAllUser();
}
