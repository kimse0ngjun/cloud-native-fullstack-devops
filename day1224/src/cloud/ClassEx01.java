package cloud;

public class ClassEx01 {
	
	public static void main(String[] args) { // 메인 메서드를 가지고 있는 클래스를 실행 클래스라고 한다.
		Car c1 = new Car(); // c1가 인스턴스(객체 생성), has a(포함), is a(상속)
		String color = c1.color;
		String type = c1.type;
		System.out.println("color = " + color);
		System.out.println("type = " + type);
		
		Car c2 = new Car(); // c2 인스턴스 생성 후 new Car()로 객체 생성
		
		System.out.println("c1=" + c1.toString()); // Call by Reference
		System.out.println("c2=" + c2.toString());
		
		System.out.println("==================================================");
		
		// Student : 클래스, 기본 생성자를 호출, 
		// s1 : 생성된 객체를 가리키는 참조 변수, 
		// new Student() : 그 설계도로 객체(인스턴스) 생성
		Student s1 = new Student(); // 클래스를 이용한 객체(인스턴스) 생성
		System.out.println("snum = " + s1.snum + "\n" + s1.name + "\n" + s1.test);
		
		
	}
}
