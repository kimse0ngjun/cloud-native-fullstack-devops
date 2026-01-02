package interface4;

public class MyClass implements MyInterface{

	@Override
	public void x() {
		System.out.println("MyClass.x() 실행");
	}

	@Override
	public void y() {
		System.out.println("MyClass.y() 실행");
	}

	@Override
	public void method() {
		System.out.println("MyClass.method() 실행");
	}

}
