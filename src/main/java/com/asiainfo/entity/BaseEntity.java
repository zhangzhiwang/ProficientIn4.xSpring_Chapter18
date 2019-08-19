package com.asiainfo.entity;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 实体类的基类
 *
 * @author zhangzhiwang
 * @Aug 6, 2019 5:14:44 PM
 */
public class BaseEntity implements Serializable {
	private int pageNum;
	private int pageSize;

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
