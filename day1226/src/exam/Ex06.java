package exam;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		/*
		 문제6. 아래 출력예와 같이 난수 생성 함수를 이용하여 컴퓨터로 여러가지 시뮬레이션하는 것을 흔히 몬테까를로(Monte Carlo) 시뮬레이션이라고 한다. 그렇다면 컴퓨터가 동전을 던지고 사용자는 앞면, 뒷면을 맞추는 자바프로그램을 작성하시오. 
		- 출력예 -
		***********************************
		*    동전 앞면/뒷면 맞추기 게임    *
		***********************************
		동전의 앞면=1, 뒷면=2, 종료=-1 입력 : 1
		컴퓨터 : 앞면 / 사용자 : 앞면 --> 1승 0패
		--------------------------------------------
		동전의 앞면=1, 뒷면=2, 종료=-1 입력 : 2
		컴퓨터 : 앞면 / 사용자 : 뒷면 --> 1승 1패
		--------------------------------------------
		동전의 앞면=1,뒷면=2, 종료=-1 입력 : -1
		게임종료 (전체 1승 1패)
		 */
		Scanner sc = new Scanner(System.in);
		
		int wCnt = 0;
		int fCnt = 0;
		
		System.out.println("********************************");
		System.out.println("    동전 앞면/뒷면 맞추기 게임     ");
		System.out.println("********************************");
		
		while (true) {
			int num = (int) (Math.random()*2) + 1; // 0.0 ~ 0.9
			
			System.out.print("동전의 앞면=1, 뒷면=2, 종료=-1 입력 : ");
			int coin = Integer.parseInt(sc.nextLine());
			
			switch (coin) {
			case 1:
				if (coin == num) {
					wCnt++; // wCnt = wCnt + 1;
					System.out.println("컴퓨터 : 앞면 / 사용자 : 앞면 --> " + wCnt + "승 " + fCnt + "패");
				} else {
					fCnt++;
					System.out.println("컴퓨터 : 뒷면 / 사용자 : 앞면 --> " + wCnt + "승 " + fCnt + "패");
				}
				break;
			case 2:
				if (coin == num) {
					wCnt++; // wCnt = wCnt + 1;
					System.out.println("컴퓨터 : 앞면 / 사용자 : 앞면 --> " + wCnt + "승 " + fCnt + "패");
				} else {
					fCnt++;
					System.out.println("컴퓨터 : 뒷면 / 사용자 : 앞면 --> " + wCnt + "승 " + fCnt + "패");
				}
				break;
			case -1:
				System.out.println("게임종료 (전체 " + wCnt + "승 " + fCnt + "패)");
				System.exit(0);
				break;
			default:
				System.out.println("(1,2,-1)의 값들 중에서 입력해주세요.");
				break;
			}
		}
	}
}
