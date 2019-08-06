package com.asiainfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.entity.Board;
import com.asiainfo.mapper.BoardMapper;

/**
 * 论坛版块服务类
 *
 * @author zhangzhiwang
 * @Aug 6, 2019 7:49:35 PM
 */
@Service
@Transactional
public class BoardService {
	@Autowired
	private BoardMapper boardMapper;
	
	/**
	 * 保存
	 * 
	 * @author zhangzhiwang
	 * @param board
	 * @Aug 6, 2019 8:06:04 PM
	 */
	void save(Board board) {
		boardMapper.save(board);
	}
}
