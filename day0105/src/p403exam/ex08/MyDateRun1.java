package p403exam.ex08;

import p403exam.ex07.MyDate;

public class MyDateRun1 {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(5, 1, 2026);
		
		int hashCode = date1.hashCode();
		System.out.println("hashCode= " + hashCode);
	}
}
