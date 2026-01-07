package exam.ex08;

import java.util.ArrayList;

public class MemberArrayList {
	
	private ArrayList<Member> arrList;
	
	public MemberArrayList() {
		arrList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrList.add(member);
	}
	
	public void insertMember(Member member, int pos) {
		if (pos < 0 || pos > arrList.size() + 1) {
			System.out.println("지정된 자리에 추가할 수 없습니다.");
			return; // 생략 가능 -> 리턴값 없음
		}
		arrList.add(pos-1, member);
	}
	
	public boolean removeMember(int memberId) {
		for (int i = 0; i < arrList.size(); i++) {
			Member member = arrList.get(i);
			int tempId  = member.getMemberId();
			if (tempId == memberId) {
				arrList.remove(i);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for (Member member : arrList) {
			System.out.println(member);
		}
		
		System.out.println("============== end =================");
	}
}
