package final1;

public class ConstantRun {

	public static void main(String[] args) {
		
		Constant ct = new Constant();
		ct.num = 100;
//		ct.Num = 1000000; // final 필드는 값을 변경 x
		
		System.out.println("Constant.num = " + ct.num);
	}

}
