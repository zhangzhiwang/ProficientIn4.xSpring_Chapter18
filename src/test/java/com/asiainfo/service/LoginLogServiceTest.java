package com.asiainfo.service;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asiainfo.entity.LoginLog;

/**
 * 登录日志服务单元测试
 *
 * @author zhangzhiwang
 * @Aug 6, 2019 8:06:34 PM
 */
public class LoginLogServiceTest {

	@Test
	public void testSave() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		LoginLogService loginLogService = (LoginLogService) applicationContext.getBean("loginLogService");

		LoginLog loginLog = new LoginLog();
		loginLog.setUserId(1);
		loginLog.setIp("127.0.0.1");
		loginLog.setLoginDatetime(new Timestamp(new Date().getTime()));
		loginLogService.save(loginLog);
	}

}
