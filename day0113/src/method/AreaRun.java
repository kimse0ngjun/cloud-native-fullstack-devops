package method;

import java.util.Scanner;

public class AreaRun {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Area area = new Area();
		System.out.print("원의 반지름을 입력하세요 : ");
		
		int r = Integer.parseInt(sc.nextLine());
		System.out.println("원의 둘레는 " + area.circumferenceCircle(r) + "이며 원의 면적은 " + 
		area.AreaCircle(r) + "입니다.");
	}

}
