package collection;

public class MemberArrayListRun {
	public static void main(String[] args) {
		MemberArrayList memArrList = new MemberArrayList();
		
		Member m1 = new Member(1001, "홍길동");
		Member m2 = new Member(1002, "이순신");
		Member m3 = new Member(1003, "강감찬");
		Member m4 = new Member(1004, "김유신");
		
		memArrList.addMember(m1);
		memArrList.addMember(m2);
		memArrList.addMember(m3);
		memArrList.addMember(m4);
		
		memArrList.showAllMember();
		memArrList.removeMember(m1.getMemberId());
		memArrList.showAllMember();
	}
}
