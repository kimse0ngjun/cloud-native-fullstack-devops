package collection;

public class MemberTreeSetRun {

	public static void main(String[] args) {
		MemberTreeSet mts = new MemberTreeSet();
		
		Member mb1 = new Member(1001, "홍길동");
		Member mb2 = new Member(1002, "김유신");
		Member mb3 = new Member(1003, "강감찬");
		Member mb4 = new Member(1003, "이름");
		
		mts.addMember(mb1);
		mts.addMember(mb2);
		mts.addMember(mb3);
		mts.addMember(mb4);
		
		mts.showAllMember();
	}
}
