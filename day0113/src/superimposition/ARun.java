package superimposition;

public class ARun {

	public static void main(String[] args) {

		A a = new A(); // 인스턴스 멤버
		
		A.B b = a.new B();
		b.field1 = 3; 
		b.method1();
		
		A.B.field2 = 3; // static 멤버
		A.B.method2();
		
		A.C c = new A.C(); 
		c.field1 = 3;
		A.C.field2 = 3; // static 멤버
		c.method1();
		A.C.method2();
		
		a.method();
	}

}
