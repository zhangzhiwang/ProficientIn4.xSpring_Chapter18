package com.asiainfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.entity.Board;
import com.asiainfo.entity.LoginLog;
import com.asiainfo.mapper.BoardMapper;
import com.asiainfo.mapper.LoginLogMapper;

/**
 * 登录日志服务类
 *
 * @author zhangzhiwang
 * @Aug 6, 2019 7:49:35 PM
 */
@Service
@Transactional
public class LoginLogService {
	@Autowired
	private LoginLogMapper loginLogMapper;
	
	/**
	 * 保存
	 * 
	 * @author zhangzhiwang
	 * @param loginLog
	 * @Aug 6, 2019 8:06:15 PM
	 */
	void save(LoginLog loginLog) {
		loginLogMapper.save(loginLog);
	}
}
