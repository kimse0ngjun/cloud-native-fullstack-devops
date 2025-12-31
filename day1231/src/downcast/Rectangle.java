package downcast;

public class Rectangle extends Shape {

	@Override // 어노테이션
	void draw() {
		System.out.println("사각형을 그린다.");
	}
	
	void rectangle() {
		System.out.println("사격형 입니다.");
	}
}
