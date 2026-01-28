package cloud;

public class IfEx02 {
	public static void main() {
		int age = 15;
		
		if (age < 8) {
			System.out.println("유치원에 다닙니다.");
		} else if (age < 14) {
			System.out.println("초등학교에 다닙니다.");
		} else if (age < 17) {
			System.out.println("중학교에 다닙니다.");
		} else {
			System.out.println("고등학교에 다닙니다.");
		}
	}
}
