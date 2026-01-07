package inner;

public class OutClass {
	
	static class InnerStatic { // static class라고 해서 무조건 static 형으로 구성하는 것은 아님
		
		public InnerStatic() {
			
		}
		
		int instanceField1; // 객체 생성해야지 쓸 수 있음
		static int staticField2; // 객체 생성 없이 사용가능
		
		void instanceMethod() {
		
		}
		
		static void staticMethod() {
			
		}
	}
}
