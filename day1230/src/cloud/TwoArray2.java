package cloud;

public class TwoArray2 {
	public static void main(String[] args) {
		
		int[][] num = new int[][] {{1,2,3},{4,5},{6,7,8}};
		
		System.out.println("num.length = " + num.length); // 2차원 길이
		System.out.println("num[0].length = " + num[0].length); // 0행의 길이
		System.out.println("num[1].length = " + num[1].length); // 1행의 길이
		System.out.println("num[2].length = " + num[2].length); // 2행의 길이
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j< num[i].length; j++) {
//				System.out.println(num[i][j]);
				System.out.print("num[" + i + "][" + j + "] = " + num[i][j] + ", "); // 0행의 길이
			}
			System.out.println("num[0].length = " + num[0].length); // 0행의 길이
		}
	}
}
