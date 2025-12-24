package cloud;

public class BasicLoop {
	public static void main(String[] args) {

		System.out.print("1");
		System.out.print("2");
		System.out.print("3");
		System.out.print("4");
		System.out.print("5");	
		System.out.println();	
		
		// for 실행 순서
		// 1) i = 0 : 시작값
		// 2) i < 5 : 조건식
		// 3) System.out.println("1");
		// 4) i++ 
		// 5) i = 0,1,2,3,4,5 
		// 6) 5가되는 순간 5<5가 거짓이므로 for 구문 종료
		for (int i = 0; i < 5; i++) { 
			System.out.print(i);
		}
		System.out.println();
		
		
		// while
		int num = 0;
		
		while (num < 5) {
			System.out.print(num);
			num++;
//			System.out.println(num);
		}
		
		System.out.println();
		
		while (true) {
			System.out.print("1");
			break;
		}
		
		System.out.println();
		
		// do-while
		do {
			System.out.println("do 구문은 조건이 false여도 한번은 실행한다.");
		} while (false);
	}
}
