package exam.ex08;

public class MemberArrayListRun {
	
	public static void main(String[] args) {
	
		MemberArrayList mal = new MemberArrayList();
		
		Member n1 = new Member(1001, "홍길동");
		Member n2 = new Member(1002, "이순신");
		Member n3 = new Member(1003, "강감찬");
		
		mal.addMember(n1);
		mal.addMember(n2);
		mal.addMember(n3);
		
		mal.showAllMember();
		
		mal.removeMember(1001);
		
		mal.showAllMember();
		
		mal.insertMember(n1, 1);
		
		mal.showAllMember();
	} 

}
