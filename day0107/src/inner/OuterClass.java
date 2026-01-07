package inner;

public class OuterClass {

	int field;
	
	void method() {
		class LocalClass {
			
			public LocalClass() {
				System.out.println("LocalClass 생성자가 호출되었습니다.");
			}
			
			int localField;
			
			void localMethod() {
				System.out.println("LocalClass.localMethod() 실행");
			}
		}
		
		LocalClass lc = new LocalClass();
		lc.localMethod();
	}
}
