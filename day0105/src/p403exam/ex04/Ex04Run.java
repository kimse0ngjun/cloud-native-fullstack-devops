package p403exam.ex04;

public class Ex04Run {
	public static void main(String[] args) {
		MyDog dog = new MyDog("멍멍이", "진돗개");
//		String dogName = dog.getName();
//		String dogType = dog.getType();
		String dog1 = dog.toString();
		String dog2 = dog.toString();
		
		System.out.println("'" + dog2 + " " + dog1 + "'");
	}
}
