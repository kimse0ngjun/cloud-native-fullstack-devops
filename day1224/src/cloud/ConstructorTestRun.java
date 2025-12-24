package cloud;

public class ConstructorTestRun {

	public static void main(String[] args) {

		ConstructorTest ct1 = new ConstructorTest();
		ConstructorTest ct2 = new ConstructorTest(100, "김성준");
		
		int num = ct2.getNum();
		String name = ct2.getName();
		System.out.println("num=" + num + ", name=" + name);
	}

}
