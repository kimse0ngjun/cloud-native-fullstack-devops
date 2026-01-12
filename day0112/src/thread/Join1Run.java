package thread;

public class Join1Run {

	public static void main(String[] args) throws Exception {
		
		Join1 j1 = new Join1(1, 50);
		j1.start();
		
		Join1 j2 = new Join1(51, 100);
		j2.start();
		 
		j1.join();
		j2.join();
		
		int total = j1.sum + j2.sum;
		
		System.out.println(j1.sum + " + " + j2.sum + " = " + total);

	}

}
