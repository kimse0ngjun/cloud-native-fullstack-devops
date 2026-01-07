package collection;

import java.util.LinkedList;

public class MemberLinkedList { // list

	private LinkedList<Member> linkedList; // linkedList 인스턴스
	
	public MemberLinkedList() { 
		linkedList = new LinkedList<Member>();
	}
	
	public void addMember(Member member) { // 멤버 추가
	
		linkedList.add(member);
	}
	
	public boolean removeMember(int memberId) { // 멤버 없애기
		
		for (int i = 0; i < linkedList.size(); i++) {
			Member member = linkedList.get(i);
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				linkedList.remove();
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() { // 전체 멤버 보여주기
		for (Member member : linkedList) {
			System.out.println(member);
		}
		System.out.println("============ [end] =============");
	}
}
