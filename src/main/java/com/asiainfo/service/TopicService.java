package com.asiainfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.entity.Board;
import com.asiainfo.entity.LoginLog;
import com.asiainfo.entity.Post;
import com.asiainfo.entity.Topic;
import com.asiainfo.mapper.BoardMapper;
import com.asiainfo.mapper.LoginLogMapper;
import com.asiainfo.mapper.PostMapper;
import com.asiainfo.mapper.TopicMapper;

/**
 * 话题服务类
 *
 * @author zhangzhiwang
 * @Aug 6, 2019 7:49:35 PM
 */
@Service
@Transactional
public class TopicService {
	@Autowired
	private TopicMapper topicMapper;
	
	/**
	 * 保存
	 * 
	 * @author zhangzhiwang
	 * @param topic
	 * @Aug 6, 2019 8:06:15 PM
	 */
	void save(Topic topic) {
		topicMapper.save(topic);
	}
}
