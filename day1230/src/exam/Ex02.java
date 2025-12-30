package exam;

import java.util.Scanner;

public class Ex02 {
	/*
		문제2. 배열을 이용하여 성적을 처리하는 자바프로그램을 작성하시오. 단, 문제는 10문제이며 정답은 배열에 초기화 {1,3,3,4,2,3,1,2,3,4}시키시오.
		- 출력예 -
		답안을 입력하세요 : 1 2 3 4 2 3 4 1 3 4
		채점결과 : (정답) 7개 (오답) 3개 / 70점
	 */
	public static void main(String[] args) {
		int[] correct = new int[] {1,3,3,4,2,3,1,2,3,4};
		int[] ans = new int[10];
		int corCnt = 0, failCnt = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("답안을 입력하세요 : ");
		for (int i = 0; i < ans.length; i++) {
			ans[i] = Integer.parseInt(sc.nextLine());
			if (correct[i] == ans[i]) {
				corCnt++;
			} else {
				failCnt++;
			}
		}
		System.out.println("채점결과 : (정답) " + corCnt + "개 (오답) " + failCnt + "개 / " + corCnt*10 + "점");
	}
}
