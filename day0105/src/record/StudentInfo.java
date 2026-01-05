package record;

public record StudentInfo(int id, String name) { // 생성자 생성없이 record 코드 구현으로 가독성 높힐 수 있음
	
	public static String SCHOOL_NAME = "MY_SCHOOL";
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof StudentInfo std) {
			return this.id == std.id;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		StudentInfo stdInfo1 = new StudentInfo(12345, "최지원");
		StudentInfo stdInfo2 = new StudentInfo(12345, "김유신");
//		StudentInfo stdInfo3 = new StudentInfo(12346, "김유신");
		
		System.out.println("stdInfo1.equals(stdinfo2) = " + stdInfo1.equals(stdInfo2));
		System.out.println("stdInfo1.name() = " + stdInfo1.name());
		System.out.println("stdInfo1 = " + stdInfo1);
		
	}
}
