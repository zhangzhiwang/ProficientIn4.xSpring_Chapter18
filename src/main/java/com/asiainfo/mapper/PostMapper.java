package com.asiainfo.mapper;

import com.asiainfo.entity.Board;
import com.asiainfo.entity.LoginLog;
import com.asiainfo.entity.Post;

/**
 * 帖子Mapper
 *
 * @author zhangzhiwang
 * @Aug 6, 2019 7:30:53 PM
 */
public interface PostMapper {
	/**
	 * 保存
	 * 
	 * @author zhangzhiwang
	 * @param post
	 * @Aug 6, 2019 7:47:36 PM
	 */
	void save(Post post);
}
