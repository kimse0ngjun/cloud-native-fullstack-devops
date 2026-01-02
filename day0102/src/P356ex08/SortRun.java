package P356ex08;

import java.io.IOException;
import java.util.Scanner;

public class SortRun {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정렬 방식을 선택하세요. B : BubbleSort / H : HeapSort / Q : QuickSort");
		
		String ch = sc.nextLine();
//		int ch = System.in.read();
		Sort sort = null;
		
//		if (ch == "B" || ch == "b") {
//			sort = new BubbleSort();
//		} else if (ch == "H" || ch == "h") {
//			sort = new HeapSort();
//		} else if (ch == "Q" || ch == "q") {
//			sort = new QuickSort();
//		} else {
//			System.out.println("지원하지 않는 기능입니다.");
//			return;
//		}
		
		switch (ch) {
		case "B", "b":
			sort = new BubbleSort();
			break;	
		case "H", "h":
			sort = new HeapSort();
			break;
		case "Q", "q":
			sort = new QuickSort();
			break;
		default:
			System.out.println("지원하지 않는 기능입니다.");
			break;
		}
		
		int [] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}

}
