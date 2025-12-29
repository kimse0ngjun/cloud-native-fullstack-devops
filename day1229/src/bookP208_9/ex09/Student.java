package bookP208_9.ex09;

public class Student {

	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	int cardNumber;
	
	
	public Student() {
		serialNum++;
		studentID = serialNum;
		cardNumber = studentID + 100;
	}


	public static int getSerialNum() {
		return serialNum;
	}


	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
		
}
