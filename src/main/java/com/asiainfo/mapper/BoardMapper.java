package com.asiainfo.mapper;

import com.asiainfo.entity.Board;

/**
 * 板块Mapper
 *
 * @author zhangzhiwang
 * @Aug 6, 2019 7:30:53 PM
 */
public interface BoardMapper {
	/**
	 * 保存论坛版块
	 * 
	 * @author zhangzhiwang
	 * @param board
	 * @Aug 6, 2019 7:47:36 PM
	 */
	void save(Board board);
}
