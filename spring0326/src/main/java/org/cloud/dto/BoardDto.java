package org.cloud.dto;

import lombok.Data;

@Data
public class BoardDto {

	private int boardId;
	private String title;
	private String contents;
	private int hitCnt;
	private String createdDateTime;
	private String creatorId;
	private String updatedDatetime;
	private String updaterId;
	private String deletedYN;
}
