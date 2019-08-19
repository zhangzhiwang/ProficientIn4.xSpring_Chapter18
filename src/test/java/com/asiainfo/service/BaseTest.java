package com.asiainfo.service;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试基类
 *
 * @author zhangzhiwang
 * @date Aug 19, 2019 7:56:11 AM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml", "file:src/main/webapp/WEB-INF/webConfig-servlet.xml" })
public class BaseTest {

}
