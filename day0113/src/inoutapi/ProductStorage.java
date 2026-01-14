package inoutapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductStorage {

	private List<Product> list = new ArrayList<Product>();
	private Scanner sc = new Scanner(System.in);
	private int counter; // pno 카운터
	
	public void showMenu() { // 메뉴 구성, 출력 결과를 보고 코드 작성
		while (true) {
			System.out.println("------------------------");
			System.out.println("1.등록  | 2.목록 | 3.종료");
			System.out.println("------------------------");
			
			System.out.print("선택 : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch (menuNum) {
			case 1: registerProduct();
				break;
			case 2: showProduct();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				return; // false
			default:
				System.out.println("메뉴에 있는 번호만 선택해 주세요.");
				break;
			}
		}
	}
	
	public void registerProduct() { // 1. 등록
		
		try {
			Product pd = new Product();
			pd.setPno(++counter);
			
			System.out.print("상품명 : ");
			pd.setName(sc.nextLine());
			
			System.out.print("가격 : ");
			pd.setPrice(Integer.parseInt(sc.nextLine()));
			
			System.out.print("재고 : ");
			pd.setStock(Integer.parseInt(sc.nextLine()));
			
			list.add(pd); // 리스트에 저장
		} catch (Exception e) {
			System.out.println("등록 에러 : " + e.getMessage());
		}
	}
	
	public void showProduct() { // 2. 목록
		for (Product product : list) {
			System.out.println(product.getPno() + "\t" + product.getName() + "\t" 
					+ product.getPrice() + "\t" + product.getStock());
		} 
		
	}
	
	
}
