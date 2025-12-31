package downcast;

public class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("원을 그린다.");
	}
	
	void circle() { // 메소드
		System.out.println("원 입니다.");
	}
	
}
