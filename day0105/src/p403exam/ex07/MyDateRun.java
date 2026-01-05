package p403exam.ex07;

public class MyDateRun {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(5, 1, 2026);
		MyDate date2 = new MyDate(5, 1, 2026);
		
//		System.out.println(date1.equals(date2));
		boolean bool = date1.equals(date2);
		System.out.println("bool=" + bool);
	}
}
