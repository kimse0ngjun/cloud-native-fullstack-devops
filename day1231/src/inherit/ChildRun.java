package inherit;

public class ChildRun {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		Parent parent = child; // 자동 형변환 - 다형성의 특징
		parent.method1(); // Parent.method1()
		parent.method2(); // Child.method2() - 자식 메서드 실행
//		parent.method3(); 자식 메서드는 사용 불가능
		child.method1();
		
	}

}
