package inner1st;


public class ARun {

	public static void main(String[] args) {
		
		A a = new A(); // A 클래스 사용
		a.method(); // D 클래스 사용
		
		System.out.println();
//		A.B ab = new A.B();
		A.B ab = a.new B();
		ab.method1();
		
		System.out.println();
		
		A.C ac = new A.C();
		ac.method1();
		A.C.method2();
		
		System.out.println();
		
	}
}
