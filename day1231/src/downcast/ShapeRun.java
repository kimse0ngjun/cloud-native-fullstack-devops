package downcast;

import java.util.ArrayList;

public class ShapeRun {
	
	ArrayList<Shape> sList = new ArrayList<Shape>();

	public static void main(String[] args) {
		
		ShapeRun sr = new ShapeRun();
		sr.addShape();
		System.out.println("=========== 다운 캐스팅 =============");
		sr.testCasting();
		
	}
	
	public void addShape() {
		sList.add(new Circle());
		sList.add(new Rectangle());
		
		for (Shape shape : sList) {
			shape.draw();
		}
	}
	
	public void testCasting() { // 강제 형변환
		for (int i = 0; i < sList.size(); i++) {
			
			Shape shape = sList.get(i);
			if (shape instanceof Circle) { // instanceof 연산자 객체비교를 함
				Circle circle = (Circle) shape;
				circle.circle();
			} else if (shape instanceof Rectangle) {
				Rectangle rectangle = (Rectangle) shape; // 부모를 자식에 넣는 것 -> 다운캐스팅
				rectangle.rectangle();
			} else {
				System.out.println("지원되는 타입이 아닙니다.");
			}
		}
	}
}
