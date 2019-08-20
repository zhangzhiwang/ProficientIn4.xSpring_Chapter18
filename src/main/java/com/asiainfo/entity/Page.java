package com.asiainfo.entity;

/**
 * 分页实体类
 *
 * @author zhangzhiwang
 * @date Aug 20, 2019 8:33:51 AM
 */
public class Page {
	/** 当前页数，从1开始 */
	private int pageNum;
	private int pageSize;

	public Page(int pageNum, int pageSize) {
		if (pageNum <= 0 || pageSize <= 0) {
			throw new RuntimeException("分页信息有误！");
		}
		this.pageNum = (pageNum - 1) * pageSize;
		this.pageSize = pageSize;
	}

	public int getPageNum() {
		return pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	@Override
	public String toString() {
		return "Page [pageNum=" + pageNum + ", pageSize=" + pageSize + "]";
	}

}
