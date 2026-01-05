package cloud;

public enum GameLevel { // enum은 객체(인스턴스)를 생성할 수 없다.

	BEGINNER_LEVEL(1, "초보자"), 
	ADVANCED_LEVEL(2, "숙련자"), 
	SUPER_LEVEL(3, "고수");
	
	private int level;
	private String hint;

	private GameLevel(int level, String hint) {
		this.level = level;
		this.hint = hint;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public String getHint() {
		return hint;
	}
	
	
	public static void main(String[] args) {
		GameLevel[] gameLv1 = GameLevel.values();
		for (GameLevel gameLevel : gameLv1) {
			System.out.println(gameLevel.toString() + " : " + gameLevel.getLevel() + ", " + gameLevel.getHint());
		}
		
		GameLevel gameLv2 = GameLevel.valueOf("BEGINNER_LEVEL");
		int level = gameLv2.getLevel();
		String hint = gameLv2.getHint();
		
		System.out.println("level = " + level + ", hint = " + hint);
	}
	
}
