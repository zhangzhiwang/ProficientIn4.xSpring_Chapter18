package com.asiainfo.entity;

import java.sql.Timestamp;

/**
 * 登录日志实体类
 *
 * @author zhangzhiwang
 * @Aug 6, 2019 5:37:43 PM
 */
public class LoginLog extends BaseEntity {
	/** 日志主键 */
	private int loginLogId;
	/** 登录用户id */
	private int userId;
	/** 登录ip */
	private String ip;
	/** 登录时间 */
	private Timestamp loginDatetime;

	public int getLoginLogId() {
		return loginLogId;
	}

	public void setLoginLogId(int loginLogId) {
		this.loginLogId = loginLogId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Timestamp getLoginDatetime() {
		return loginDatetime;
	}

	public void setLoginDatetime(Timestamp loginDatetime) {
		this.loginDatetime = loginDatetime;
	}

}
