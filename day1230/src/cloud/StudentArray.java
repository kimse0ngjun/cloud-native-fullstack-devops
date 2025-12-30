package cloud;

public class StudentArray {
	public static void main(String[] args) {
		
		Student[] sts = new Student[3]; // 
		sts[0] = new Student(1001, "홍길동");
		sts[1] = new Student(1002, "배영진");
		sts[2] = new Student(1003, "김배수");
		
		// 1. 각각 출력 - .showinfo() 사용
//		sts[0].showInfo();
//		sts[1].showInfo();
//		sts[2].showInfo();

		// 2. 반복문 사용
		for (int i = 0; i < sts.length; i++) { // 3번 반복
			sts[i].showInfo();
		}
	}
}
