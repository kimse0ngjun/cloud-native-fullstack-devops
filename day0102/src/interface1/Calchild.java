package interface1;

public class Calchild implements Calc {

	@Override
	public void method1() {
		System.out.println("CalChild.method1() 실행");
	}

	@Override
	public void method2() {
		System.out.println("CalChild.method2() 실행");
	}

}
