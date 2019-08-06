package com.asiainfo.mapper;

import com.asiainfo.entity.Board;
import com.asiainfo.entity.LoginLog;

/**
 * 登录日志Mapper
 *
 * @author zhangzhiwang
 * @Aug 6, 2019 7:30:53 PM
 */
public interface LoginLogMapper {
	/**
	 * 保存登录日志
	 * 
	 * @author zhangzhiwang
	 * @param loginLog
	 * @Aug 6, 2019 7:47:36 PM
	 */
	void save(LoginLog loginLog);
}
