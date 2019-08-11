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
	private static ApplicationContext APPLICATION_CONTEXT = null;
	private static TopicService topicService = null;
	static {
		APPLICATION_CONTEXT = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		topicService = (TopicService) APPLICATION_CONTEXT.getBean("topicService");
	}
	
	@Test
	public void testSave() {
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
	
	public void testQueryTotalCount() {
		Topic topic = new Topic();
		int queryTotalCount = topicService.queryTotalCount(topic);
		System.out.println(queryTotalCount);
	}
}
