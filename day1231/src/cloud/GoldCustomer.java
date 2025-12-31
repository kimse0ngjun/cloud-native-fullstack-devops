package cloud;

public class GoldCustomer extends Customer {
	
	private int agentID;
	double saleRatio;
	
	public GoldCustomer() {
		super("SILVER", 0.01); // 부모생성자, 무조건 첫 라인에 정의, 부모에 대한 상속 처리 super() 사용 
		customerGrade = "GOLD";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("GoldCustomer() 생성자 호출");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	@Override
	public int calcPrice(int price) { // 자식 클래스가 부모 클래스가 가진 메서드를 재사용하는 것이 "오버라이드"
		return 10;
	}
}