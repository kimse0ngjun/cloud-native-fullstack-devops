package collection;

public class MemberLinkedListRun {

	public static void main(String[] args) {

		MemberLinkedList mll = new MemberLinkedList(); // mll도 인스턴스
		
		mll.addMember(new Member(260001, "홍길동"));
		mll.addMember(new Member(260002, "이순신"));
		mll.addMember(new Member(260003, "강감찬"));
		
		mll.showAllMember();
		
		mll.removeMember(260001);
		
		mll.showAllMember();
	}
}
