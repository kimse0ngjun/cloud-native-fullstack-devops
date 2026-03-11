package org.cloud.dto;

import lombok.Data;

@Data
// @Getter, @Setter
public class MemberDTO {

	private String userId;
	private String userPw;
	private String userName;
	private String regDate;
}
