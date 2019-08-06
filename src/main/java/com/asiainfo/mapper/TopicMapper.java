package com.asiainfo.mapper;

import com.asiainfo.entity.Board;
import com.asiainfo.entity.LoginLog;
import com.asiainfo.entity.Post;
import com.asiainfo.entity.Topic;

/**
 * 话题Mapper
 *
 * @author zhangzhiwang
 * @Aug 6, 2019 7:30:53 PM
 */
public interface TopicMapper {
	/**
	 * 保存
	 * 
	 * @author zhangzhiwang
	 * @param topic
	 * @Aug 6, 2019 7:47:36 PM
	 */
	void save(Topic topic);
}
