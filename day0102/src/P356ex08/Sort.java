package P356ex08;

public interface Sort {

	void ascending(int[] arr);
	void descending(int[] arr);
	
	default void description() { // Java 8부터 default 예약어를 명시하면 기본 메서드로 사용 가능
		System.out.println("정렬 알고리즘 입니다.");
	}
}
