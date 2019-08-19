package com.asiainfo.service;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asiainfo.entity.Topic;

/**
 * 话题服务单元测试
 *
 * @author zhangzhiwang
 * @Aug 6, 2019 8:22:14 PM
 */
public class TopicServiceTest extends BaseTest {
//	private static ApplicationContext APPLICATION_CONTEXT = null;
	@Autowired
	private TopicService topicService;
//	static {
//		APPLICATION_CONTEXT = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//		topicService = (TopicService) APPLICATION_CONTEXT.getBean("topicService");
//	}
	
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
	
	@Test
	public void testQueryTotalCount() {
		Topic topic = new Topic();
		topic.setTopicTitle("test");
		int queryTotalCount = topicService.queryTotalCount(topic);
		System.out.println(queryTotalCount);
	}
	
	@Test
	public void testQueryByTitleWithPage() {
		Topic topic = new Topic();
//		topic.setTopicTitle("test");
		
		topic.setPageNum(1);
		topic.setPageSize(2);
		List<Topic> queryByTitleWithPage = topicService.queryByTitleWithPage(topic);
		System.out.println(queryByTitleWithPage);
	}
}
