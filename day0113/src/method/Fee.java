package method;
/*
	 문제4. 전기요금을 계산하는 자바프로그램을 작성하시오. 기본요금(산업용)은 370원으로 하고 kw당 요금은 52.0원, 세금은 전체요금의 5%로 한다. 전기요금=기본요금+(사용량*kw당 요금)+세금이다. 단, 전기요금을 계산하는 부분은 메소드를 사용하여 풀이하시오. (매개변수 1개 (전기사용량), 리턴값 실수값)
	- 출력예 -
	전기사용량을 입력하세요 (kw) : 500
	사용하신 전기요금은 27688.5원입니다.
 */
public class Fee {

	final double PAY = 370;
	final double KW_PAY = 52.0;
	
	//메서드 작성 : double ElecPay(int kw)
	
	public double ElecPay(int kw) {
		
		return PAY + (KW_PAY * kw);
	}
	
}
