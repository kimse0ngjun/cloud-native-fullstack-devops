package collection;

public class MemberTreeMapRun {

	public static void main(String[] args) {

		MemberTreeMap mtm = new MemberTreeMap();
		
		Member mb1 = new Member(1001, "홍길동");
		Member mb2 = new Member(1002, "이순신");
		Member mb3 = new Member(1003, "강감찬");
		
		mtm.addMember(mb1);
		mtm.addMember(mb2);
		mtm.addMember(mb3);
		
		mtm.showAllMember();
		
		mtm.removeMember(1001);
		
		mtm.showAllMember();
	}

}
