package cloud;

public class IfEx03 {
	public static void main(String[] arg) {
		
		int num1 = 10, num2 = 20, max1, max2;
		
		if (num1 > num2) {
			max1 = num1;
		} else { 
			max1 = num2;
		}
		
		System.out.println("max1 = " + max1);
		
		max2 = (num1 > num2) ? num1 : num2;
		System.out.println("max2 = " + max2);
	}
}
