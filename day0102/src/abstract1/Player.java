package abstract1;

public class Player {
	
	private PlayerLevel level; // has - a 관계
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() { // PlayerLevel level;
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) { // <- 매개변수 다형성
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
