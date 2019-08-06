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
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
