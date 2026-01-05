package cloud;

//import java.io.Serializable;
import java.util.Date;

import record.Student;

public class StudentRun {

	public static void main(String[] args) {

//		Number nb = new Number(); // 추상 클래스는 객체 생성 x
		Student nb = new Student();
		Object obj = null; // 대입되는 값에 따라 타입이 정해짐
		Object odd = nb;
		nb.doubleValue();
		
		Date date = new Date();
		date.getDate(); // 없어질 수도 있는 코드 - Deprecated 
		
		Integer in1 = new Integer(0);
		Integer in2 = new Integer("100");
		in1.intValue();
		in2.toString();
		
		int integerVal = Integer.bitCount(10); // 2진수: 1010 -> 1의 개수: 2개
		System.out.println("Integer.bitCount = " + integerVal);
		
//		Serializable
		
		Student st1 = new Student();
		Student st2 = st1; // 복사
		Student st3 = new Student();
		
		System.out.println("st1 = " + st1.toString()); // 같은 주소값
		System.out.println("st2 = " + st2.toString());
		System.out.println("st3 = " + st3.toString()); // st1이랑 다른 주소값
		
		boolean StudentCompare = st3.equals(obj); // .equals : 값 비교
		boolean StudentCompare1 = st3.equals(odd); // .equals : 값 비교
		System.out.println("student 객체 비교(st3.equal(st1)) = " + StudentCompare);
		System.out.println(StudentCompare1);
	}

}
