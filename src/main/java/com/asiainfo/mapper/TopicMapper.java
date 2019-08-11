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
	
	/**
	 * 按条件查询总数量
	 * 
	 * @param topic
	 * @return
	 * @author zhangzhiwang
	 * @date 2019年8月11日 上午8:34:27
	 */
	int queryTotalCount(Topic topic);
}
