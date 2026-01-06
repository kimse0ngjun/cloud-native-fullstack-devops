package exam.ex02;

public class SoundableExam {
	
	private static void printSound(Soundable soundable) {
//		Cat cat = new Cat();
//		Dog dog = new Dog();
//		cat.sound();
//		dog.sound();
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {

		printSound(new Cat());
		printSound(new Dog());
	}

}
