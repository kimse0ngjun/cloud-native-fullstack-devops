package p321ex07;

public abstract class Car {
	
	public abstract void run();
	public abstract void refuel();
	public abstract void wiper();
	
	public void stop() {
		System.out.println("차가 멈춥니다."); 
	}
	
	public void takePassenger() {
		System.out.println("승객을 버스에 태웁니다.");
	}
	
	public void load() {
		System.out.println("짐을 싣습니다.");
	}

}
