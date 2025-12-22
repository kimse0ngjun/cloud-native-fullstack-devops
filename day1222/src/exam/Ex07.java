package exam;

import java.util.Scanner;

public class Ex07 {
	public static void main(String args[]) {
		/*
		 * 문제7. 국어, 영어, 수학점수와 합계를 출력하는 자바프로그램을 작성하여 보시오.
			-출력예 -
			국어, 영어, 수학 점수를 차례대로 입력하세요 : 85 95 70
			국어 : 85점, 영어 : 95점, 수학 : 70점
			세 과목의 합계는 250점이고 평균은 83.3333점입니다.
		 */
		System.out.print("국어, 영어, 수학 점수를 차례대로 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int korean = sc.nextInt();
		int math = sc.nextInt();
		int english = sc.nextInt();
		
		int sum = korean + math + english;
		
		double avg = (double) ((sum)/3f) ;
		String str = String.format("%.3f", avg);
		System.out.println("세 과목의 합계는 " + sum + "점이고 평균은 " + str + "점입니다.");
	}
}
