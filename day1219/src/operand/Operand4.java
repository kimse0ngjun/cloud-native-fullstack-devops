package operand;

public class Operand4 {
	public static void main(String arg[]) {
//		int num = 0b00010100; // 20
		int num = 0b00000101; // 5 
		System.out.println("num= " + num);
		System.out.println("<<(왼쪽 이동) = " + (num <<= 2));
		System.out.println(">>(오른쪽 이동) = " + (num >>= 2));
		System.out.println(">>>(오른쪽 이동) = " + (num >>>= 2));
		num = num << 2;
		System.out.println("num= " + num);
	}
}
