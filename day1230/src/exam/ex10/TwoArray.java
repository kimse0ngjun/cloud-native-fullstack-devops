package exam.ex10;

public class TwoArray {
	public static void main(String[] args) {
		
		int[][] intArray1 = {{1,2,3},
							{4,5,6}};
		
		System.out.println(intArray1[0][0]); // 1
		System.out.println(intArray1[0][1]); // 2
		System.out.println(intArray1[0][2]); // 3
		System.out.println(intArray1[1][0]); // 4		
		System.out.println(intArray1[1][1]); // 4		
		System.out.println(intArray1[1][2]); // 4		
		int[][] intArray2 = new int[3][3];
		
		for (int i = 0; i < intArray1.length; i++) {
			for (int j = 0; j < intArray1[i].length; j++)
				System.out.println("intArray1[" + i + "] = [" + j + "] = " + intArray1[i][j]);
	
		}
		
//		System.out.println("intArray.length = " + intArray1.length);		
//		System.out.println(intArray1[1][1]);		
//		System.out.println("intArray.length = " + intArray2.length);
		}
}
