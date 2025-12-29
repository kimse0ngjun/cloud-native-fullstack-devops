package cloud;

public class SingletonRun {
	public static void main(String[] args) {
//		Singleton sgt = new Singleton(); // 접근 제한자 private
		Singleton.getInstance();
		Singleton sgt1 = Singleton.getInstance();
		Singleton sgt2 = Singleton.getInstance();
		
		System.out.println("sgt1 = " + sgt1.toString());
		System.out.println("sgt2 = " + sgt2.toString());
	}
}
