package com.atguigu.gmall.gmall.user;

import com.atguigu.gmall.gmall.user.bean.UmsMember;
import com.atguigu.gmall.gmall.user.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GmallUserApplicationTests {

	@Autowired
	UserMapper userMapper;
	@Test
	void contextLoads() {
		List<UmsMember> umsMembers = userMapper.selectAllUser();

		System.out.println(umsMembers);

	}

}
