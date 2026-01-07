package collection;

public class MemberHashMapRun {

	public static void main(String[] args) {

		MemberHashMap mhm = new MemberHashMap();
		
		Member mb1 = new Member(1001, "홍길동");
		Member mb2 = new Member(1002, "이순신");
		Member mb3 = new Member(1003, "강감찬");
		
		mhm.addMember(mb1);
		mhm.addMember(mb2);
		mhm.addMember(mb3);
		
		mhm.showAllMember();
		
		mhm.removeMember(1001);
		
		mhm.showAllMember();
	}

}
