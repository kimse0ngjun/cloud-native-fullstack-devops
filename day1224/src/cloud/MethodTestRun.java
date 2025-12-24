package cloud;

public class MethodTestRun {

	public static void main(String[] args) { // 실행 클래스, (main()를 가지고 있기 때문이다.
		
		MethodTest method = new MethodTest(); // MethodTest라는 클래스에서 MethodTest 생성자 호출 및 method 인스턴스 생성
		int returnValue = method.sum(1, 1);
		System.out.println("returnvalue = " + returnValue);
		
		method.method1(); // 메서드는 이름을 호출하여 사용
		
		// rValue 저장소 생성 - mas() 사용
		String rValue = method.mas();
		System.out.println(rValue);
	}
}
