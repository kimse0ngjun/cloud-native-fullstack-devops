package exam;

public class Ex05 {
	public static void main(String arg[]) {
		/*
		 * 문제5. 사용자로부터 세 개의 정수를 변수 x, y, z에 받은 후에 xy+z를 계산하여 출력하는 자바프로그램을 작성하여 보시오.
		- 출력예 -
		세 개의 정수는 각각 3, 4, 5 이며 xy+z의 값은 17입니다.
		 */
		int x;
		x = 3;
		int y;
		y = 4;
		int z;
		z = 5;
		
		int cell = x * y + z;
		
		System.out.println("세 개의 정수는 각각 " + x + ", " + y + ", " + z + "이며 xy+z의 값은 " + cell + "입니다.");
	}
}
