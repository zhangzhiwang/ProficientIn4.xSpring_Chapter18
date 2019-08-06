package com.asiainfo.service;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asiainfo.entity.User;

/**
 * 用户服务单元测试
 *
 * @author zhangzhiwang
 * @Aug 6, 2019 8:29:31 PM
 */
public class UserServiceTest {

	@Test
	public void testSave() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		UserService userService = (UserService) applicationContext.getBean("userService");
		
		User user = new User();
		user.setUserName("userName");
		user.setPassword("password");
		user.setUserType((byte)1);
		user.setLocked((byte)1);
		user.setCredit(1);
		user.setLastVisit(new Timestamp(new Date().getTime()));
		user.setLastIp("127.0.0.1");
		userService.save(user);
	}

}
