package bookP208_9.ex08;

public class Ex08 {
	public static void main(String[] args) {
		Student edward = new Student("edward", 30000);
		Taxi taxi = new Taxi("카카오T");
		edward.takeTaxi(taxi);
		edward.showInfo();
		taxi.showInfo();
	}
}
