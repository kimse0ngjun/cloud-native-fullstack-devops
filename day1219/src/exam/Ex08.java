package exam;

public class Ex08 {
	public static void main(String arg[]) {
		/*
		 * 문제8. 아래의 출력예와 같이 출력하는 자바프로그램을 작성하여 보시오.
		- 출력예 -
		A회사원의 본봉은 250만원이고 세금은 25만원일 때 실수령액은 225만원입니다.
		 */
		String a = "A회사원";
		int e = 250;
		int tax = 25;
		int etax = e - tax;
		
		System.out.println(a + "의 본봉은 " + e + "이고 세금은 " + tax + "만원일 때 실수령액은 " + etax + "만원입니다." );
	}
}
