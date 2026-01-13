package method;

public class Salary {

	/*
	 문제2. A회사원의 본봉이 150만원, 보너스 60만원, 세금이 전체 수입의 9%, 매월 입금되는 금액은 전체 수입에서 세금을 뺀 금액이다. 메소드를 사용하여 아래 출력예와 같이 출력되는 자바프로그램을 작성하시오.
	- 출력예- 
	A회사원의 실 입금액은 191.1만원입니다.
	// 메서드 int sum(), double tax(int sum)
	*/
	
	int salary, bonus;
	
	public int sum(int salary, int bonus) {
		
		return salary + bonus;
	}
	
	public double tax(int sum) {
		
		return sum*0.91;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}
