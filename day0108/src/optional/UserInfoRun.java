package optional;

import java.util.ArrayList;

public class UserInfoRun {

	public static UserInfo getUserInfoById(int id, ArrayList<UserInfo> list) {
		for (UserInfo userInfo : list) {
			if (id == userInfo.getId()) {
				return userInfo;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {

		ArrayList<UserInfo> userInfo = new ArrayList<UserInfo>();
		
		userInfo.add(new UserInfo(1001, "홍길동"));
		userInfo.add(new UserInfo(1002, "이순신"));
		userInfo.add(new UserInfo(1003, "강감찬"));
		
		UserInfo userIn = getUserInfoById(1001, userInfo);
		if (userInfo != null) {
			System.out.println(userIn.getName());
		}
	}

}
