package com.asiainfo.mapper;

import com.asiainfo.entity.Board;
import com.asiainfo.entity.LoginLog;
import com.asiainfo.entity.Post;
import com.asiainfo.entity.Topic;
import com.asiainfo.entity.User;

/**
 * 用户Mapper
 *
 * @author zhangzhiwang
 * @Aug 6, 2019 7:30:53 PM
 */
public interface UserMapper {
	/**
	 * 保存
	 * 
	 * @author zhangzhiwang
	 * @param user
	 * @Aug 6, 2019 7:47:36 PM
	 */
	void save(User user);
}
