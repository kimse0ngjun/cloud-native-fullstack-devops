package inner1st;

public class A {

	public A() {
		System.out.println("A 생성자 호출로 객체가 생성되었습니다.");
	}
	
	class B {
		public B() {
			System.out.println("B 생성자 호출로 객체가 생성되었습니다.");
		}
		
		int field1;
		void method1() {
			System.out.println("B.method1() 실행");
		}
	}
	
	static class C {
		public C() {
			System.out.println("C 생성자 호출로 객체가 생성되었습니다.");
		}
		
		int field1;
		static int field2;
		
		void method1() {
			System.out.println("C.method1() 실행");
		}
		
		static void method2() {
			System.out.println("C.method2() 실행");
		}
	}
	
	void method() {
		class D {
			public D() {
				System.out.println("D 생성자 호출로 객체가 생성되었습니다.");
			}
			
			int field1;
			void method1() {
				System.out.println("D.method1() 실행");
			}
		}
		
		D d = new D();
		d.field1 = 10;
		d.method1();
	}
}
