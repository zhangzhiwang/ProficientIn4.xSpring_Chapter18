package com.asiainfo.entity;

/**
 * 论坛版块实体类
 *
 * @author zhangzhiwang
 * @Aug 6, 2019 5:31:32 PM
 */
public class Board extends BaseEntity {
	/** 论坛版块ID */
	private int boardId;
	/** 论坛版块名 */
	private String boardName;
	/** 论坛版块描述 */
	private String boardDesc;
	/** 话题数目 */
	private int topicNum;

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public String getBoardDesc() {
		return boardDesc;
	}

	public void setBoardDesc(String boardDesc) {
		this.boardDesc = boardDesc;
	}

	public int getTopicNum() {
		return topicNum;
	}

	public void setTopicNum(int topicNum) {
		this.topicNum = topicNum;
	}

}
