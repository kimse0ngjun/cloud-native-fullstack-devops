package cloud;


public class BookCopy1 {
	public static void main(String[] args) {
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("비전공자들도 이해할 수 있는 IT 전공 지식", "이해영");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3); // bookArray1의 0번 인덱스부터 bookArray2의 0번 인덱스로 3개 복사
		
//		bookArray2[0] = new Book("", "");
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
	}
}
