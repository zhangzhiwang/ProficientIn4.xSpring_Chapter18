package com.asiainfo.entity;

import java.sql.Timestamp;

/**
 * 用户实体类
 *
 * @author zhangzhiwang
 * @Aug 6, 2019 5:51:27 PM
 */
public class User extends BaseEntity {
	/** 用户Id */
	private int userId;
	/** 用户名 */
	private String userName;
	/** 密码 */
	private String password;
	/** 用户类型：1:普通用户 2:管理员 */
	private byte userType;
	/** 是否锁定：0:未锁定 1:锁定 */
	private byte locked;
	/** 积分 */
	private int credit;
	/** 最后登陆时间 */
	private Timestamp lastVisit;
	/** 最后登陆IP */
	private String lastIp;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public byte getUserType() {
		return userType;
	}

	public void setUserType(byte userType) {
		this.userType = userType;
	}

	public byte getLocked() {
		return locked;
	}

	public void setLocked(byte locked) {
		this.locked = locked;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public Timestamp getLastVisit() {
		return lastVisit;
	}

	public void setLastVisit(Timestamp lastVisit) {
		this.lastVisit = lastVisit;
	}

	public String getLastIp() {
		return lastIp;
	}

	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}

}
