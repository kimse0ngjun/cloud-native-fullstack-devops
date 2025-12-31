package cloud;

public class CustomerRun1 {
	public static void main(String[] args) {
//		Customer custom = new Customer(); // 객체 생성
		VIPCustomer vipCustom = new VIPCustomer();
		
		vipCustom.setCustomerID(10020);
		vipCustom.setCustomerName("김유신");
		vipCustom.setBonusPoint(10000);
		
		int customerID = vipCustom.getCustomerID();
		String customerName = vipCustom.getCustomerName();
		int bonusPoint = vipCustom.getBonusPoint();
		String customerGrade = vipCustom.getCustomerGrade();
		int calcPrice = vipCustom.calcPrice(bonusPoint); // Override를 호출하게 되면 자식 클래스의 변수를 가져옴
		
		System.out.println(customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "포인트입니다.");
		System.out.println("VIPCustomer.calcPrice = " + calcPrice);
		
		Customer vCustom = new VIPCustomer(); // 자식 -> 부모 (자동 형변환)
		
		int calcPri = vCustom.calcPrice(calcPrice); // 부모 생성자로 타입 선언 후 자식 생성자의 변수로 사용
		
		System.out.println("Customer.calcPrice = " + calcPri); // 100
	}
}
