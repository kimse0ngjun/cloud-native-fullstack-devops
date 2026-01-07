package inner;

public class OutInnerStaticRun {

	public static void main(String[] args) {

		OutClass.InnerStatic outInstatic = new OutClass.InnerStatic();
		// 인스턴스 멤버 ==> 객체를 생성하기 위해 생성자를 호출하여 사용
		outInstatic.instanceField1 = 10; 
		outInstatic.instanceMethod();
		
		// static 멤버 ==> 클래스 이름을 호출해서 사용
		OutClass.InnerStatic.staticField2 = 20;
		OutClass.InnerStatic.staticMethod();
	}

}
