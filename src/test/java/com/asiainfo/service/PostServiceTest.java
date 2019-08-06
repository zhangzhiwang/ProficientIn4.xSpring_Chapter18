package com.asiainfo.service;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asiainfo.entity.Post;

/**
 * 帖子服务单元测试
 *
 * @author zhangzhiwang
 * @Aug 6, 2019 8:14:32 PM
 */
public class PostServiceTest {

	@Test
	public void testSave() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		PostService postService = (PostService) applicationContext.getBean("postService");
		
		Post post = new Post();
		post.setBoardId(1);
		post.setTopicId(1);
		post.setUserId(1);
		post.setPostType((byte)1);
		post.setPostTitle("PostTitle");
		post.setPostText("postText");
		post.setCreateTime(new Date());
		postService.save(post);
	}

}
