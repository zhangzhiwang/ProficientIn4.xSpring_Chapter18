package com.asiainfo.service;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asiainfo.entity.Topic;

/**
 * 话题服务单元测试
 *
 * @author zhangzhiwang
 * @Aug 6, 2019 8:22:14 PM
 */
public class TopicServiceTest {

	@Test
	public void testSave() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		TopicService topicService = (TopicService) applicationContext.getBean("topicService");
		
		Topic topic = new Topic();
		topic.setBoardId(1);
		topic.setTopicTitle("topicTitle");
		topic.setUserId(1);
		topic.setCreateTime(new Date());
		topic.setLastPost(new Date());
		topic.setTopicViews(1);
		topic.setTopicReplies(1);
		topic.setDigest(1);
		topicService.save(topic);
		
	}

}
