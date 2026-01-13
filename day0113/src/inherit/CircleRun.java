package inherit;

import java.util.Scanner;

public class CircleRun {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		Circle c = new Circle();
		CircleVolumn c1 = new CircleVolumn();
		
		System.out.print("반지름을 입력하세요 : ");
			
		int r = Integer.parseInt(sc.nextLine());
		double cirM = c.circumferenceCircle(r);
		double cirA = c.AreaCircle(r);
		double cirV = c1.CircleVolume(r);
		
		System.out.println("원의 둘레는 " + cirM + "이고 면적은 " + cirA + "입니다.");
		System.out.println("구의 반지름은 " + r + "이며 부피는" + cirV + "입니다.");
	}

}
