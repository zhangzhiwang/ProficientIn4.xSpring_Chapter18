package com.asiainfo.entity;

import java.util.Date;

/**
 * 话题实体类
 *
 * @author zhangzhiwang
 * @Aug 6, 2019 5:45:58 PM
 */
public class Topic extends BaseEntity {
	/** 话题ID */
	private int topicId;
	/** 板块ID */
	private int boardId;
	/** 话题标题 */
	private String topicTitle;
	/** 发表用户ID */
	private int userId;
	/** 创建时间 */
	private Date createTime;
	/** 最后回复时间 */
	private Date lastPost;
	/** 浏览数 */
	private int topicViews;
	/** 回复数 */
	private int topicReplies;
	/** 是否为精华帖：0:不是精华话题 1:是精华话题 */
	private int digest;

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public String getTopicTitle() {
		return topicTitle;
	}

	public void setTopicTitle(String topicTitle) {
		this.topicTitle = topicTitle;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastPost() {
		return lastPost;
	}

	public void setLastPost(Date lastPost) {
		this.lastPost = lastPost;
	}

	public int getTopicViews() {
		return topicViews;
	}

	public void setTopicViews(int topicViews) {
		this.topicViews = topicViews;
	}

	public int getTopicReplies() {
		return topicReplies;
	}

	public void setTopicReplies(int topicReplies) {
		this.topicReplies = topicReplies;
	}

	public int getDigest() {
		return digest;
	}

	public void setDigest(int digest) {
		this.digest = digest;
	}

}
