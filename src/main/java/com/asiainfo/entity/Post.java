package com.asiainfo.entity;

import java.util.Date;

/**
 * 帖子实体类
 *
 * @author zhangzhiwang
 * @Aug 6, 2019 5:40:55 PM
 */
public class Post extends BaseEntity {
	/** 帖子ID */
	private int postId;
	/** 板块ID */
	private int boardId;
	/** 话题ID */
	private int topicId;
	/** 发表者ID */
	private int userId;
	/** 帖子类型 1:主帖子 2:回复帖子 */
	private byte postType;
	/** 帖子标题 */
	private String postTitle;
	/** 帖子内容 */
	private String postText;
	/** 创建时间 */
	private Date createTime;

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public byte getPostType() {
		return postType;
	}

	public void setPostType(byte postType) {
		this.postType = postType;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostText() {
		return postText;
	}

	public void setPostText(String postText) {
		this.postText = postText;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
