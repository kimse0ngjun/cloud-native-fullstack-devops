package collection;

public class MemberHashSetRun { 
	
	public static void main(String[] args) {
		
		MemberHashSet mhs = new MemberHashSet();
		
		Member mb1 = new Member(1001, "홍길동");
		Member mb2 = new Member(1002, "이순신");
		Member mb3 = new Member(1003, "김유신");
		Member mb4 = new Member(1003, "강감찬");
		
		mhs.addMember(mb1);
		mhs.addMember(mb2);
		mhs.addMember(mb3);
		mhs.addMember(mb4);
		
		mhs.showAllMember();
		
		mhs.removeMember(1001);
		mhs.showAllMember();
		
		

	}
}
