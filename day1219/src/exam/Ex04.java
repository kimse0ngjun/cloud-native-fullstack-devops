package exam;

public class Ex04 {
	public static void main(String arg[]) {
		/*
		 * 문제4. 아래 출력예와 같이 출력하는 자바프로그램을 작성하여 보시오. 단, 변수 이름은 키는 height, 몸무게는 weight, 두 값의 차는 sub라고 함.
			- 출력예 -
			키 : 180cm, 몸무게 : 70kg, 두 값의 차 : 110
		 */
		int height = 180;
		int weight = 70;
		int sub = height - weight;
		
		System.out.println("키 : " + height + "cm, 몸무게: " + weight + "kg, 두 값의 차: " + sub);
	}
}