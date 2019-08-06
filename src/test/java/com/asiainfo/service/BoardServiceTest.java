package com.asiainfo.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asiainfo.entity.Board;

/**
 * 论坛版块服务单元测试
 *
 * @author zhangzhiwang
 * @Aug 6, 2019 7:51:25 PM
 */
public class BoardServiceTest {

	@Test
	public void testSave() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		BoardService boardService = (BoardService) applicationContext.getBean("boardService");
		
		Board board = new Board();
		board.setBoardName("BoardName");
		board.setBoardDesc("boardDesc");
		board.setTopicNum(1);
		boardService.save(board);
	}
}
