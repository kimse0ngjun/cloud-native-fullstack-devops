package collection;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap { // map 사용

	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if (hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() { // hashMap.keySet().iterator();
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key); // key를 찾음
			System.out.println(member);
		}
		System.out.println("============== [end] =================");
	}
}
