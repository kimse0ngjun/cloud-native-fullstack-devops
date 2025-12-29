package bookP208_9.ex06;

public class CardCompany {

	private CardCompany() {}
	
	private static CardCompany instance = new CardCompany();
	
	
	// singleton 사용
	public static CardCompany getInstance() {
		if (instance == null) {
			instance = new CardCompany();
		}
		
		return instance;
	}
	
	public Card createCard() {
		Card card = new Card();
		return card;
	}
}
