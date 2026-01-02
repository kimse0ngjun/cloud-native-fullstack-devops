package interface4;

public class MyClassRun {

	public static void main(String[] args) {

		MyClass myclass = new MyClass();
		myclass.x();
		myclass.y();
		myclass.method();
		
		System.out.println("===========================");
//		MyInterface mInter = new MyClass();
		MyInterface mInter = myclass;
		mInter.x();
		mInter.y();
		mInter.method();
	}

}
