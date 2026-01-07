package collection;

public class Member implements Comparable<Member> {

	private int memberId;
	private String memberName;
	 
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	
	
	public int getMemberId() {
		return memberId;
	}



	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}



	public String getMemberName() {
		return memberName;
	}



	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (this.memberId == member.memberId) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() { // 중복 제거 시 memberId를 통해 검수 (hashSet) <- 중복 사용 x
		return memberId;
	}

	@Override
	public int compareTo(Member member) {
		return (this.memberId - member.memberId);
	}
	
	@Override
	public String toString() {
		return memberName + "";
	}
	
	
}
