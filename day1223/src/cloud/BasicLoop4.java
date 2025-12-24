package cloud;

public class BasicLoop4 {

	public static void main(String[] args) {

		
		int dan, num;
		
		for (dan = 2; dan <= 9; dan++) { // 2 - 1번실행
			for (num = 1; num <= 9; num++) { // 1 - 9번 반복
				System.out.println(dan + "x" + num + "=" + dan*num);
			}
			System.out.println();
		}
	}

}
