package exam.ex09;

public class MemberTreeSetRun {

	public static void main(String[] args) {
		
		MemberTreeSet mts1 = new MemberTreeSet();
		
		Member mb1 = new Member(1001, "홍길동");
		Member mb2 = new Member(1002, "이순신");
		Member mb3 = new Member(1003, "강감찬");
		
		mts1.addMember(mb1);
		mts1.addMember(mb2);
		mts1.addMember(mb3);
		
		mts1.showAllMember();
		
		Member mb4 = new Member(1001, "김유신");
		mts1.addMember(mb4);
		mts1.showAllMember();
	}
}
