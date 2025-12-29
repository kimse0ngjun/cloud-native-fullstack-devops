package bookP208_9.ex06;

public class Ex06 {
//	public static int serialNum = 1000;
//	public int cardID;
//	public String cardName;
//	
//	public String getCardName() {
//		return cardName;
//	}
//	
//	public void setCardName(String name) {
//		cardName = name;
//	}
	
	public static void main(String[] args) {
		CardCompany company = CardCompany.getInstance();
		
		Card mycard1 = company.createCard();
		Card mycard2 = company.createCard();
		
		System.out.println(mycard1.getCardNum());
		System.out.println(mycard2.getCardNum());
		
		
		
	}
}
